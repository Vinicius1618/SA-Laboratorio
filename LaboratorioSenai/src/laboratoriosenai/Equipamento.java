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

    private int codLaboratorio;

    private String sitPatrimonio;

    private Date dataEntrAtivo;

    private Date dataBaixaAtivo;
    
    private String codBloco;

    public boolean incluirEquipamento() {
       String sql =" insert into Equipamento (codSoftware, codBloco, codLaboratorio, tipoEquipamento, descrEquipamento, sistemaOperacional, sitPatrimonio, dataEntrAtivo, dataBaixaAtivo) ";
       sql+= " values(?,?,?,?,?,?,?,?,?)";
       Connection con = Conexao.conectar();
        try {
           PreparedStatement  stm=con.prepareStatement(sql);
           stm.setInt(1, this.codSoftware);
           stm.setString(2, this.codBloco);
           stm.setInt(3, this.codLaboratorio);
           stm.setString(4, this.tipoEquipamento);
           stm.setString(5, this.descrEquipamento);
           stm.setString(6, this.sistemaOperacional);
           stm.setString(7, this.sitPatrimonio);
           stm.setDate(8, (java.sql.Date) this.dataEntrAtivo);
           stm.setDate(9, (java.sql.Date) this.dataBaixaAtivo);
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
       sql+= "descrEquipamento =?, ";
       sql+= "sistemaOperacional = ?, ";
       sql+="sitPatrimonio = ?, ";
       sql+="dataEntrAtivo = ?, ";
       sql+="dataBaixaAtivo = ? ";
       //sql+="codBloco = ?, ";
       //sql+="codLaboratorio = ?,";
       //sql+="codSoftware = ? ";
       sql+=" WHERE codAtivo = ? ";
       Connection con = Conexao.conectar();
        try {
           PreparedStatement  stm=con.prepareStatement(sql);
           stm.setString(1, this.tipoEquipamento);
           stm.setString(2, this.descrEquipamento);
           stm.setString(3, this.sistemaOperacional);
           stm.setString(4, this.sitPatrimonio);
           stm.setDate(5, (java.sql.Date) this.dataEntrAtivo);
           stm.setDate(6, (java.sql.Date) this.dataBaixaAtivo);
           //stm.setString(7, this.codBloco);
           //stm.setInt(8, this.codLaboratorio);
           //stm.setInt(9, this.codSoftware);
           stm.setInt(7, this.codAtivo);
           stm.execute();
            System.out.println("Deu bom");
        } catch (SQLException ex) {
            System.out.println("Error "+ex.getMessage()+sql);
        }
    }

    public void excluirEquipamento() {
        // TODO implement here
    }

    public void consultarEquipamento() {
        // TODO implement here
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

    public int getCodLaboratorio() {
        return codLaboratorio;
    }

    public void setCodLaboratorio(int codLaboratorio) {
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

    public String getCodBloco() {
        return codBloco;
    }

    public void setCodBloco(String codBloco) {
        this.codBloco = codBloco;
    }

}