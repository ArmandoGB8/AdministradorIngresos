/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

package Controlador;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 *
 * @author Bryann

public class Crud {
    private Statement st;

    
    /*public void eliminar (String pre){
        try{
            
        Connection con=Conexion.iniciar();
            st=con.createStatement();
            st.executeUpdate(pre);

            con.close();
            st.close();
            System.out.println("Se elimino");
        }
        catch (ClassNotFoundException ex) {
           
        } catch (SQLException ex) {
           
        } catch (InstantiationException ex) {
            
        } catch (IllegalAccessException ex) {
            
        }
    }
    public void cambiar (String pre){
        try{
            
        Connection con=Conexion.iniciar();
            st=con.createStatement();
            st.executeUpdate(pre);

            con.close();
            st.close();
            System.out.println("Se modifico");
        }
        catch (ClassNotFoundException ex) {
           
        } catch (SQLException ex) {
           
        } catch (InstantiationException ex) {
            
        } catch (IllegalAccessException ex) {
            
        }
    }
    public void insertarMensual (String pre){
        try{
            
        Connection con=Conexion.iniciar();
            st=con.createStatement();
            st.executeUpdate(pre);

            con.close();
            st.close();
            System.out.println("Se inserto");
        }
        catch (ClassNotFoundException ex) {
           
        } catch (SQLException ex) {
           
        } catch (InstantiationException ex) {
            
        } catch (IllegalAccessException ex) {
            
        }
    }
}
*/