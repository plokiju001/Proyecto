<%-- 
    Document   : AdquiTerreno
    Created on : 30-ene-2017, 11:57:11
    Author     : SHALOM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
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
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>GPN</title>
        
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
                <li><a href="#"><span class="glyphicon glyphicon-log-out"></span>Cerrar Sesión</a></li>
            </ul>
            
        </div>
          </nav>
        
       <div class="container">
   <h2>Adquisición de terreno nuevo</h2>
   
  <div class="container">
              
 
      <br>
        
  
    <form method="post" action="index.jsp" id="terreno" >
        <div class="form-horizontal">
        <div class="form-group">
                        <label class="control-label col-sm-2">Cuenta:</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="cuenta" placeholder="Cuenta">
                            </div>
                        <br>
                         <br>
      <h3>Datos del propietario </h3>
            
                    <div class="form-group">
                        <label class="control-label col-sm-2">Nombre Completo:</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="nombrePropN" placeholder="Nombre y apellidos" required="required">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2">CURP:</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="curpPropN" placeholder="CURP">
                            </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2">RFC:</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="rfcPropN" placeholder="RFC">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2">Calle:</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="callePropN" placeholder="Calle" required="required">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2">Número Exterior:</label>
                        <div class="col-sm-10">
                                <input type="text" class="form-control" id="numExtPropN" placeholder="Número exterior" required="required">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2">Número Interior:</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="numIntPropN" placeholder="Número interior">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2">Colonia:</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="coloPropN" placeholder="Colonia" required="required">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2">Población:</label>
                        <div class="col-sm-10">
                                <input type="text" class="form-control" id="poblacionPropN" placeholder="Población" required="required">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2">CP:</label>
                        <div class="col-sm-10">
                                <input type="text" class="form-control" id="cpPropN" placeholder="Código Postal" required="required">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2">Municipio:</label>
                        <div class="col-sm-10">
                                <input type="text" class="form-control" id="muniPropN" placeholder="Municipio" required="required">
                            
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2">Estado:</label>
                        <div class="col-sm-10">
                                <input type="text" class="form-control" id="edoPropN" placeholder="Estado" required="required">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2">País:</label>
                        <div class="col-sm-10">
                                <input type="text" class="form-control" id="paisPropN" placeholder="País" required="required">
                        </div>
                    </div>
                    <br> <br>
                    
                 <h3>Datos de la gaveta:</h3>
      <br>  
       <div class="form-group">
                        <label class="control-label col-sm-2">Lote:</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="lote" placeholder="Lote" required="required">
                        </div>
                    </div> 
      <div class="form-group">
                        <label class="control-label col-sm-2">Sección:</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="seccion" placeholder="Sección" required="required">
                        </div>
                    </div>
       <div class="form-group">
                        <label class="control-label col-sm-2">Localidad:</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="localidad" placeholder="Localidad" required="required">
                        </div>
                    </div>
       <div class="form-group">
                        <label class="control-label col-sm-2">Panteón:</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="panteon" placeholder="Panteón" required="required">
                        </div>
                    </div>      
        <br>
          <h3>Motivo de adquisición del terreno:</h3>
          <div clas="container" id="radiob" style="position: relative; left: 130px;">
                <form action="#">
                    
                    <br>
                    <input type="radio" name="motivo" value="inhum" checked> Servicio de  Inhumación<br>
  
  <h4>Casos Especiales</h4>
  <input type="radio" name="motivo" value="CEexh"> Exhumación<br>
  <input type="radio" name="motivo" value="CEcen"> Cenizas<br>
  <input type="radio" name="motivo" value="CErmed"> Reporte Médico<br>
  <br>
 
 
</form> 
    </div>
                <div class="form-group">        
                    <div class="col-sm-offset-2 col-sm-10" style="align-content: center">
                        <button type="submit" class="btn btn-default">Guardar</button>
                    </div>
                </div>
            </div>
    </form>
  </div>
</div>

    </body>
</html>
