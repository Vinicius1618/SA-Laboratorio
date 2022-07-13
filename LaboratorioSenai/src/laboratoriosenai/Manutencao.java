package laboratoriosenai;
import Util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Manutencao extends Equipamento
{

    private int codManutencao;
    private int codAtivo;
    private int codTecnico;
    private String codLaboratorio;
    private String tipomanutencao;
    private int ordemServico;
    private String descrManutencao;
    private Date dataManutencao;
    private Date dataLiberacao;
    private String statusmanutencao;
    
    

    public boolean incluirManutencao() {
        String sql  = " insert into manutencao (codAtivo, codTecnico, codLaboratorio, tipomanutencao, ordemServico, descrManutencao, dataManutencao, dataLiberacao, statusmanutencao) ";
               sql += " values(?,?,?,?,?,?,?,?,?)";
        Connection con = Conexao.conectar();
        try {
          PreparedStatement stm = con.prepareStatement(sql);
          stm.setInt(1, this.codAtivo);
          stm.setInt(2, this.codTecnico);
          stm.setString(3,this.codLaboratorio);
          stm.setString(4, this.tipomanutencao);
          stm.setInt(5, this.ordemServico);
          stm.setString(6, this.descrManutencao);
          stm.setDate(7, (java.sql.Date) this.dataManutencao);
          stm.setDate(8, (java.sql.Date) this. dataLiberacao);
          stm.setString(9, this.statusmanutencao);
          stm.execute();
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage() + sql);
            return false;
        }
        return true;
    }

    public boolean alterarManutencao() 
    {
         String sql  = " update manutencao ";
                sql += " set codTecnico = ?, ";
                sql += "     tipomanutencao  = ?, ";
                sql += "     ordemServico  = ?, ";
                sql += "     descrManutencao = ?, ";
                sql += "     dataLiberacao = ?,  ";
                sql += "     statusmanutencao = ?  ";
                sql += " where codManutencao  = ?  ";
        Connection con = Conexao.conectar();
        try {
          PreparedStatement stm = con.prepareStatement(sql);
          stm.setInt(1, this.codTecnico);
          stm.setString(2, this.tipomanutencao);
          stm.setInt(3, this.ordemServico);
          stm.setString(4, this.descrManutencao);
          stm.setDate(5, (java.sql.Date) this. dataLiberacao);
          stm.setString(6, this.statusmanutencao);
          stm.setInt(7, this.codManutencao);
          stm.execute();
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage() + sql);
            return false;
        }
        return true;
    }

    public boolean excluirManutencao() 
    {
        String sql = "delete from manutencao ";
               sql+= "where codManutencao = ? ";
        Connection con = Conexao.conectar();
        try {
          PreparedStatement stm = con.prepareStatement(sql);  
          stm.setInt(1, this.codManutencao);
          stm.execute();
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage() + sql);
            return false;
        }
        return true;
    }

    public Manutencao consultarManutencao(int pcodManutencao) 
    {
        Connection con = Conexao.conectar();
        String sql = " select codAtivo, codTecnico, codLaboratorio, tipomanutencao, ordemServico, descrManutencao, dataManutencao, dataLiberacao, statusmanutencao from manutencao where codManutencao = ?";
        Manutencao manu = new Manutencao();
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, pcodManutencao);
            // executa a Query e guarda o resultado num elemento chamdo "Result Set"
            // o Result Set é uma classe da API JAVA que permite percorrermos uma consulta em um banco de dados. 
            // Ao ser inicializado, o Resultset coloca seu cursor na primeira linha do DataTable, 
            // o método next() permite que o ponteiro seja direcionado para a próxima linha caso exista. 
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                // para cada linha resgatada do ResultSet, instanciamos a classe novamente para "limpar" o conteúdo anterior dos atributos
                manu = new Manutencao();
                manu.setCodManutencao(pcodManutencao);
                // o valor de cada atributo é obtido através de um get no ResultSet, sempre cuidando para usar o get associado ao tipo correto do atributo
                manu.setCodAtivo(rs.getInt("CodAtivo"));
                manu.setCodTecnico(rs.getInt("CodTecnico"));
                manu.setCodLaboratorio(rs.getString("codLaboratorio"));
                manu.setTipomanutencao(rs.getString("TipoManutencao"));
                manu.setOrdemServico(rs.getInt("OrdemServico"));
                manu.setDescrManutencao(rs.getString("DescrManutencao"));
                manu.setDataManutencao(rs.getDate("DataManutencao"));
                manu.setDataLiberacao(rs.getDate("DataLiberacao"));
                manu.setStatusmanutencao(rs.getString("statusmanutencao"));
            }
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
        return manu;
    }

    public List<Manutencao> consultarTodosManutencao () {
        List<Manutencao> lista = new ArrayList<>();
        Connection con = Conexao.conectar();
        String sql  = "select codmanutencao, codAtivo, codTecnico, codLaboratorio, tipomanutencao, ordemServico, descrManutencao, dataManutencao, dataLiberacao, statusmanutencao ";
               sql+=" FROM manutencao ";
               sql+=" ORDER BY codmanutencao ";

        try {
            PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Manutencao manu = new Manutencao();
                manu.setCodManutencao(rs.getInt("codmanutencao"));
                manu.setCodAtivo(rs.getInt("codAtivo"));
                manu.setCodTecnico(rs.getInt("codTecnico"));
                manu.setCodLaboratorio(rs.getString("codLaboratorio"));
                manu.setTipomanutencao(rs.getString("TipoManutencao"));
                manu.setOrdemServico(rs.getInt("OrdemServico"));
                manu.setDescrManutencao(rs.getString("DescrManutencao"));
                manu.setDataManutencao(rs.getDate("DataManutencao"));
                manu.setDataLiberacao(rs.getDate("DataLiberacao"));
                manu.setStatusmanutencao(rs.getString("statusmanutencao"));
                lista.add(manu);
            }
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
        return lista;
    }

    public int getCodManutencao() {
        return codManutencao;
    }

    public void setCodManutencao(int codManutencao) {
        this.codManutencao = codManutencao;
    }

    public int getCodAtivo() {
        return codAtivo;
    }

    public void setCodAtivo(int codAtivo) {
        this.codAtivo = codAtivo;
    }

    public int getCodTecnico() {
        return codTecnico;
    }

    public void setCodTecnico(int codTecnico) {
        this.codTecnico = codTecnico;
    }

    public String getTipomanutencao() {
        return tipomanutencao;
    }

    public void setTipomanutencao(String tipomanutencao) {
        this.tipomanutencao = tipomanutencao;
    }

    public int getOrdemServico() {
        return ordemServico;
    }

    public void setOrdemServico(int ordemServico) {
        this.ordemServico = ordemServico;
    }

    public String getDescrManutencao() {
        return descrManutencao;
    }

    public void setDescrManutencao(String descrManutencao) {
        this.descrManutencao = descrManutencao;
    }

    public Date getDataManutencao() {
        return dataManutencao;
    }

    public void setDataManutencao(Date dataManutencao) {
        this.dataManutencao = dataManutencao;
    }

    public Date getDataLiberacao() {
        return dataLiberacao;
    }

    public void setDataLiberacao(Date dataLiberacao) {
        this.dataLiberacao = dataLiberacao;
    }

    public String getStatusmanutencao() {
        return statusmanutencao;
    }

    public void setStatusmanutencao(String statusmanutencao) {
        this.statusmanutencao = statusmanutencao;
    }

    public String getCodLaboratorio() {
        return codLaboratorio;
    }

    public void setCodLaboratorio(String codLaboratorio) {
        this.codLaboratorio = codLaboratorio;
    }

}

