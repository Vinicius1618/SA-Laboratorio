package laboratoriosenai;
import java.sql.Connection;
import Util.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
public class Software {

    public Software() {
    }

    private int codSoftware;

    private String descSoftware;

    private String descVersao;

    private String dataInstalacao;
    
    private String tipoLicença;

    public boolean incluirSoftware() {
       String sql =" insert into Software (descSoftware,descVersao,dataInstalaçao,tipoLicença) ";
       sql+= " values(?,?,?,?)";
       Connection con = Conexao.conectar();
        try {
           PreparedStatement  stm=con.prepareStatement(sql);
           stm.setString(1, this.descSoftware);
           stm.setString(2, this.descVersao);
           stm.setString(3, this.dataInstalacao);
           stm.setString(4, this.tipoLicença);
           stm.execute();
        } catch (SQLException ex) {
            System.out.println("Error "+ex.getMessage()+sql);
            return false;
        }
        return true;
    }

    public void alterarSoftware() {
        String sql =" UPDATE Software ";
       sql+= "SET descSoftware =?, ";
       sql+= "descVersao =?, ";
       sql+= "dataInstalaçao = ?, ";
       sql+=" tipoLicença = ? ";
       sql+=" WHERE codSoftware = ? ";
       Connection con = Conexao.conectar();
        try {
           PreparedStatement  stm=con.prepareStatement(sql);
           stm.setString(1, this.descSoftware);
           stm.setString(2, this.descVersao);
           stm.setString(3, this.dataInstalacao);
           stm.setString(4, this.tipoLicença);
           stm.setInt(5, this.codSoftware);
           stm.execute();
        } catch (SQLException ex) {
            System.out.println("Error "+ex.getMessage()+sql);
        }
    }

    public boolean excluirSoftware() {
       String sql =" DELETE FROM software ";
       sql+= " WHERE codSoftware = ? ";
       Connection con = Conexao.conectar();
        try {
           PreparedStatement  stm=con.prepareStatement(sql);
           stm.setInt(1, this.codSoftware);
           stm.execute();
        } catch (SQLException ex) {
            System.out.println("Error "+ex.getMessage()+sql);
            return false;
        }
        return true;
    }

    public boolean consultarSoftware() {
        String sql =" select * ";
       sql+= " from software ";
       sql+= "where codsoftware = ? ";
       Connection con = Conexao.conectar();
       try {
           PreparedStatement  stm=con.prepareStatement(sql);
           stm.setInt(1, this.codSoftware);
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
    public boolean consultarSoftwares() {
       String sql =" select * ";
       sql+= " from software ";
       //sql+= " order by codsoftware  ";
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

    public int getCodSoftware() {
        return codSoftware;
    }

    public void setCodSoftware(int codSoftware) {
        this.codSoftware = codSoftware;
    }

    public String getDescSoftware() {
        return descSoftware;
    }

    public void setDescSoftware(String descSoftware) {
        this.descSoftware = descSoftware;
    }

    public String getDescVersao() {
        return descVersao;
    }

    public void setDescVersao(String descVersao) {
        this.descVersao = descVersao;
    }

    public String getDataInstalacao() {
        return dataInstalacao;
    }

    public void setDataInstalacao(String dataInstalacao) {
        this.dataInstalacao = dataInstalacao;
    }

    public String getTipoLicença() {
        return tipoLicença;
    }

    public void setTipoLicença(String tipoLicença) {
        this.tipoLicença = tipoLicença;
    }

}