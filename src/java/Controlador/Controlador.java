/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import Modelo.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Controlador extends HttpServlet {
    //Instanciar la entidad Usuario y la clase UsuarioDAO(tiene los métodos que están relacionados con la BD)
    Usuario usu = new Usuario();
    UsuarioDAO udao = new UsuarioDAO();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Invocación del botón de name "menu"
        String menu=request.getParameter("menu");
        //Invocación del botón de name "accion"
        String accion=request.getParameter("accion");
        if(menu.equals("Principal")){
            request.getRequestDispatcher("Principal.jsp").forward(request, response);
        }
        if(menu.equals("Usuarios")){
            switch (accion){
                case "Listar":
                    //se crea una variable lista para que almacene los datos del objeto usuario...y se los envía al formulario.
                    List lista = udao.listar();
                    request.setAttribute("usuarios", lista);
                    break;
                case "Agregar":
                    //Se crean variables para capturar los datos ingresador en las cajas de texto.
                    String nom=request.getParameter("txtnombre");
                    String ape=request.getParameter("txtapellidos");
                    String email=request.getParameter("txtemail");
                    String tel=request.getParameter("txttelefono");
                    String pass=request.getParameter("txtpassword");
                    String fec=request.getParameter("txtfecha");
                    
                    //Se setean los valores en las variables usando el objeto usuario.
                    usu.setUsu_nombre(nom);
                    usu.setUsu_apellidos(ape);
                    usu.setUsu_email(email);
                    usu.setUsu_telefono(tel);
                    usu.setUsu_password(pass);
                    usu.setUsu_fecharegistro(fec);
                    
                    udao.agregar(usu);
                    request.getRequestDispatcher("controlador?menu=Usuarios&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    break;
                case "Delete":
                    break;
                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("Usuarios.jsp").forward(request, response);
        }
        if(menu.equals("Producto")){
            request.getRequestDispatcher("Producto.jsp").forward(request, response);
        }
        if(menu.equals("Venta")){
            request.getRequestDispatcher("Venta.jsp").forward(request, response);
        }
        if(menu.equals("Merma")){
            request.getRequestDispatcher("Merma.jsp").forward(request, response);
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
        processRequest(request, response);
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
        processRequest(request, response);
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

}
