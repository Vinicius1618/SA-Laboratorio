package laboratoriosenai;
import Util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class EquipSoftware extends Equipamento {
    public int codAtivo;
    public int cod_Software;
    
    public Boolean incluirEquiSoftware() {
        String sql = " INSERT INTO equipsoftware(cod_ativo, cod_software) VALUES (?,?) ";
        Connection con = Conexao.conectar();
        try {
            PreparedStatement  stm=con.prepareStatement(sql);
            stm.setInt(1, this.codAtivo);
            stm.setInt(2, this.cod_Software);
            stm.execute();
        } catch (SQLException ex) {
            System.out.println("Error " + ex.getMessage()+sql);
            return false;
        }
        return true;
    } 

   public boolean excluirEquiSoftware() {
        String sql = "DELETE FROM EquipSoftware WHERE cod_ativo= ? and cod_software = ? ";
        Connection con = Conexao.conectar();
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, this.codAtivo);
            stm.setInt(2, this.cod_Software);
            stm.execute();
        } catch (SQLException ex) {
            System.out.println("Erro " +ex.getMessage()+sql);
            return false;
        }
        return true;
    }

      public List<EquipSoftware> consultarEquipSoftware(int pCodAtivo) {
        List<EquipSoftware> lista = new ArrayList<>();  
        Connection con = Conexao.conectar();
        String sql  = "SELECT cod_ativo, cod_software FROM equipsoftware ";
               sql += "WHERE cod_ativo = ? ";
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, pCodAtivo);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                EquipSoftware equs = new EquipSoftware();
                equs.setCodAtivo(rs.getInt("cod_ativo"));
                equs.setCod_Software(rs.getInt("cod_software"));
                lista.add(equs);
            }
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
        return lista;
    }

    public List<EquipSoftware> consultarEquiSoftwares(){
        List<EquipSoftware> lista = new ArrayList<>();
        Connection con = Conexao.conectar();
        String sql = "SELECT cod_ativo, cod_software FROM EquipSoftware ORDER BY cod_ativo ";
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rst = stm.executeQuery();
            while (rst.next()) {
                EquipSoftware equis = new EquipSoftware();
                equis.setCodAtivo(rst.getInt("cod_ativo"));
                equis.setCodSoftware(rst.getInt("cod_Software"));
                lista.add(equis);
            }
        } catch (SQLException ex ) {
            System.out.println("Erro " +ex.getMessage()+sql);
        }
        return lista;
    } 

    public int getCodAtivo() {
        return codAtivo;
    }

    public void setCodAtivo(int codAtivo) {
        this.codAtivo = codAtivo;
    }

    public int getCod_Software() {
        return cod_Software;
    }

    public void setCod_Software(int cod_Software) {
        this.cod_Software = cod_Software;
    }

}
    

