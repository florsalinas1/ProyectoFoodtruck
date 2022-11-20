<%-- 
    Document   : Usuarios
    Created on : 16-11-2022, 22:55:11
    Author     : Flor
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="d-flex">
            <div class="card col-sm-3"> 
            <div class="card-body">
                <form action="Controlador?menu=Usuarios" method="POST">
                    <input type="submit" name="accion" value="Agregar" class="btn btn-info">
                     <br>
                    <div class="form-group">
                        <label>Nombre</label>
                        <input type="text" name="txtnombre" class="form-control">
                    </div>
                    <div>
                        <label>Apellidos</label>
                        <input type="text" name="txtapellidos" class="form-control">
                    </div>
                        
                    <div>
                        <label>Correo Electrónico</label>
                        <input type="text" name="txtcorreo" class="form-control">
                    </div>
                        
                    <div>
                        <label>Teléfono</label>
                        <input type="text" name="txttelefono" class="form-control">
                    </div>
                    
                    <div>
                        <label>Password</label>
                        <input type="password" name="txtpassword" class="form-control">
                    </div>
                    
                    <div>
                        <label>Fecha</label>
                        <input type="text" name="txtfecha" class="form-control">
                    </div>
                    
                   
                </form>
            </div>    
        </div>
        <div>
            <table class="table table-hover" col-sm-10>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>NOMBRE</th>
                        <th>APELLIDOS</th>
                        <th>CORREO</th>
                        <th>TELÉFONO</th>
                        <th>FECHA</th>
                        
                        <th>ACCIONES</th>
                    </tr>
                </thead>
                <tbody>
                    
                    <c:forEach var="usu" items="${usuarios}">
                        <tr>
                            <td>${usu.getUsu_id()}</td>
                            <td>${usu.getUsu_nombre()}</td>
                            <td>${usu.getUsu_apellidos()}</td>
                            <td>${usu.getUsu_email()}</td>
                            <td>${usu.getUsu_telefono()}</td>
                            <td>${usu.getUsu_fecharegistro()}</td>
                            
                            <td>
                                <a>Editar</a>
                                <a>Eliminar</a>
                            </td>
                        </tr>
                    
                    </c:forEach>
                </tbody>
            </table>
        </div>
            
        </div>
        
            <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
            <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
