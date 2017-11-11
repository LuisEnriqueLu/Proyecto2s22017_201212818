from ListaDoble import ListaDoble
from ListaSimpeCircular import ListaSimpleCircular
from ArbolB import ArbolB
from ListaB import ListaB
from TablaHash import TablaHash
from Matriz import Matriz
from NodoMatriz import NodoMatriz
from NodoH import NodoH
from ArbolAVL import ArbolAVL
from NodoAVL import NodoAVL
from NodoLista import NodoLista
from flask import Flask, request, Response

claseListaDoble = ListaDoble()
claseListaSimple = ListaSimpleCircular()
claseArbolB = ArbolB()
claseListaB = ListaB()
claseHash = TablaHash()
claseMatriz = Matriz()
claseArbolAvl = ArbolAVL()


app = Flask("Servidor_Python")

class Servidor():	
	#------------------------- REGISTRO USUARIO ----------------------------#
	@app.route('/RegistrarUsuario',methods=['POST']) 
	def RegistrarUsuario():
		try:
			usuario = str(request.form['usuario'])
			contrasena = str(request.form['contrasena'])
			edad = str(request.form['edad'])
			telefono = str(request.form['telefono'])
			direccion = str(request.form['direccion'])
			respuesta = claseListaDoble.Insertar(usuario, contrasena, edad, telefono, direccion)			
			return respuesta
		except: 
			return "Error en el Servidor"
		
	
	#------------------------- LOGIN USUARIO ----------------------------#
	@app.route('/LoginUsuario',methods=['POST']) 
	def LoginUsuario():
		try:
			usuario = str(request.form['usuario'])
			contrasena = str(request.form['contrasena'])
			respuesta = claseListaDoble.BuscarDatoLogin(usuario, contrasena)
			return respuesta
		except: 
			return "Error en el Servidor"
	
	
	
	#------------------------- HABITACIONES ----------------------------#
	@app.route('/Habitaciones',methods=['POST']) 
	def Habitaciones():
		try:
			nivel = str(request.form['nivel'])
			numero = str(request.form['numero'])
			idHabitacion = str(request.form['idHabitacion'])			
			respuesta = claseListaSimple.InsertarFinal(idHabitacion, nivel, numero, "no")
			return respuesta
		except: 
			return "Error en el Servidor"
	
	
	
	#------------------------- RETORNAR HABITACIONES ----------------------------#
	@app.route('/RetornarHabitaciones',methods=['POST']) 
	def RetornarHabitaciones():
		try:
			valorPost = str(request.form['valorPost'])
			respuesta = claseListaSimple.ImprimirDatos()
			return respuesta
		except: 
			return "Error en el Servidor"
		
	
	#------------------------- RETORNAR HABITACIONES USUARIO ----------------------------#
	@app.route('/retornarHabitacionesUsuarios',methods=['POST']) 
	def retornarHabitacionesUsuarios():
		try:
			nombreUsuario = str(request.form['nombreUsuario'])
			idUsuario = claseListaDoble.retornarID(nombreUsuario)
			respuesta = claseArbolB.retornarHabitaciones(idUsuario)
			return respuesta
		except: 
			return "Error en el Servidor"
	
	
	
	
	#------------------------- RETORNAR NIVEL-NUMERO----------------------------#
	@app.route('/NivelNumero',methods=['POST']) 
	def NivelNumero():
		try:
			idReservacion = str(request.form['idReservacion'])
			respuesta = claseListaSimple.RetornarNivelyHabitacion(idReservacion)
			return respuesta
		except: 
			return "Error en el Servidor"	
	
	
	
	#------------------------- RESERVACIONES-MATRIZ ----------------------------#
	@app.route('/Reservaciones',methods=['POST']) 
	def Reservaciones():
		try:
			idReservacion = str(request.form['idReservacion'])			
			anio = str(request.form['anio'])
			numeroMes = str(request.form['numeroMes'])
			dia = str(request.form['dia'])
			fechaReservacion = str(request.form['fechaReservacion'])
			fechaSalida = str(request.form['fechaSalida'])
			mes = claseMatriz.verMes(numeroMes)
			usuario = str(request.form['usuario'])
			numeroTarjeta = str(request.form['numeroTarjeta'])
			totalGastado = str(request.form['totalGastado'])
			
						
			claseMatriz.aumetarContador()
			codigo = str(claseMatriz.obtenerContador())
			nodoM = NodoMatriz(mes, numeroMes, anio, dia, codigo)
			if claseMatriz.existeReservacion(nodoM) == False:
				claseMatriz.agregarCabecerasMatriz(nodoM)
				if claseMatriz.necesitaProfundidad(nodoM) == True:
					claseMatriz.agregarProfundidad(nodoM)
				else:
					claseMatriz.agregarMatriz(nodoM)
			
			nodoHash = NodoH(idReservacion, usuario)
			claseMatriz.agregarTablaHash(nodoM, nodoHash)
			
			idUsuario = claseListaDoble.retornarID(usuario)
			claseArbolB.crearNodoInsertar(int(fechaReservacion), usuario, "Se Reservo la Habitacion: " + idReservacion + ", se Gasto " + totalGastado + ", se pago con No. Tarjeta " + numeroTarjeta, anio+numeroMes+dia, fechaSalida, idReservacion, "si", idUsuario)
			claseListaSimple.actualizarReservacion(idReservacion)
			
			nuevoNodo = NodoLista(numeroTarjeta, totalGastado)
			claseArbolAvl.agregarListaAVL(nuevoNodo)			
			
			return "Reservacion Exitosa"
		except: 
			return "Error en el Servidor"
	
	
	
	#---------------- CREAR ARCHIVO LISTA SIMPLE HABITACIONES ------------------#
	@app.route('/CrearArchivoListaSimpleHabitaciones') 
	def CrearArchivoListaSimpleHabitaciones():
		try:
			claseListaSimple.grabarArchivo()
			return "Archivo Lista Simple Creado"
		except: 
			return "Error en el Servidor"		
	
	
	
	#---------------- CREAR ARCHIVO LISTA DOBLE USUARIOS ------------------#
	@app.route('/CrearArchivoListaDobleUsuarios') 
	def CrearArchivoListaDobleUsuarios():
		try:
			claseListaDoble.grabarArchivo2()
			return "Archivo Lista Doble Creado"
		except: 
			return "Error en el Servidor"
	
	
	#---------------- CREAR ARCHIVO RESERVACIONES MATRIZ ------------------#
	@app.route('/CrearArchivoMatriz') 
	def CrearArchivoMatriz():
		try:
			claseMatriz.ArchivoMatriz()
			return "Archivo Matriz Creado"
		except: 
			return "Error en el Servidor"
	
	
	#------------ ACTUALIZAR EN EL B, LA HABITACION -----------------#
	@app.route('/ActualizarHReser',methods=['POST']) 
	def ActualizarHReser():
		try:
			idHabitacion = str(request.form['idHabitacion'])
			claseArbolB.actualizarH(idHabitacion)
			claseListaSimple.actualizarReservacionDevuelta(idHabitacion)
			return "Dato Actualizado"
		except: 
			return "Error en el Servidor"	
	
	
	
	#------------ CREAR ARCHIVO RESERVACIONES TABLA HASH -----------------#
	@app.route('/CrearTablaHash',methods=['POST']) 
	def CrearTablaHash():
		try:
			anio = str(request.form['anio'])
			numeroMes = str(request.form['numeroMes'])
			dia = str(request.form['dia'])
			mes = claseMatriz.verMes(numeroMes)			
		
			nodoM = NodoMatriz(mes, numeroMes, anio, dia)
			
			claseMatriz.graficarTablaHash(nodoM)
			return "Archivo Tabla Hash Creado"
		except: 
			return "Error en el Servidor"	
		
	
	#---------------- CREAR ARCHIVO BITACORA ARBOL B -------------------#
	@app.route('/CrearArchivoArbolB') 
	def CrearArchivoArbolB():
		try:
			claseArbolB.crearArchivo()
			return "Archivo Arbol B Creado"
		except: 
			return "Error en el Servidor"
		
		
	#---------------- CREAR ARCHIVO AVL ------------------#
	@app.route('/CrearArchivoAVL') 
	def CrearArchivoAVL():
		try:
			claseArbolAvl.grabarArchivoAVL()
			return "Archivo Arbol AVL Creado"
		except: 
			return "Error en el Servidor"	
		
	
	#------------------------- ELIMINAR USUARIO ----------------------------#
	@app.route('/eliminarUsuario',methods=['POST']) 
	def eliminarUsuario():
		try:
			usuario = str(request.form['usuario'])
			contrasena = str(request.form['contrasena'])
			respuesta = claseListaDoble.Eliminar(usuario, contrasena)
			return respuesta
		except: 
			return "Error en el Servidor"	
		
	
	#-------------------------- FIN -------------------------------------#
	if __name__ == "__main__":
		app.run(debug=True, host='127.0.0.5')
