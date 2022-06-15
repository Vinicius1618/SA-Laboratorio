package laboratoriosenai;
import java.sql.Connection;
import Util.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Software {

    public Software() {
    }

    private int codSoftware;

    private String descSoftware;

    private String descVersao;

    private Date dataInstalacao;
    
    private String tipoLicença;

    public boolean incluirSoftware() {
       String sql =" insert into Software (descSoftware,descVersao,dataInstalaçao,tipoLicença) ";
       sql+= " values(?,?,?,?)";
       Connection con = Conexao.conectar();
        try {
           PreparedStatement  stm=con.prepareStatement(sql);
           stm.setString(1, this.descSoftware);
           stm.setString(2, this.descVersao);
           stm.setDate(3, (java.sql.Date) this.dataInstalacao);
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
           stm.setDate(3, (java.sql.Date) this.dataInstalacao);
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

    public Software consultarSoftware(int pCodSoftware) {
       Connection con = Conexao.conectar();
       String sql =" select descSoftware, descVersao, dataInstalaçao, tipoLicença ";
       sql+= " from software ";
       sql+= "where codSoftware ";
       Software soft = null;
       try {
           PreparedStatement  stm=con.prepareStatement(sql);
           stm.setInt(1, pCodSoftware);
           ResultSet rst = stm.executeQuery();
           if(rst.next()){
               soft = new Software();
               soft.setCodSoftware(pCodSoftware);
               soft.setDescSoftware(rst.getString("descSoftware"));
               soft.setDescVersao(rst.getString("descVersao"));
               soft.setDataInstalacao(rst.getDate("dataInstalaçao"));
               soft.setTipoLicença(rst.getString("tipoLicença"));
           }
        } catch (SQLException ex) {
            System.out.println("Error "+ex.getMessage()+sql);
        }
        return soft;
    }
    public List<Software> consultarSoftwares() {
        List<Software> lista = new ArrayList<>();
        Connection con = Conexao.conectar();
       String sql =" select codSoftware, descSoftware, descVersao, dataInstalaçao, tipoLicença ";
       sql+= " from software ";
       sql+= " order by codSoftware";
       try {
           PreparedStatement  stm=con.prepareStatement(sql);
           ResultSet rst = stm.executeQuery();
           while(rst.next()){
              Software soft = new Software();
              soft.setCodSoftware(rst.getInt("codSoftware"));
               soft.setDescSoftware(rst.getString("descSoftware"));
               soft.setDescVersao(rst.getString("descVersao"));
               soft.setDataInstalacao(rst.getDate("dataInstalaçao"));
               soft.setTipoLicença(rst.getString("tipoLicença"));
              lista.add(soft);
           }
        }catch (SQLException ex) {
            System.out.println("Error "+ex.getMessage()+sql);
        }
        return lista;
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

    public Date getDataInstalacao() {
        return dataInstalacao;
    }

    public void setDataInstalacao(Date dataInstalacao) {
        this.dataInstalacao = dataInstalacao;
    }

    public String getTipoLicença() {
        return tipoLicença;
    }

    public void setTipoLicença(String tipoLicença) {
        this.tipoLicença = tipoLicença;
    }

}