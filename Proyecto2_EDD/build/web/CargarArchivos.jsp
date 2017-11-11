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
        <!--Script para Usuarios-->
        <script type="text/javascript">
        $(function() {
            $("label[for=file]").click(function(event) {
                event.preventDefault();
                $("#file").click();
            });
        });
        </script>
        <!--Script para Habitaciones-->
        <script type="text/javascript">
        $(function() {
            $("label[for=file1]").click(function(event) {
                event.preventDefault();
                $("#file1").click();
            });
        });
        </script>
        <!--Script para Reservaciones-->
        <script type="text/javascript">
        $(function() {
            $("label[for=file2]").click(function(event) {
                event.preventDefault();
                $("#file2").click();
            });
        });
        </script>
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
                    <button style="color: white; background-color: transparent; font-size: 20px; border:transparent; font-weight:400;"><img src="img/atras.png" width="30" height="35" style="padding-bottom:6px"> Regresar </button>
                </ul>
                </form>
            </div>            
        </nav>  
        <div class="container-fluid" style="color: white;">
            <div class="row content">
                <div class="col-sm-4 sidenav hidden-xs" style="text-align: center">        
                    <h1>USUARIOS</h1>
                    <form action="controllerUsuarios" method="POST" class="multi" enctype="multipart/form-data">
                        <div class="row">
                            <div class="col-lg-12">
                                <label for="file">
                                    <div class="input-group">
                                        <span class="input-group-btn">
                                            <button class="btn btn-warning" type="button">Cargar Archivo XML</button>
                                        </span>
                                        <input type="text" class="form-control" id="info" readonly="" style="background: #fff;" placeholder="Ningun Archivo Seleccionado">
                                    </div>                                                
                                </label>
                                <div class="input-group">
                                    <button type="submit" class="btn btn-danger">Subir Archivo Usuarios <span class="glyphicon glyphicon-upload"></span></button>                                                    
                                </div>
                                <div class="input-group">
                                    <strong><h1> 
                                        <%
                                            if(null!= request.getAttribute("ArchivoUsuarios"))
                                            {
                                                out.print(request.getAttribute("ArchivoUsuarios"));
                                            }
                                        %>                                
                                    </h1></strong>
                                </div>
                            </div>                                    
                        </div>            
                        <input class="multi" type="file" style="display: none;" onchange="$('#info').val($(this).val().split(/[\\|/]/).pop());" name="file" id="file">
                    </form>                     
                </div>
                <div class="col-sm-4 sidenav hidden-xs" style="text-align: center">        
                    <h1>HABITACIONES</h1>
                    <form action="controllerHabitaciones" method="POST" class="multi" enctype="multipart/form-data">
                        <div class="row">
                            <div class="col-lg-12">
                                <label for="file1">
                                    <div class="input-group">
                                        <span class="input-group-btn">
                                            <button class="btn btn-warning" type="button">Cargar Archivo XML</button>
                                        </span>
                                        <input type="text" class="form-control" id="info1" readonly="" style="background: #fff;" placeholder="Ningun Archivo Seleccionado">
                                    </div>                                                
                                </label>
                                <div class="input-group">
                                    <button type="submit" class="btn btn-primary">Subir Archivo Habitaciones <span class="glyphicon glyphicon-upload"></span></button>                                                    
                                </div>
                                <div class="input-group">
                                    <strong><h1> 
                                        <%
                                            if(null!= request.getAttribute("ArchivoHabitaciones"))
                                            {
                                                out.print(request.getAttribute("ArchivoHabitaciones"));
                                            }
                                        %>                                
                                    </h1></strong>
                                </div>
                            </div>                                    
                        </div>            
                        <input class="multi" type="file" style="display: none;" onchange="$('#info1').val($(this).val().split(/[\\|/]/).pop());" name="file1" id="file1">
                    </form>                    
                </div>
                <div class="col-sm-4 sidenav hidden-xs" style="text-align: center">        
                    <h1>RESERVACIONES</h1>
                    <form action="controllerReservaciones" method="POST" class="multi" enctype="multipart/form-data">
                        <div class="row">
                            <div class="col-lg-12">
                                <label for="file2">
                                    <div class="input-group">
                                        <span class="input-group-btn">
                                            <button class="btn btn-warning" type="button">Cargar Archivo XML</button>
                                        </span>
                                        <input type="text" class="form-control" id="info2" readonly="" style="background: #fff;" placeholder="Ningun Archivo Seleccionado">
                                    </div>                                                
                                </label>
                                <div class="input-group">
                                    <button type="submit" class="btn btn-success">Subir Archivo Reservaciones <span class="glyphicon glyphicon-upload"></span></button>                                                    
                                </div>
                                 <div class="input-group">
                                    <strong><h1> 
                                        <%
                                            if(null!= request.getAttribute("ArchivoReservaciones"))
                                            {
                                                out.print(request.getAttribute("ArchivoReservaciones"));
                                            }
                                        %>                                
                                   </h1></strong>
                                </div>
                            </div>                                    
                        </div>            
                        <input class="multi" type="file" style="display: none;" onchange="$('#info2').val($(this).val().split(/[\\|/]/).pop());" name="file2" id="file2">
                    </form>
                </div>
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
