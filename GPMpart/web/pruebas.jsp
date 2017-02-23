<%-- 
    Document   : pruebas
    Created on : 07-feb-2017, 15:49:02
    Author     : SHALOM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
          <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>GPM</title>
            
        <link rel="shortcut icon" href="img/tlajo_en_movimiento_favicon.ico" type="image/x-icon">
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="font-awesome-4.6.1/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="iconFonts/material-icons.css">
        <link rel="stylesheet" href="css/estilo.css">

        <script src="js/jquery-1.11.3.min.js"></script>

        <script src="bootstrap/js/bootstrap.min.js"></script>
        <script src="js/typeahead.min.js"></script>
        <script src="js/acciones.js"></script>
        <script src="js/validator.js"></script>
        <script src="js/jquery-barcode.min.js"></script>
        <!-- Custom CSS -->
        
    </head>
    <body>
<div class="navbar navbar-default navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">  
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
        </div>
        <div class="collapse navbar-collapse navbar-ex1-collapse">
            <ul class="nav navbar-nav">
                <li class="menu-item dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Drop Down<b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li class="menu-item dropdown dropdown-submenu">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Level 1</a>
                            <ul class="dropdown-menu">
                                <li class="menu-item ">
                                    <a href="#">Link 1</a>
                                </li>
                              
                            </ul>
                        </li>
                         <li class="menu-item dropdown dropdown-submenu">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Level 2</a>
                            <ul class="dropdown-menu">
                                <li class="menu-item ">
                                    <a href="#">Link 2</a>
                                </li>
                              
                            </ul>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</div>
        
          <div id="formulario" class="tab-pane fade">
                
  <h2>Actualizar datos:</h2>
  <form>
       <div class="form-group">
      <label for="cuenta">Cuenta:</label>
      <input type="text" class="form-control" id="cuenta">
    </div>
      <br>
      <h4><b>Datos del propietario:</b></h4>
      <br>   
    <div class="form-group">
      <label for="nombre">Nombre:</label>
      <input type="text" class="form-control" id="nombre">
    </div>
    <div class="form-group">
      <label for="paterno">Apellido Paterno:</label>
      <input type="text" class="form-control" id="paterno">
    </div>
     <div class="form-group">
      <label for="materno">Apellido Materno:</label>
      <input type="text" class="form-control" id="materno">
    </div>
     <div class="form-group">
      <label for="calle">Calle:</label>
      <input type="text" class="form-control" id="calle">
    </div>
     <div class="form-group">
      <label for="numeroExt">Número Exterior:</label>
      <input type="text" class="form-control" id="numeroExt">
    </div>
     <div class="form-group">
      <label for="numeroInt">Número Interior:</label>
      <input type="text" class="form-control" id="numeroInt">
    </div>
     <div class="form-group">
      <label for="colonia">Colonia:</label>
      <input type="text" class="form-control" id="colonia">
    </div>
       <br>
                   
       <h4><b>Datos de la gaveta:</b></h4>
      <br>  
     <div class="form-group">
      <label for="lote">Lote:</label>
      <input type="text" class="form-control" id="lote">
    </div>
    <div class="form-group">
      <label for="seccion">Sección:</label>
      <input type="text" class="form-control" id="seccion">
    </div>
    <div class="form-group">
      <label for="localidad">Localidad:</label>
      <input type="text" class="form-control" id="localidad">
    </div>
    <div class="form-group">
      <label for="panteon">Panteón:</label>
      <input type="text" class="form-control" id="panteon">
    </div>
   
    <button type="submit" class="btn btn-default">Actualizar</button>
    <br>
      <br>
        <br>
          <br>
  </form>
  </div> 
    </body>
</html>
