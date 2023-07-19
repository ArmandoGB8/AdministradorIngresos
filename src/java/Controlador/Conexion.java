/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bryann
 */
public class Conexion {
    protected Connection con;
    protected Statement stmt;
    private String errString;
    private String dbDriver = "com.mysql.jdbc.Driver";
    private String dbURL = "jdbc:mysql://localhost:3306/";
    private String dbName = "kagobd";
    private String dbUsername = "root";
    private String dbPassword = "n0m3l0";
    
    public Conexion(){
    
    }

    public Connection iniciar() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
        // Database name to access 
        con=null;
        try{
            Class.forName(dbDriver).newInstance(); 
            con = DriverManager.getConnection(dbURL + dbName,dbUsername,dbPassword); 
            stmt=con.createStatement();
            System.out.println("se conecto");
        }
        catch(Exception e){
            errString="Error al conectar con la base de datos.";
            System.out.println(errString);
            return null;
        }
        return con; 
        }

    public void desconectar(){
        try{
            stmt.close();
            con.close();
        }catch(SQLException e){
            errString="Error al desconectar con la base de datos.";
            System.out.println(errString);
        }
    }

    public Statement getStmt(){
        return this.stmt;
    }
    
    public void insertarMensual(String pay, String hours, String days){
        try {
            con=iniciar();
            PreparedStatement ps=null;
            String consulta="INSERT INTO ";//Terminar la sentencia, yo no pude porque no tengo acceso a la BD
            ps=con.prepareStatement(consulta);
            ps.setString(1,pay);
            ps.setString(2,hours);
            ps.setString(3,days);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("No funciona u.u "+e);
        }
    }
}
