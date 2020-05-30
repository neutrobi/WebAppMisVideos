/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author rafa
 */

public class Conection {

    private String myUsername = "root";
    private String myPassword = "";
    private String myHost = "localhost";
    private String myPort = "3306";
    private String myDatabase = "ejercicioswba";
    private String myClassname = "com.mysql.jdbc.Driver";
    private String myUrl = "jdbc:mysql://" + myHost + ":" + myPort + "/" + myDatabase;
    private Connection con;
    

    public Conection() {
        try {
            Class.forName(myClassname);
            con = DriverManager.getConnection(myUrl, myUsername, myPassword);
        } catch (ClassNotFoundException e) {
            System.out.println("Error: " + e);
        } catch (SQLException e) {
            System.out.println("Error con la conexion: " + e);
        }
    }

    public Connection getConection() {
        return con;
    }
    
    public static void main(String[] args) {
        Conection con = new Conection();
        
    }
}