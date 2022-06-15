package laboratoriosenai;
import java.sql.Connection;
import Util.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Laboratorio extends Equipamento {

    public Laboratorio() {
    }
    private String codBloco;
    
    private int codLaboratorio;

    private String tipoLaboratorio;

    private String descrLaboratorio;
    
    private String situacaoLaboratorio;

    public boolean incluirLaboratorio() {
       String sql =" insert into laboratorio (codBloco,codLaboratorio,tipoLaboratorio,descrlaboratorio,situacaolaboratorio) ";
       sql+= " values(?,?,?,?,?)";
       java.sql.Connection con = Conexao.conectar();
        try {
           PreparedStatement  stm=con.prepareStatement(sql);
           stm.setString(1, this.codBloco);
           stm.setInt(2, this.codLaboratorio);
           stm.setString(3, this.tipoLaboratorio);
           stm.setString(4, this.descrLaboratorio);
           stm.setString(5, this.situacaoLaboratorio);
           stm.execute();
        } catch (SQLException ex) {
            System.out.println("Error "+ex.getMessage()+sql);
            return false;
        }
        return true;
    }

    public void alterarLaboratorio() {
       String sql =" UPDATE laboratorio  ";  
       sql+= "SET tipoLaboratorio =?, ";
       sql+= "descrLaboratorio =?, ";  
       sql+= "situacaoLaboratorio = ? ";
       sql+=" WHERE codBloco=? and codLaboratorio=? ";
       Connection con = Conexao.conectar();
       try {
           PreparedStatement  stm=con.prepareStatement(sql);
           stm.setString(1, this.tipoLaboratorio);
           stm.setString(2, this.descrLaboratorio);
           stm.setString(3, this.situacaoLaboratorio);
           stm.setString(4, this.codBloco);
           stm.setInt(5, this.codLaboratorio);
           stm.execute();
           System.out.println("Deu certo");
         } catch (SQLException ex) {
            System.out.println("Error "+ex.getMessage()+sql);
        }
    }

    public boolean excluirLaboratorio() {
        String sql =" DELETE FROM laboratorio ";
       sql+= " WHERE codBloco = ? and codLaboratorio = ? ";
       Connection con = Conexao.conectar();
        try {
           PreparedStatement  stm=con.prepareStatement(sql);
           stm.setString(1, this.codBloco);
           stm.setInt(2, this.codLaboratorio);
           stm.execute();
        } catch (SQLException ex) {
            System.out.println("Error "+ex.getMessage()+sql);
            return false;
        }
        return true;
    }

    public Laboratorio consultarLaboratorio(String pCodBloco, int pCodLaboratorio) {
       Connection con = Conexao.conectar();
       String sql =" select codBloco, codLaboratorio, tipoLaboratorio, descrLaboratorio, situacaoLaboratorio ";
       sql+= " from laboratorio ";
       sql+= "where codBloco = ? and codLaboratorio = ? ";
       Laboratorio labo = null;
       try {
           PreparedStatement  stm=con.prepareStatement(sql);
           stm.setString(1, pCodBloco);
           stm.setInt(2, pCodLaboratorio);
           ResultSet rst = stm.executeQuery();
           if(rst.next()){
               labo = new Laboratorio();
               labo.setCodBloco(pCodBloco);
               labo.setCodLaboratorio(pCodLaboratorio);
               labo.setTipoLaboratorio(rst.getString("tipoLaboratorio"));
               labo.setDescrLaboratorio(rst.getString("descrLaboratorio"));
               labo.setSituacaoLaboratorio(rst.getString("situacaoLaboratorio"));
           }
        } catch (SQLException ex) {
            System.out.println("Error "+ex.getMessage()+sql);
        }
        return labo;
    }
    public List<Laboratorio> consultarLaboratorios() {
        List<Laboratorio> lista = new ArrayList<>();
        Connection con = Conexao.conectar();
       String sql =" select codBloco, codLaboratorio, tipoLaboratorio, descrLaboratorio, situacaoLaboratorio ";
       sql+= " from laboratorio ";
       sql+= " order by codBloco and codLaboratorio";
       try {
           PreparedStatement  stm=con.prepareStatement(sql);
           ResultSet rst = stm.executeQuery();
           while(rst.next()){
               Laboratorio labo = new Laboratorio();
               labo.setCodBloco(rst.getString("codBloco"));
               labo.setCodLaboratorio(rst.getInt("codLaboratorio"));
               labo.setTipoLaboratorio(rst.getString("tipoLaboratorio"));
               labo.setDescrLaboratorio(rst.getString("descrLaboratorio"));
               labo.setSituacaoLaboratorio(rst.getString("situacaoLaboratorio"));
              lista.add(labo);
           }
        }catch (SQLException ex) {
            System.out.println("Error "+ex.getMessage()+sql);
        }
        return lista;
    }

    public int getCodLaboratorio() {
        return codLaboratorio;
    }

    public void setCodLaboratorio(int codLaboratorio) {
        this.codLaboratorio = codLaboratorio;
    }

    public String getCodBloco() {
        return codBloco;
    }

    public void setCodBloco(String codBloco) {
        this.codBloco = codBloco;
    }

    public String getTipoLaboratorio() {
        return tipoLaboratorio;
    }

    public void setTipoLaboratorio(String tipoLaboratorio) {
        this.tipoLaboratorio = tipoLaboratorio;
    }

    public String getDescrLaboratorio() {
        return descrLaboratorio;
    }

    public void setDescrLaboratorio(String descrLaboratorio) {
        this.descrLaboratorio = descrLaboratorio;
    }

    public String getSituacaoLaboratorio() {
        return situacaoLaboratorio;
    }

    public void setSituacaoLaboratorio(String situacaoLaboratorio) {
        this.situacaoLaboratorio = situacaoLaboratorio;
    }

}