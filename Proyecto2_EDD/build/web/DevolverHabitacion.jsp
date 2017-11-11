<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HOTEL EL LOBO</title>
        <link rel="shortcut icon" href="img/hotel.png"/>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/bootstrap.css" rel="stylesheet">
        <link href="css/login.css" rel="stylesheet">
        <link href="fonts/font-awesome.min.css" rel="stylesheet">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>        
        <script src="js/login.js"></script>        
    </head> 
    <body>
        <nav class="navbar navbar-fixed-top" style="background-color: rgba(0,0,0,0.2);">
            <div class="container-fluid">
                <div class="nav navbar-nav">
                    <ul class="nav navbar-nav navbar-left">
                        <li><a style="padding-left: 0px; color: aliceblue; background-color: transparent; font-size: 25px; font-weight:400;"><img src="img/hotel.png" width="30" height="35" style="padding-bottom:6px"> BIENVENIDO A HOTEL EL LOBO</a></li>                    
                    </ul>
                </div>
                <form action="controllerCerrarSesion" method="POST">
                <ul class="nav navbar-nav navbar-right" style="padding-top: 18px; padding-right: 10px">
                    <button style="color: white; background-color: transparent; font-size: 20px; border:transparent; font-weight:400;"><img src="img/salida.png" width="30" height="35" style="padding-bottom:6px"> <%= request.getAttribute("respuestaPython") %> - Cerrar Sesión </button>
                </ul>
                </form>
                <form action="regresar" method="POST">
                <ul class="nav navbar-nav navbar-right" style="padding-top: 18px; padding-right: 10px">
                    <button style="color: white; background-color: transparent; font-size: 20px; border:transparent; font-weight:400;"><img src="img/atras.png" width="30" height="35" style="padding-bottom:6px"> Regresar </button>
                </ul>
                </form>
            </div>            
        </nav>  
        <div class="container-fluid" style="color: white;">
            <div class="row content">
                <form action="devolver" method="POST">
                    <div class="col-sm-6">
                        <div class="panel panel-warning" style="border: 2px solid; border-color:#faebcc; color: #8a6d3b; background-color: rgba(0,0,0,0.1);">
                            <div class="panel-heading">
                                    <h2 class="panel-title"><strong>HABITACIONES DISPONIBLES</strong></h2>
                                </div>
                                <div class="panel-body">
                                    <%
                                        if(null!= request.getAttribute("habitacionesDevolver"))
                                        {
                                            out.print(request.getAttribute("habitacionesDevolver"));
                                        }
                                    %>
                                </div>
                            </div>                    
                    </div>
                    <div class="col-sm-3">
                        <div class="panel panel-success" style="border: 2px solid; border-color:#d6e9c6; color: #a94442; background-color: rgba(0,0,0,0.1);">
                            <div class="panel-heading">
                                <h2 class="panel-title"><strong>DEVOLVER</strong></h2>
                            </div>
                            <div class="panel-body">
                                <button type="submit" class="btn btn-primary">DEVOLVER HABITACION <span class="glyphicon glyphicon-repeat"></span></button>
                            </div>
                        </div>                    
                    </div>
                </form>
            </div>
        </div>        
        <footer class="footer" style="background-color: rgba(0,0,0,.2); text-align: center; position: fixed; bottom: 0px; width: 100%; height: 45px;">
            <div class="container" style="margin-top: 12px">
                <span style="color: white;">Copyright &copy;  HOTEL EL LOBO 2017</span>
            </div>
        </footer> 
        <script src="js/login.js"></script>
        <script src="js/jquery.js"></script>
        <script src="js/jquery1.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
