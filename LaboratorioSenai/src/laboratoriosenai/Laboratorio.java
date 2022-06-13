package laboratoriosenai;
import java.sql.Connection;
import Util.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

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

    public boolean consultarLaboratorio() {
        String sql =" select * ";
       sql+= " from laboratorio ";
       sql+= "where codBloco = ? and codLaboratorio = ? ";
       Connection con = Conexao.conectar();
       try {
           PreparedStatement  stm=con.prepareStatement(sql);
           stm.setString(1, this.codBloco);
           stm.setInt(2, this.codLaboratorio);
           ResultSet rst = stm.executeQuery();
           if(rst.next()){
               for (int i = 1; i <= 5; i++) {
                   System.out.print(rst.getString(i)+ " ");
                   System.out.println();
               }
               System.out.println("\n");
           
           }
        } catch (SQLException ex) {
            System.out.println("Error "+ex.getMessage()+sql);
            return false;
        }
        return true;
    }
    public boolean consultarLaboratorios() {
       String sql =" select * ";
       sql+= " from laboratorio ";
       //sql+= " order by codtecnico  ";
       Connection con = Conexao.conectar();
       try {
           PreparedStatement  stm=con.prepareStatement(sql);
           ResultSet rst = stm.executeQuery();
           while(rst.next()){
               for (int i = 1; i <= 5; i++) {
                   System.out.print(rst.getString(i)+ " ");
               }
               System.out.println("\n");
           }
        }catch (SQLException ex) {
            System.out.println("Error "+ex.getMessage()+sql);
            return false;
        }
        return true;
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