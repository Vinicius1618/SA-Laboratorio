package laboratoriosenai;
import java.util.*;
import java.sql.Connection;
import Util.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Equipamento {

    public Equipamento() {
    }

    private int codAtivo;

    private String tipoEquipamento;

    private String descrEquipamento;

    private String sistemaOperacional;

    private int codSoftware;

    private String codLaboratorio;

    private String sitPatrimonio;

    private Date dataEntrAtivo;

    private Date dataBaixaAtivo;
    

    public boolean incluirEquipamento() {
       String sql =" insert into Equipamento (codSoftware, codLaboratorio, tipoEquipamento, descrEquipamento, sistemaOperacional, sitPatrimonio, dataEntrAtivo, dataBaixaAtivo) ";
       sql+= " values(?,?,?,?,?,?,?,?)";
       Connection con = Conexao.conectar();
        try {
           PreparedStatement  stm=con.prepareStatement(sql);
           stm.setInt(1, this.codSoftware);
           stm.setString(2, this.codLaboratorio);
           stm.setString(3, this.tipoEquipamento);
           stm.setString(4, this.descrEquipamento);
           stm.setString(5, this.sistemaOperacional);
           stm.setString(6, this.sitPatrimonio);
           stm.setDate(7, (java.sql.Date) this.dataEntrAtivo);
           stm.setDate(8, (java.sql.Date) this.dataBaixaAtivo);
           stm.execute();
        } catch (SQLException ex) {
            System.out.println("Error "+ex.getMessage()+sql);
            return false;
        }
        return true;
    }

    public void alterarEquipamento() {
       String sql =" UPDATE Equipamento ";
       sql+= "SET tipoEquipamento =?, ";
       sql+= " descrEquipamento =?, ";
       sql+= " sistemaOperacional = ?, ";
       sql+=" sitPatrimonio = ?, ";
       sql+=" dataBaixaAtivo = ?, ";
       sql+=" codLaboratorio = ?,";
       sql+=" codSoftware = ? ";
       sql+=" WHERE codAtivo = ? ";
       Connection con = Conexao.conectar();
        try {
           PreparedStatement  stm=con.prepareStatement(sql);
           stm.setString(1, this.tipoEquipamento);
           stm.setString(2, this.descrEquipamento);
           stm.setString(3, this.sistemaOperacional);
           stm.setString(4, this.sitPatrimonio);
           stm.setDate(5, (java.sql.Date) this.dataBaixaAtivo);
           stm.setString(6, this.codLaboratorio);
           stm.setInt(7, this.codSoftware);
           stm.setInt(8, this.codAtivo);
           stm.execute();
           System.out.println("Deu bom");
        } catch (SQLException ex) {
            System.out.println("Error "+ex.getMessage()+sql);
        }
    }

    public boolean excluirEquipamento() {
       String sql =" DELETE FROM Equipamento ";
       sql+= " WHERE codAtivo = ? ";
       Connection con = Conexao.conectar();
        try {
           PreparedStatement  stm=con.prepareStatement(sql);
           stm.setInt(1, this.codAtivo);
           stm.execute();
        } catch (SQLException ex) {
            System.out.println("Error "+ex.getMessage()+sql);
            return false;
        }
        return true;
    }

    public Equipamento consultarEquipamento(int pCodAtivo) {
       Connection con = Conexao.conectar();
       String sql=" select codAtivo, codSoftware, codLaboratorio, tipoEquipamento, descrEquipamento, sistemaOperacional, sitPatrimonio, dataEntrAtivo, dataBaixaAtivo ";
       sql+=" from Equipamento ";
       sql+=" where codAtivo = ? ";
       Equipamento equ = null;
       try {
           PreparedStatement  stm=con.prepareStatement(sql);
           stm.setInt(1, pCodAtivo);
           ResultSet rst = stm.executeQuery();
           if(rst.next()){
               equ = new Equipamento();
               equ.setCodAtivo(rst.getInt("codAtivo"));
               equ.setCodSoftware(rst.getInt("codSoftware"));
               equ.setCodLaboratorio(rst.getString("codLaboratorio"));
               equ.setTipoEquipamento(rst.getString("tipoEquipamento"));
               equ.setdescrEquipamento(rst.getString("descrEquipamento"));
               equ.setSistemaOperacional(rst.getString("sistemaOperacional"));
               equ.setSitPatrimonio(rst.getString("sitPatrimonio"));
               equ.setDataEntrAtivo(rst.getDate("dataEntrAtivo"));
               equ.setDataBaixaAtivo(rst.getDate("dataBaixaAtivo"));
           }
        } catch (SQLException ex) {
            System.out.println("Error "+ex.getMessage()+sql);
        }
        return equ;
    }
    public List<Equipamento> consultarEquipamentos() {
        List<Equipamento> lista = new ArrayList<>();
        Connection con = Conexao.conectar();
       String sql=" select codAtivo, codSoftware, codLaboratorio, tipoEquipamento, descrEquipamento, sistemaOperacional, sitPatrimonio, dataEntrAtivo, dataBaixaAtivo ";
       sql+= "from equipamento ";
       sql+= " order by codAtivo ";
       try {
           PreparedStatement  stm=con.prepareStatement(sql);
           ResultSet rst = stm.executeQuery();
           while(rst.next()){
              Equipamento equ = new Equipamento();
              equ.setCodAtivo(rst.getInt("codAtivo"));
              equ.setCodSoftware(rst.getInt("codSoftware"));
              equ.setCodLaboratorio(rst.getString("codLaboratorio"));
               equ.setTipoEquipamento(rst.getString("tipoEquipamento"));
               equ.setdescrEquipamento(rst.getString("descrEquipamento"));
               equ.setSistemaOperacional(rst.getString("sistemaOperacional"));
               equ.setSitPatrimonio(rst.getString("sitPatrimonio"));
               equ.setDataEntrAtivo(rst.getDate("dataEntrAtivo"));
               equ.setDataBaixaAtivo(rst.getDate("dataBaixaAtivo"));
              lista.add(equ);
           }
        }catch (SQLException ex) {
            System.out.println("Error "+ex.getMessage()+sql);
        }
        return lista;
    }

    public int getCodAtivo() {
        return codAtivo;
    }

    public void setCodAtivo(int codAtivo) {
        this.codAtivo = codAtivo;
    }

    public String getTipoEquipamento() {
        return tipoEquipamento;
    }

    public void setTipoEquipamento(String tipoEquipamento) {
        this.tipoEquipamento = tipoEquipamento;
    }

    public String getdescrEquipamento() {
        return descrEquipamento;
    }

    public void setdescrEquipamento(String descrEquipamento) {
        this.descrEquipamento = descrEquipamento;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public int getCodSoftware() {
        return codSoftware;
    }

    public void setCodSoftware(int codSoftware) {
        this.codSoftware = codSoftware;
    }

    public String getCodLaboratorio() {
        return codLaboratorio;
    }

    public void setCodLaboratorio(String codLaboratorio) {
        this.codLaboratorio = codLaboratorio;
    }

    public String getSitPatrimonio() {
        return sitPatrimonio;
    }

    public void setSitPatrimonio(String sitPatrimonio) {
        this.sitPatrimonio = sitPatrimonio;
    }

    public Date getDataEntrAtivo() {
        return dataEntrAtivo;
    }

    public void setDataEntrAtivo(Date dataEntrAtivo) {
        this.dataEntrAtivo = dataEntrAtivo;
    }

    public Date getDataBaixaAtivo() {
        return dataBaixaAtivo;
    }

    public void setDataBaixaAtivo(Date dataBaixaAtivo) {
        this.dataBaixaAtivo = dataBaixaAtivo;
    }

}