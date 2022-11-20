

package Controlador;

import Modelo.Usuario;
import Modelo.UsuarioDAO;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Validar extends HttpServlet {
    
    Usuario usu=new Usuario();
    UsuarioDAO udao=new UsuarioDAO();

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Validar</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Validar at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if(accion.equalsIgnoreCase("Ingresar")){
           String usuario=request.getParameter("txtusuario");
            String pass=request.getParameter("txtpass");
            
            usu=udao.validar(usuario, pass);
            if(usu.getUsu_nombre()!=null){
                request.setAttribute("usuario", usu);
                request.getRequestDispatcher("Controlador?menu=Principal").forward(request, response);
            }else{
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
            
            
        }else{
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
                
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }
    

}
