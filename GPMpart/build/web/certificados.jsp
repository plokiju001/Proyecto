<%-- 
    Document   : certificados
    Created on : 25-ene-2017, 14:17:56
    Author     : SHALOM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <title>GPM</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
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
        
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <div class="container" id="nom">                    
                                <div id="contLogo">
                                    <div id="dirCem" style="position: absolute; top:30px; right:100px">
    
                                        <strong><span id="sp11" style="font-size: 35px; font-weight: initial; color: #888; left: 15px; top: 30px;">Dirección de</span></strong><br>
                                        <strong><span id="sp21" style="font-size: 35px; color: #999; left: 10px; top: 40px;"> Cementerios</span></strong>
                                        <div id="barraN1" style="height: 5px; width: 210px; background-color: #f0ad4e;  position: relative;  left: 0px; bottom: 4px;">
   
                                   </div>
                                    </div>
                           </div>
                            </div>
    </head>
    
    <body>
         <a href="index.jsp">
        <img src="img/Tlajo.png" width="600px">
        </a>
 <nav class="navbar navbar-inverse">
        <div class ="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="index.html">Panteones</a>
                
            </div>
            <ul class="nav navbar-nav">
                
            <li class="dropdown">
            <li>
                <a class="dropdown-toggle" data-toggle="dropdown" href="#">Servicios
                <span class="caret"></span></a>
                <ul class="dropdown-menu">
                    <li><a href="tramites.jsp">Prescripciones</a></li>
                    <li><a href="AdquiTerreno.jsp">Adquisición de terreno</a></li>
                    <li><a href="certificados.jsp">Certificados</a></li>
                     <li><a href="PagoMant.jsp">Pago de mantenimiento</a></li>
                      <li><a href="ordenPago.jsp">Órdenes de pago</a></li>
                </ul>
                
            </li>
            <li>
            <a class="dropdown-toggle" data-toggle="dropdown" href="#">Catálogo
                <span class="caret"></span></a>
                <ul class="dropdown-menu">
                    <li><a href="#">Panteones</a></li>
                    <li><a href="#">Localidades</a></li>
                     <li><a href="#">Propietarios</a></li>
                </ul>
            </li>
           
              <li><a href="#">Pagos</a></li>
            <li><a href="#">Tesorería</a></li>
            
             <li>
             <a class="dropdown-toggle" data-toggle="dropdown" href="#">Usuario
                <span class="caret"></span></a>
                <ul class="dropdown-menu">
                    <li><a href="tramites.jsp">Cambiar contraseña</a></li>
                </li>
            </ul>
            </ul>
            
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#"><span class="glyphicon glyphicon-log-out"></span> Cerrar Sesión</a></li>
            </ul>
            
        </div>
          </nav>
        
        <div id="buscar" class="container">
     <br>
             <h2>   Buscar ID o Cuenta:</h2>
             <br>
             <br>
           
      <div class="navbar-form navbar-left">  
      <div class="input-group">
        <input type="text" class="form-control" placeholder="Buscar">
        <div class="input-group-btn">
            <button class="btn btn-default" type="submit">
            <i class="glyphicon glyphicon-search"></i>
            </button>
        </div>
      </div>
      </div>
        </div><br>
        <br>
        <div class="container" id="tabla">
             <table class="table table-hover table-bordered">
    <thead>
      <tr>
        <th>ID</th>
        <th>Cuenta</th>
        <th>Propietario</th>
        <th>Domicilio</th>
        <th>Colonia</th>
        <th>Lote</th>      
        <th>Gavetas</th>
        <th>Ocupación</th>
        <th>Localidad</th>
        <th>Panteón</th>
        <th>Sección</th>
        <th>Frente</th>
        <th>Fondo</th>
      </tr>
    </thead>
        </div>
        
    </body>
</html>
