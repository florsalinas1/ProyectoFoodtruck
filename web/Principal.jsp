

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
            <nav class="navbar navbar-expand-lg navbar-light bg-danger">
                <a class="navbar-brand" href="#">
                    <img src="imag/images (1).jpg" alt="40" width="60"/>
                </a>
              <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
              </button>
              <div class="collapse navbar-collapse" id="navbarNavSupportedContent"">
                <ul class="navbar-nav mr-auto">
                  <li class="nav-item">
                      <a style="margin-left: 10px; border: none"  class="btn-outline-light" href="Controlador?menu=Producto" target="myFrame">Stock </a>
                  </li>
                  <li class="nav-item">
                      <a style="margin-left: 10px; border: none"  class="btn-outline-light" href="Controlador?menu=Venta" target="myFrame">Ventas</a>
                  </li>
                  <li class="nav-item">
                      <a style="margin-left: 10px; border: none"  class="btn-outline-light" href="Controlador?menu=Merma" target="myFrame">Merma</a>
                  </li>
                  <li class="nav-item">
                      <a style="margin-left: 10px; border: none"  class="btn-outline-light" href="Controlador?menu=Usuarios&accion=Listar" target="myFrame">Usuarios</a>
                  </li>
                </ul>
                <div class="dropdown" mr-right>
                  <button style="border: none"  class="btn btn-outline-light dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    ${usuario.getUsu_nombre()} ${usuario.getUsu_apellidos()}
                  </button>
                  <div class="dropdown-menu text-center">
                      <a class="dropdown-item" href="#">
                          <img src="imag/LAS ELBITAS -01.png" alt="60" width="60"/>
                      </a>
                    <a class="dropdown-item" href="#">${usuario.getUsu_nombre()}</a>
                    <a class="dropdown-item" href="#">${usuario.getUsu_email()}</a>
                    <div class="dropdown-divider"></div>
                    <form action="Validar" method="POST">
                        <button name="accion" value="Salir" class="btn btn-primary btn-block" href="#">Salir</button>
                    </form>
                  </div>
                </div>
              </div>
            </nav>
                    <div class="m-4" style="height: 550px">
                        <iframe name="myFrame" style="height: 100%; width: 100%; border: none"></iframe> 
                    </div>
                     
            <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
            <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        
    </body>
</html>
