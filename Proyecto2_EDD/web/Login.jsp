<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="min-height: 100%; position: relative;">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HOTEL EL LOBO</title>
        <link rel="shortcut icon" href="img/hotel.png"/>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/bootstrap.css" rel="stylesheet">
        <link href="css/login.css" rel="stylesheet">
        <link href="fonts/font-awesome.min.css" rel="stylesheet">
        <link href="css/estilos.ccs" rel="stylesheet">          
    </head>    
    <body style="padding-top: 50px">
        <nav class="navbar navbar-fixed-top" style="background-color: transparent;">
            <div class="container-fluid">
                <ul class="nav navbar-nav navbar-right" style="padding-top: 18px; padding-right: 10px">
                    <form action="CargarArchivos.jsp">
                        <img src="img/archivo.png" width="30" height="35" style="padding-bottom:6px"><input type="submit" style="color: aliceblue; background-color: transparent; font-size: 20px; font-weight:400; border:transparent;" value="CARGAR ARCHIVOS">                                                
                    </form>
                    <a href="CrearModEliminar.jsp"><img src="img/archivo.png" width="30" height="35" style="padding-bottom:6px"><input type="submit" style="color: aliceblue; background-color: transparent; font-size: 20px; font-weight:400; border:transparent;" value="CREAR - MODIFICAR - ELIMINAR"></a>
                </ul>
            </div>            
        </nav> 
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">        
        <div class="container">
            <div class="row">
                <div class="col-md-6 col-md-offset-3">                    
                    <div class="panel panel-login">          
                        <div class="panel-body">                            
                            <div class="col-md-12">                        
                                <div class="col-lg-12">
                                    <h3 style="color: #2D3B55; text-align: center"></p><img src="img/hotel.png" width="30" height="35" style="padding-bottom:6px"> BIENVENIDO A HOTEL EL LOBO</h3> 
                                </div>                        
                            </div>
                            <div class="row" style="color: #2D3B55;">                                
                                <div class="col-lg-12">
                                    <%--Formulario para Iniciar Sesión--%>
                                    <form id="login-form" action="controllerLogin" method="POST" role="form" style="display: block;">
                                        <h2><p class="glyphicon glyphicon-log-in"></p>  INICIAR SESIÓN</h2>
                                        <div class="form-group">
                                            <input type="text" name="usuario" tabindex="1" class="form-control" placeholder="Nombre de Usuario" required="" style="font-weight:400;">
                                        </div>
                                        <div class="form-group">
                                            <input type="password" name="contrasena" tabindex="2" class="form-control" placeholder="Contraseña" required="" pattern=".{4,15}" style="font-weight:400;">
                                        </div>                                        
                                        <div class="col-xs-6 form-group pull-right">     
                                            <input type="submit" name="btnLogin" tabindex="6" class="form-control btn btn-login" value="Iniciar Sesión">
                                        </div>
                                    </form>
                                    <%--Formulario para Registro de Usuarios--%>
                                    <form id="register-form" action="controllerRegistrar" method="POST" role="form" style="display: none;">
                                        <h2><p class="glyphicon glyphicon-log-out"></p>  REGISTRO DE USUARIOS</h2>
                                        <div class="form-group">
                                            <input type="text" name="usuario" tabindex="1" class="form-control" placeholder="Nombre de Usuario" required="" style="font-weight:400;">
                                        </div>
                                        <div class="form-group">
                                            <input type="password" name="contrasena" tabindex="2" class="form-control" placeholder="Contraseña" required="" style="font-weight:400;">
                                        </div>
                                        <div class="col-xs-6 form-group pull-left">
                                            <input type="text" name="edad" tabindex="3" class="form-control" placeholder="Edad" required="" style="font-weight:400;">
                                        </div>                                        
                                        <div class="col-xs-6 form-group pull-right">
                                            <input type="text" name="telefono" tabindex="4" class="form-control" placeholder="Telefono" required="" style="font-weight:400;">
                                        </div>
                                        <div class="form-group">
                                            <input type="text" name="direccion" tabindex="5" class="form-control" placeholder="Direccion" required="" style="font-weight:400;">
                                        </div>
                                        <div class="form-group">
                                            <div class="row">
                                                <div class="col-sm-6 col-sm-offset-3">
                                                    <input type="submit" name="register-submit" tabindex="6" class="form-control btn btn-register" value="Registrar">
                                                </div>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>                                    
                        <div class="panel-heading">
                            <div class="row">
                                <div class="col-xs-6 tabs">
                                    <a href="#" class="active" id="login-form-link"><div class="login" style="font-weight:400;"><img src="img/login.png" width="30" height="35" style="padding-bottom:6px"> INICIAR SESIÓN</div></a>                                        
                                </div>                                
                                <div class="col-xs-6 tabs">
                                    <a href="#" id="register-form-link"><div style="text-align: left" class="register" style="font-weight:400;"><img src="img/log.png" width="30" height="35" style="padding-bottom:6px"> REGISTRAR USUARIOS</div></a>                                        
                                </div>                                              
                            </div>                                
                        </div>                        
                    </div>                        
                </div>                    
            </div>
            <div class="row" style="margin-top:0px">
                <div class="col-md-6 col-md-offset-3">                    
                    <div class="col-lg-12">
                        <h3 style="color: #2D3B55; text-align: center">
                        <%
                            if(null!= request.getAttribute("respuestaPython"))
                            {
                            out.print(request.getAttribute("respuestaPython"));
                            }
                        %></h3>
                    </div>
                </div>
            </div>            
        </div>        
        <footer class="footer" style="background-color: rgba(0,0,0,.2); text-align: center; position: fixed; bottom: 0px; width: 100%; height: 45px;">
            <div class="container" style="margin-top: 12px">
                <span style="color: white;">Copyright &copy;  HOTEL EL LOBO 2017</span>
            </div>
        </footer> 
        <script src="js/jquery.js"></script>
        <script src="js/jquery1.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>        
        <script src="js/login.js"></script>  
    </body> 
</html>