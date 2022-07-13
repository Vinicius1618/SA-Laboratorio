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
    private String codLaboratorio;

    private String tipoLaboratorio;

    private String descrLaboratorio;
    
    private String situacaoLaboratorio;

    public boolean incluirLaboratorio() {
       String sql =" insert into laboratorio (codLaboratorio,tipoLaboratorio,descrlaboratorio,situacaolaboratorio) ";
       sql+= " values(?,?,?,?)";
       java.sql.Connection con = Conexao.conectar();
        try {
           PreparedStatement  stm=con.prepareStatement(sql);
           stm.setString(1, this.getCodLaboratorio());
           stm.setString(2, this.getTipoLaboratorio());
           stm.setString(3, this.getDescrLaboratorio());
           stm.setString(4, this.getSituacaoLaboratorio());
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
       sql+=" WHERE codLaboratorio=? ";
       Connection con = Conexao.conectar();
       try {
           PreparedStatement  stm=con.prepareStatement(sql);
           stm.setString(1, this.getTipoLaboratorio());
           stm.setString(2, this.getDescrLaboratorio());
           stm.setString(3, this.getSituacaoLaboratorio());
           stm.setString(4, this.getCodLaboratorio());
           stm.execute();
           System.out.println("Deu certo");
         } catch (SQLException ex) {
            System.out.println("Error "+ex.getMessage()+sql);
        }
    }

    public boolean excluirLaboratorio() {
        String sql =" DELETE FROM laboratorio ";
       sql+= " WHERE codLaboratorio = ? ";
       Connection con = Conexao.conectar();
        try {
           PreparedStatement  stm=con.prepareStatement(sql);
           stm.setString(1, this.getCodLaboratorio());
           stm.execute();
        } catch (SQLException ex) {
            System.out.println("Error "+ex.getMessage()+sql);
            return false;
        }
        return true;
    }

    public Laboratorio consultarLaboratorio(String pCodLaboratorio) {
       Connection con = Conexao.conectar();
       String sql =" select  codLaboratorio, tipoLaboratorio, descrLaboratorio, situacaoLaboratorio ";
       sql+= " from laboratorio ";
       sql+= "where  codLaboratorio = ? ";
       Laboratorio labo = null;
       try {
           PreparedStatement  stm=con.prepareStatement(sql);
           stm.setString(1, pCodLaboratorio);
           ResultSet rst = stm.executeQuery();
           if(rst.next()){
               labo = new Laboratorio();
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
       String sql =" select  codLaboratorio, tipoLaboratorio, descrLaboratorio, situacaoLaboratorio ";
       sql+= " from laboratorio ";
       sql+= " order by codLaboratorio";
       try {
           PreparedStatement  stm=con.prepareStatement(sql);
           ResultSet rst = stm.executeQuery();
           while(rst.next()){
               Laboratorio labo = new Laboratorio();
               labo.setCodLaboratorio(rst.getString("codLaboratorio"));
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
    
    public String getCodLaboratorio() {
        return codLaboratorio;
    }

    
    public void setCodLaboratorio(String codLaboratorio) {
        this.codLaboratorio = codLaboratorio;
    }

    /**
     * @return the tipoLaboratorio
     */
    public String getTipoLaboratorio() {
        return tipoLaboratorio;
    }

    /**
     * @param tipoLaboratorio the tipoLaboratorio to set
     */
    public void setTipoLaboratorio(String tipoLaboratorio) {
        this.tipoLaboratorio = tipoLaboratorio;
    }

    /**
     * @return the descrLaboratorio
     */
    public String getDescrLaboratorio() {
        return descrLaboratorio;
    }

    /**
     * @param descrLaboratorio the descrLaboratorio to set
     */
    public void setDescrLaboratorio(String descrLaboratorio) {
        this.descrLaboratorio = descrLaboratorio;
    }

    /**
     * @return the situacaoLaboratorio
     */
    public String getSituacaoLaboratorio() {
        return situacaoLaboratorio;
    }

    /**
     * @param situacaoLaboratorio the situacaoLaboratorio to set
     */
    public void setSituacaoLaboratorio(String situacaoLaboratorio) {
        this.situacaoLaboratorio = situacaoLaboratorio;
    }
   

}