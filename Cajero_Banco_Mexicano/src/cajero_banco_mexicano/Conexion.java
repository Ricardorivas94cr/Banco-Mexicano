/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero_banco_mexicano;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author PC RICARDO
 */
public class Conexion {
    public Connection getConnection(){
        Connection con = null;
        String base = "bdbancomexicano";
        String url = "jdbc:mysql://localhost:3306/" + base;
        String user = "root";
        String password = "";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection( url, user, password);
        } catch (Exception e){
            
           System.err.println(e);
    }
        return con;
}
}
