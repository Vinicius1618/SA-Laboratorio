package laboratoriosenai;
import java.sql.Connection;
import Util.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
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
        public Tecnico consultarTecnico(int pCodTecnico) {
        Connection con = Conexao.conectar();
        String sql = "select codtecnico, nometecnico, fonetecnico, emailtecnico ";
               sql += "from tecnico ";
               sql += "where codtecnico = ?";
        Tecnico tecn = null;
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, pCodTecnico);
            // executa a Query e guarda o resultado num elemento chamdo "Result Set"
            // o Result Set é uma classe da API JAVA que permite percorrermos uma consulta em um banco de dados. 
            // Ao ser inicializado, o Resultset coloca seu cursor na primeira linha do DataTable, 
            // o método next() permite que o ponteiro seja direcionado para a próxima linha caso exista. 
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                // para cada linha resgatada do ResultSet, instanciamos a classe novamente para "limpar" o conteúdo anterior dos atributos
                tecn = new Tecnico();
                tecn.setCodTecnico(pCodTecnico);
                // o valor de cada atributo é obtido através de um get no ResultSet, sempre cuidando para usar o get associado ao tipo correto do atributo
                tecn.setNomeTecnico(rs.getString("nomeTecnico"));
                tecn.setFoneTecnico(rs.getString("foneTecnico"));
                tecn.setEmailTecnico(rs.getString("emailTecnico"));
            }
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
        return tecn;
    }

    public List<Tecnico> consultarTodosTecnicos() {
        List<Tecnico> lista = new ArrayList<>();
        Connection con = Conexao.conectar();
        String  sql  = "select codtecnico,nometecnico,fonetecnico,emailtecnico ";
                sql += "from tecnico ";
                sql += "order by codtecnico";
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Tecnico tecn = new Tecnico();
                tecn.setCodTecnico(rs.getInt("codTecnico"));
                tecn.setNomeTecnico(rs.getString("nomeTecnico"));
                tecn.setFoneTecnico(rs.getString("foneTecnico"));
                tecn.setEmailTecnico(rs.getString("emailTecnico"));
                lista.add(tecn);
            }
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
        return lista;
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