package laboratoriosenai;
import java.sql.Connection;
import Util.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
public class Tecnico extends Equipamento {

    public Tecnico() {
    }

    private int codTecnico;

    private String nomeTecnico;

    private String foneTecnico;

    private String emailTecnico;

    public boolean incluirTecnico() {
       String sql =" insert into tecnico (nometecnico,fonetecnico,emailtecnico) ";
       sql+= " values(?,?,?)";
       Connection con = Conexao.conectar();
        try {
           PreparedStatement  stm=con.prepareStatement(sql);
           stm.setString(1, this.nomeTecnico);
           stm.setString(2, this.foneTecnico);
           stm.setString(3, this.emailTecnico);
           stm.execute();
        } catch (SQLException ex) {
            System.out.println("Error "+ex.getMessage()+sql);
            return false;
        }
        return true;
    }

    public void alterarTecnico() {
       String sql =" UPDATE tecnico  ";
       sql+= "SET nometecnico =?, ";
       sql+= "fonetecnico =?, ";
       sql+= "emailtecnico = ? ";
       sql+=" WHERE codtecnico=? ";
       Connection con = Conexao.conectar();
        try {
           PreparedStatement  stm=con.prepareStatement(sql);
           stm.setString(1, this.nomeTecnico);
           stm.setString(2, this.foneTecnico);
           stm.setString(3, this.emailTecnico);
           stm.setInt(4, this.codTecnico);
           stm.execute();
        } catch (SQLException ex) {
            System.out.println("Error "+ex.getMessage()+sql);
        }
    }

    public boolean excluirTecnico() {
       String sql =" DELETE FROM tecnico ";
       sql+= " WHERE codtecnico = ? ";
       Connection con = Conexao.conectar();
        try {
           PreparedStatement  stm=con.prepareStatement(sql);
           stm.setInt(1, this.codTecnico);
           stm.execute();
        } catch (SQLException ex) {
            System.out.println("Error "+ex.getMessage()+sql);
            return false;
        }
        return true;
    }

    public boolean consultarTecnico() {
       String sql =" select * ";
       sql+= " from tecnico ";
       sql+= "where codtecnico = ? ";
       Connection con = Conexao.conectar();
       try {
           PreparedStatement  stm=con.prepareStatement(sql);
           stm.setInt(1, this.codTecnico);
           ResultSet rst = stm.executeQuery();
           if(rst.next()){
               for (int i = 1; i <= 4; i++) {
                   System.out.print(rst.getString(i)+ " ");
               }
               System.out.println("\n");
           
           }
        } catch (SQLException ex) {
            System.out.println("Error "+ex.getMessage()+sql);
            return false;
        }
        return true;
    }
    
    public boolean consultarTecnicos() {
       String sql =" select * ";
       sql+= " from tecnico ";
       //sql+= " order by codtecnico  ";
       Connection con = Conexao.conectar();
       try {
           PreparedStatement  stm=con.prepareStatement(sql);
           ResultSet rst = stm.executeQuery();
           while(rst.next()){
               for (int i = 1; i <= 4; i++) {
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

    public int getCodTecnico() {
        return codTecnico;
    }

    public void setCodTecnico(int codTecnico) {
        this.codTecnico = codTecnico;
    }

    public String getNomeTecnico() {
        return nomeTecnico;
    }

    public void setNomeTecnico(String nomeTecnico) {
        this.nomeTecnico = nomeTecnico;
    }

    public String getFoneTecnico() {
        return foneTecnico;
    }

    public void setFoneTecnico(String foneTecnico) {
        this.foneTecnico = foneTecnico;
    }

    public String getEmailTecnico() {
        return emailTecnico;
    }

    public void setEmailTecnico(String emailTecnico) {
        this.emailTecnico = emailTecnico;
    }

}