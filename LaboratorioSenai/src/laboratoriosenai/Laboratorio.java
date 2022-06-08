package laboratoriosenai;
import java.sql.Connection;
import Util.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Laboratorio extends Equipamento {

    public Laboratorio() {
    }

    private int codlaboratorio;

    private int codBloco;

    private String tipolaboratorio;

    private String descrLaboratorio;
    
    private String situacaoLaboratorio;

    public boolean incluirLaboratorio() {
       String sql =" insert into tecnico (codbloco,tipolaboratorio,descrlaboratorio,situaçaolaboratorio) ";
       sql+= " values(?,?,?)";
       java.sql.Connection con = Conexao.conectar();
        try {
           PreparedStatement  stm=con.prepareStatement(sql);
           stm.setInt(1, this.codBloco);
           stm.setString(2, this.tipolaboratorio);
           stm.setString(3, this.descrLaboratorio);
           stm.setString(4, this.situacaoLaboratorio);
           stm.execute();
        } catch (SQLException ex) {
            System.out.println("Error "+ex.getMessage()+sql);
            return false;
        }
        return true;
    }

    public void alterarLaboratorio() {
        // TODO implement here
    }

    public void excluirLaboratorio() {
        // TODO implement here
    }

    public void consultarLaboratorio() {
        // TODO implement here
    }

    public int getCodlaboratorio() {
        return codlaboratorio;
    }

    public void setCodlaboratorio(int codlaboratorio) {
        this.codlaboratorio = codlaboratorio;
    }

    public int getCodBloco() {
        return codBloco;
    }

    public void setCodBloco(int codBloco) {
        this.codBloco = codBloco;
    }

    public String getTipolaboratorio() {
        return tipolaboratorio;
    }

    public void setTipolaboratorio(String tipolaboratorio) {
        this.tipolaboratorio = tipolaboratorio;
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