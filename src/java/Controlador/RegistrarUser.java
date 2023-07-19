package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Profesor
 */
public class RegistrarUser extends HttpServlet {
    
    
        private Connection con;
    private Statement set;
    private ResultSet rs;
    
    public void init(ServletConfig cfg)throws ServletException{
    String URL="jdbc:mysql:3306//localhost/registrodealumnos";
    String userName="root";
    String password="n0m3l0";
    try{
    
        Class.forName("com.mysql.jdbc.Driver");//Se establece el controlador para la base de datos
        URL="jdbc:mysql://localhost/kagobd";
        con=DriverManager.getConnection(URL, userName, password);
        set=con.createStatement();
        
        System.out.println("Conexion Existosa");
    
    }catch(Exception e){
    
        System.out.println("Conexion Fallida");
        System.out.println(e.getMessage());
        
    }
    }


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           
            String nombre,appat,apmat,usuario,pasword;
            
            
            nombre = request.getParameter("nom");
            appat = request.getParameter("ap");
            apmat = request.getParameter("am");
            usuario =request.getParameter("use");
            pasword = request.getParameter("pass");
            
            
            try{
            
                String q="insert into malumno(usus_usu,nom_usu,apm_usu,app_usu,pas_usu)"
                        + "values("+usuario+", '"+nombre+"','"+appat+"','"+apmat+"',"+pasword+",')";
                
              
                set.executeUpdate(q);
                
                System.out.println("Registro Exitoso");
                out.println("Registro Exitoso");
            }catch(Exception e){
            
                System.out.println("Registro Fallido");
                System.out.println(e.getMessage());
                System.out.println(e.getStackTrace());
                
            }
            out.println("<a href='index.html'>Registro</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
        public void destroy(){
        try{
        set.close();
        con.close();
            System.out.println("Destructor");
        }catch(Exception e ){
        super.destroy();
        }
    }

}