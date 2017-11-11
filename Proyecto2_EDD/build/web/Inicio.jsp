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
                    <button style="color: white; background-color: transparent; font-size: 20px; border:transparent; font-weight:400;"><img src="img/salida.png" width="30" height="35" style="padding-bottom:6px"> <%= request.getAttribute("respuestaPython") %> - Cerrar Sesión </button>
                </ul>
                </form>                
            </div>            
        </nav> 
        <div class="container-fluid" style="color: white;">
            <div class="row content">
                <form action="reservar" method="POST">
                    <div class="col-sm-6">
                        <div class="panel panel-warning" style="border: 2px solid; border-color:#faebcc; color: #8a6d3b; background-color: rgba(0,0,0,0.1);">
                            <div class="panel-heading">
                                <h2 class="panel-title"><strong>HABITACIONES DISPONIBLES</strong></h2>
                                </div>
                                <div class="panel-body">
                                    <%
                                        if(null!= request.getAttribute("habitaciones"))
                                        {
                                            out.print(request.getAttribute("habitaciones"));
                                        }
                                    %>
                                </div>
                            </div>                    
                    </div> 
                    <div class="col-sm-3">
                        <div class="panel panel-info" style="border: 2px solid; border-color:#bce8f1; color: darkblue; background-color: rgba(0,0,0,0.1);">
                            <div class="panel-heading">
                                <h2 class="panel-title"><strong>EXTRAS - FECHA RESERVACIÓN</strong></h2>
                            </div>
                            <div class="panel-body" style="font-size: 18px">                            
                                    <div class="form-group">
                                        <div class="checkbox">
                                            <label>
                                                <input type="checkbox" value="Limpieza" name="ch1">Limpieza
                                            </label>
                                        </div>
                                        <div class="checkbox">
                                            <label>
                                                <input type="checkbox" value="Cable" name="ch2">Cable
                                            </label>
                                        </div>
                                        <div class="checkbox">
                                            <label>
                                                <input type="checkbox" value="Internet" name="ch3">Internet
                                            </label>
                                        </div>
                                        <div class="checkbox">
                                            <label>
                                                <input type="checkbox" value="Comida" name="ch4">Comida
                                            </label>
                                        </div>
                                        <div class="checkbox">
                                            <label>
                                                <input type="checkbox" value="Netflix" name="ch5">Netflix
                                            </label>
                                        </div>
                                    </div> 
                                    <div class="col-sm-6">
                                        <h4>Fecha E</h4>
                                        <div class="form-group has-success">
                                            <label class="control-label" for="inputSuccess">Dia</label>
                                            <input name="diaE" type="text" style="color: darkblue; font-size: 19px; background-color: rgba(0,0,0,0); border: 2px solid; border-color: #3c763d" class="form-control" id="inputSuccess">
                                        </div>
                                        <div class="form-group has-warning">
                                            <label class="control-label" for="inputWarning">Mes</label>
                                            <input name="mesE" type="text" style="color: darkblue; font-size: 19px; background-color: rgba(0,0,0,0); border: 2px solid; border-color: #8a6d3b" class="form-control" id="inputWarning">
                                        </div>
                                        <div class="form-group has-error">
                                            <label class="control-label" for="inputError">Año</label>
                                            <input name="anioE" type="text" style="color: darkblue; font-size: 19px; background-color: rgba(0,0,0,0); border: 2px solid; border-color: #a94442" class="form-control" id="inputError">
                                        </div>
                                    </div>
                                    <div class="col-sm-6">
                                        <h4>Fecha S</h4>
                                        <div class="form-group has-success">
                                            <label class="control-label" for="inputSuccess">Dia</label>
                                            <input name="diaS" type="text" style="color: darkblue; font-size: 19px; background-color: rgba(0,0,0,0); border: 2px solid; border-color: #3c763d" class="form-control" id="inputSuccess">
                                        </div>
                                        <div class="form-group has-warning">
                                            <label class="control-label" for="inputWarning">Mes</label>
                                            <input name="mesS" type="text" style="color: darkblue; font-size: 19px; background-color: rgba(0,0,0,0); border: 2px solid; border-color: #8a6d3b" class="form-control" id="inputWarning">
                                        </div>
                                        <div class="form-group has-error">
                                            <label class="control-label" for="inputError">Año</label>
                                            <input name="anioS" type="text" style="color: darkblue; font-size: 19px; background-color: rgba(0,0,0,0); border: 2px solid; border-color: #a94442" class="form-control" id="inputError">
                                        </div>
                                    </div>
                                    <div class="col-sm-12">
                                        <ul class="nav nav-pills nav-stacked">
                                            <button type="submit" class="btn btn-success btn-circle btn-lg"><i class="glyphicon glyphicon-ok"></i></button>
                                            <%--<button type="submit" class="btn btn-success">RESERVAR <span class="glyphicon glyphicon-header"></span></button>--%>
                                        </ul>
                                    </div>                            
                            </div>
                        </div>
                    </div>
                </form>
                <div class="col-sm-3">
                    <form action="pagar" method="POST">
                        <div class="panel panel-danger" style="border: 2px solid; border-color:#ebccd1; color: #a94442; background-color: rgba(0,0,0,0.1);">
                            <div class="panel-heading">
                                <h2 class="panel-title"><strong>PAGAR</strong></h2>
                            </div>
                            <div class="panel-body">
                                <div class="alert alert-success" style="color: #333; background-color: #f5f5f5; border-color: #ddd; font-size: 15px; padding:10px;">
                                    <strong>Fecha de Entrada: 
                                        <%
                                            if(null!= request.getAttribute("fechaE"))
                                            {
                                                out.print(request.getAttribute("fechaE"));
                                            }
                                        %>                                
                                    </strong>
                                </div>
                                <div class="alert alert-info" style="font-size: 15px; padding:10px;">
                                    <strong>Fecha de Salida: 
                                        <%
                                            if(null!= request.getAttribute("fechaS"))
                                            {
                                                out.print(request.getAttribute("fechaS"));
                                            }
                                        %>                                
                                    </strong>
                                </div>
                                <div class="alert alert-success" style="font-size: 15px; padding:10px;">
                                    <strong>Costo de Habitación: 
                                        <%
                                            if(null!= request.getAttribute("totalHabitacion"))
                                            {
                                                out.print(request.getAttribute("totalHabitacion"));
                                            }
                                        %> 
                                    </strong>
                                </div>
                                <div class="alert alert-warning" style="font-size: 15px; padding:10px;">
                                    <strong>Total de Extras: 
                                        <%
                                            if(null!= request.getAttribute("totalExtras"))
                                            {
                                                out.print(request.getAttribute("totalExtras"));
                                            }
                                        %>
                                    </strong>
                                </div>                            
                                <div class="alert alert-danger" style="font-size: 15px; padding:10px;">
                                    <strong>Total a Pagar Q.
                                        <%
                                            if(null!= request.getAttribute("total"))
                                            {
                                                out.print(request.getAttribute("total"));
                                            }
                                        %>
                                    </strong>
                                </div>
                                <div class="form-group input-group">
                                    <span class="input-group-addon" style="color:#a94442; border: 1.5px solid; border-color:#ebccd1; background-color: #f2dede;"><strong>No. Tarjeta</strong></span>
                                    <input type="text" name="tarjeta" class="form-control" style="font-size: 19px; color:#a94442; border: 1.5px solid; border-color:#ebccd1; background-color: rgba(0,0,0,0);">
                                    <span class="input-group-addon" style="color:#a94442; border: 1.5px solid; border-color:#ebccd1; background-color: #f2dede;"><strong>$</strong></span>
                                </div>                            
                                <ul class="nav nav-pills nav-stacked">
                                    <button type="submit" class="btn btn-warning">PAGAR <span class="glyphicon glyphicon-euro"></span></button>
                                </ul>
                            </div>
                        </div>
                    </form>             
                </div>
                <div class="col-sm-3">
                    <form action="habitacionesADevolver" method="POST">
                        <div class="panel panel-success" style="border: 2px solid; border-color:#d6e9c6; color: #a94442; background-color: rgba(0,0,0,0.1);">
                            <div class="panel-heading">
                                <h2 class="panel-title"><strong>Devolver</strong></h2>
                            </div>
                            <div class="panel-body">
                                <button type="submit" class="btn btn-primary">DEVOLVER HABITACIONES <span class="glyphicon glyphicon-repeat"></span></button>
                            </div>
                        </div>
                    </form>
                </div>
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

