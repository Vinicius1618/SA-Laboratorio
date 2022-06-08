package laboratoriosenai;
import java.sql.Connection;
import Util.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
        // TODO implement here
    }

    public void excluirTecnico() {
        // TODO implement here
    }

    public void consultarTecnico() {
        // TODO implement here
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