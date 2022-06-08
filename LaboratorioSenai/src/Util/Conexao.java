package Util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexao {
    public static Connection conectar(){
    Connection con= null;
    String url ="jdbc:mysql://localhost:3306/lab";
    String user = "laboratorio";
    String password="Prapl";
        try {
            con = DriverManager.getConnection(url,user,password);
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar com o banco "+ ex);
        }
    return con;
    }
}
