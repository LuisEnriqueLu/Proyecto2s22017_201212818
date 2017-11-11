<%@page import="procesos.conexionPython"%>
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
        <link href="css/sb-admin-2.css" rel="stylesheet">
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
                    <button style="color: white; background-color: transparent; font-size: 20px; border:transparent; font-weight:400;"><img src="img/atras.png" width="30" height="35" style="padding-bottom:6px"> Regresar </button>
                </ul>
                </form>
            </div>            
        </nav> 
        <div class="container-fluid" style="color: white;">
            <div class="row content">
                <form action="crearHabitaciones" method="POST">
                    <div class="col-sm-4">
                        <div class="panel panel-success" style="border: 2px solid; border-color:#d6e9c6; color: #a94442; background-color: rgba(0,0,0,0.1);">
                            <div class="panel-heading">
                                <h2 class="panel-title"><strong>CREAR HABITACIONES</strong></h2>
                            </div>
                            <div class="panel-body">
                                <div style="padding: 5px">
                                    <input name="nivel" class="form-control" placeholder="NIVEL">
                                </div>
                                <div style="padding: 5px">
                                    <input name="habitacion" class="form-control" placeholder="HABITACION">
                                </div>
                                <div style="padding: 5px">
                                    <button type="submit" class="btn btn-success">Crear Habitación <span class="glyphicon glyphicon-header"></span></button>
                                </div>
                            </div>                             
                        </div>                    
                    </div> 
                </form> 
                <form action="eliminarUsuarios" method="POST">
                    <div class="col-sm-4">
                        <div class="panel panel-danger" style="border: 2px solid; border-color:#ebccd1; color: #a94442; background-color: rgba(0,0,0,0.1);">
                            <div class="panel-heading">
                                <h2 class="panel-title"><strong>ELIMINAR USUARIOS</strong></h2>
                            </div>
                            <div class="panel-body">
                                <div style="padding: 5px">
                                    <input name="nombre" class="form-control" placeholder="NOMBRE">
                                </div>
                                <div style="padding: 5px">
                                    <input name="contrasena" class="form-control" placeholder="CONTRASEÑA">
                                </div>
                                <div style="padding: 5px">
                                    <button type="submit" class="btn btn-danger">Eliminar Usuarios <span class="glyphicon glyphicon-erase"></span></button>
                                </div>
                            </div>                             
                        </div>                    
                    </div> 
                </form>
                <form action="modificarUsuarios" method="POST">
                    <div class="col-sm-4">
                        <div class="panel panel-info" style="border: 2px solid; border-color:#bce8f1; color: darkblue; background-color: rgba(0,0,0,0.1);">
                            <div class="panel-heading">
                                <h2 class="panel-title"><strong>MODIFICAR USUARIOS</strong></h2>
                            </div>
                            <div class="panel-body">
                                <div class="col-sm-6" style="padding: 5px">
                                    <input name="nombreUsuario" class="form-control" placeholder="NOMBRE">
                                </div>
                                <div class="col-sm-6" style="padding: 5px">
                                    <input name="contraseña" class="form-control" placeholder="Nueva Contraseña">
                                </div>
                                <div class="col-sm-6" style="padding: 5px">
                                    <input name="edad" class="form-control" placeholder="Nueva Edad">
                                </div>
                                <div class="col-sm-6" style="padding: 5px">
                                    <input name="telefono" class="form-control" placeholder="Nuevo Telefono">
                                </div>
                                <div style="padding: 5px">
                                    <input name="direccion" class="form-control" placeholder="Nueva Direccion">
                                </div>
                                <div style="padding: 5px">
                                    <button type="submit" class="btn btn-primary">Modificar Usuarios <span class="glyphicon glyphicon-edit"></span></button>
                                </div>
                            </div>                             
                        </div>                    
                    </div> 
                </form>
                <form action="eliminarHabitaciones" method="POST">
                    <div class="col-sm-4">
                        <div class="panel panel-danger" style="border: 2px solid; border-color:#ebccd1; color: #a94442; background-color: rgba(0,0,0,0.1);">
                            <div class="panel-heading">
                                <h2 class="panel-title"><strong>ELIMINAR HABITACIONES</strong></h2>
                            </div>
                            <div class="panel-body">
                                <div style="padding: 5px">
                                    <input name="idHabitacion" class="form-control" placeholder="Habitación">
                                </div>                                
                                <div style="padding: 5px">
                                    <button type="submit" class="btn btn-danger">Eliminar Habitaciones <span class="glyphicon glyphicon-erase"></span></button>
                                </div>
                            </div>                             
                        </div>                    
                    </div> 
                </form>
                <form action="modificarAVL" method="POST">
                    <div class="col-sm-4">
                        <div class="panel panel-info" style="border: 2px solid; border-color:#bce8f1; color: darkblue; background-color: rgba(0,0,0,0.1);">
                            <div class="panel-heading">
                                <h2 class="panel-title"><strong>MODIFICAR AVL</strong></h2>
                            </div>
                            <div class="panel-body">
                                <div class="col-sm-6" style="padding: 6px">
                                    <input name="tarjeta" class="form-control" placeholder="Tarjeta">
                                </div>
                                <div class="col-sm-6" style="padding: 6px">
                                    <input name="monto" class="form-control" placeholder="Monto">
                                </div>
                                <div style="padding: 6px">
                                    <button type="submit" class="btn btn-primary">Modificar AVL <span class="glyphicon glyphicon-edit"></span></button>
                                </div>
                            </div>                             
                        </div>                    
                    </div> 
                </form>
                <form action="eliminarAVL" method="POST">
                    <div class="col-sm-4">
                        <div class="panel panel-danger" style="border: 2px solid; border-color:#ebccd1; color: #a94442; background-color: rgba(0,0,0,0.1);">
                            <div class="panel-heading">
                                <h2 class="panel-title"><strong>ELIMINAR AVL</strong></h2>
                            </div>
                            <div class="panel-body">
                                <div style="padding: 5px">
                                    <input name="idtarjeta" class="form-control" placeholder="Tarjeta">
                                </div>                                
                                <div style="padding: 5px">
                                    <button type="submit" class="btn btn-danger">Eliminar AVL <span class="glyphicon glyphicon-erase"></span></button>
                                </div>
                            </div>                             
                        </div>                    
                    </div> 
                </form>
                <form action="modificarB" method="POST">
                    <div class="col-sm-4">
                        <div class="panel panel-info" style="border: 2px solid; border-color:#bce8f1; color: darkblue; background-color: rgba(0,0,0,0.1);">
                            <div class="panel-heading">
                                <h2 class="panel-title"><strong>MODIFICAR B</strong></h2>
                            </div>
                            <div class="panel-body">
                                <div class="col-sm-6" style="padding: 6px">
                                    <input name="idanterior" class="form-control" placeholder="ID Anterior">
                                </div>
                                <div class="col-sm-6" style="padding: 6px">
                                    <input name="idnuevo" class="form-control" placeholder="ID Nuevo">
                                </div>
                                <div style="padding: 6px">
                                    <button type="submit" class="btn btn-primary">Modificar B <span class="glyphicon glyphicon-edit"></span></button>
                                </div>
                            </div>                             
                        </div>                    
                    </div> 
                </form>
                <form action="eliminarB" method="POST">
                    <div class="col-sm-4">
                        <div class="panel panel-danger" style="border: 2px solid; border-color:#ebccd1; color: #a94442; background-color: rgba(0,0,0,0.1);">
                            <div class="panel-heading">
                                <h2 class="panel-title"><strong>ELIMINAR B</strong></h2>
                            </div>
                            <div class="panel-body">
                                <div style="padding: 5px">
                                    <input name="ideliminar" class="form-control" placeholder="ID Eliminar">
                                </div>                                
                                <div style="padding: 5px">
                                    <button type="submit" class="btn btn-danger">Eliminar B <span class="glyphicon glyphicon-erase"></span></button>
                                </div>
                            </div>                             
                        </div>                    
                    </div> 
                </form>
            </div>
        </div>        
        <footer class="footer" style="background-color: rgba(0,0,0,.2); text-align: center; bottom: 0px; width: 100%; height: 45px;">
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


