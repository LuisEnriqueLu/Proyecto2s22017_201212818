from NodoB import NodoB
from Pagina import Pagina
from ListaB import ListaB

pagina = Pagina()
nodoB = NodoB()
claseListaB = ListaB()


class ArbolB:
	def __init__(self):
		self.inicio = Pagina()
		self.inicio2 = Pagina()
		self.inserta = NodoB()
		self.enlace = Pagina()
		self.pivote = False
		self.existe = False
		self.existe2 = False
		self.contadorArbolB=0
		self.nombresDeCarpetas = ""
		self.todasLasHabitaciones = ""
		self.RaizActualizada = None
		
	
	#CREAR NODO B
	def crearNodoInsertar(self, idNombre, nombre, descripcion, fecha1, fecha2, habitacion, reservada, idUsuario):
		nodob = NodoB(idNombre, nombre, descripcion, fecha1, fecha2, habitacion, reservada, idUsuario)
		self.InsertarArbolB(nodob, self.inicio)		
	
	
	#INSERTAR NODO EN EL ARBOL B
	def InsertarArbolB(self, clave, raiz):
		self.agregar(clave, raiz)
		if(self.pivote == True):
			self.inicio = Pagina(ramas=[None,None,None,None,None], claves=[None,None,None,None], cuentas=0)
			self.inicio.cuentas = 1
			self.inicio.claves[0] = self.inserta
			self.inicio.ramas[0] = raiz
			self.inicio.ramas[1] = self.enlace	
		
			
			
	#AGREGAR Y BALANCEAR
	def agregar(self, clave, raiz):
		pos = 0              
		self.pivote = False; 
		
		vacioBol = self.vacio(raiz)
		
		if(vacioBol == True):
			self.pivote = True
			self.inserta = clave
			self.enlace = None
		else:
			pos = self.existeNodo(clave, raiz)
			
			if(self.existe == True):
				self.pivote = False
			else:
				self.agregar(clave, raiz.ramas[pos])
				
				if(self.pivote == True):
					
					if(raiz.cuentas < 4):
						self.pivote = False;
						self.insertarClave(self.inserta, raiz, pos)
					else:
						self.pivote = True
						self.dividirPagina(self.inserta, raiz, pos)
						print("Inserto")
			
			
	#VERIFICAR SI LA RAIZ EXISTE
	def vacio(self, raiz):
		if(raiz == None or raiz.cuentas == 0):
			return True
		else:
			return False
		
	
	#INSERTAR CLAVES EN PAGINA
	def insertarClave(self, clave, raiz, posicion):
		i = raiz.cuentas
		
		while i != posicion:
			raiz.claves[i] = raiz.claves[i - 1]
			raiz.ramas[i + 1] = raiz.ramas[i]
			i-=1
		
		raiz.claves[posicion] = clave
		raiz.ramas[posicion + 1] = self.enlace
		val = raiz.cuentas+1
		raiz.cuentas = val
		print("Inserto Valor")
		
		
	#DIVIDIR PAGINA
	def dividirPagina(self, clave, raiz, posicion):
		pos = 0
		Posmda = 0
		if(posicion <= 2):
			Posmda = 2
		else:
			Posmda = 3
		
		Mder = Pagina(ramas=[None,None,None,None,None], claves=[None,None,None,None], cuentas=0)
		pos = Posmda + 1
		
		while pos != 5:
			i = ((pos - Posmda) - 1)
			j = (pos - 1)
			Mder.claves[i] = raiz.claves[j]
			Mder.ramas[pos - Posmda] = raiz.ramas[pos]
			pos+=1
		
		Mder.cuentas = 4 - Posmda
		raiz.cuentas = Posmda
		
		if(posicion <= 2):
			self.insertarClave(clave, raiz, posicion)
		else:
			self.insertarClave(clave, Mder, (posicion - Posmda))
			
		self.inserta = raiz.claves[raiz.cuentas - 1]
		Mder.ramas[0] = raiz.ramas[raiz.cuentas]
		val = raiz.cuentas - 1
		raiz.cuentas = val
		self.enlace = Mder
		
	
	#VERIFICAR SI EXISTE NODO	
	def existeNodo(self, clave, raiz):
		valor =0
		if(int(clave.idNombre) < int(raiz.claves[0].idNombre)):
			self.existe2 = False
			valor = 0
		else:
			valor = raiz.cuentas
			while (int(clave.idNombre) < int(raiz.claves[valor - 1].idNombre) and valor > 1):
				valor-=1
			
			if (int(clave.idNombre) < int(raiz.claves[valor - 1].idNombre)):
				self.existe = True
			else:
				self.existe = False
			
			if (int(clave.idNombre) == int(raiz.claves[valor - 1].idNombre)):
				self.existe2 = True
				print(raiz.claves[valor - 1].idNombre)
			else:
				self.existe2 = False
		
		return valor
	
	
	#BUSCAR NODO
	def retornarNodo(self, clave, raiz):
		valorEncontrado = None
		pos = 0
		vacioBol = self.vacio(raiz)
		
		if(vacioBol == True):
			print("No Existe")
		else:
			pos = self.existeNodo(clave, raiz)
			if(self.existe2 == True):
				valorEncontrado = raiz.claves[pos - 1]				
			else:
				valorEncontrado = self.retornarNodo(clave, raiz.ramas[pos])
		return valorEncontrado	
	
	
	#RetornarHabitaciones
	def retornarHabitaciones(self, nombreUsuario):	
		self.todasLasHabitaciones = ""
		self.RetornarArbolHabitaciones(self.inicio, nombreUsuario)
		if self.todasLasHabitaciones == "":
			return "nada" 
		else:
			return self.todasLasHabitaciones 
	
	#Retornar Habitaciones
	def RetornarArbolHabitaciones(self, raiz, nombreUsuario):
		nodo = raiz
	
		if(nodo == None):
			variable = "Hola Mundo"
		else:
			if (nodo.cuentas != 0):
				k=1
				while k <= nodo.cuentas:
					if nodo.claves[k - 1].idUsuario == nombreUsuario and nodo.claves[k - 1].Reservada == "si":
						self.todasLasHabitaciones += str(nodo.claves[k - 1].Habitacion) + "@"
					k+=1
				i=0
				while i <= nodo.cuentas:
					if (nodo.ramas[i] != None):
						if (nodo.ramas[i].cuentas != 0):					
							hola = "Mundo xD"
					i+=1
	
				j=0
				while j <= nodo.cuentas:
					self.RetornarArbolHabitaciones(nodo.ramas[j], nombreUsuario)
					j+=1
	
	
	
	
	#CREAR ARCHIVO
	def crearArchivo(self):
		archivo=open('C:\\Users\\l_enr\\Desktop\\ArbolB.txt','w')
		archivo.write('digraph G{\n')
		archivo.write("node [shape = record];\n");
		archivo.write("rankdir = TD;\n");
		archivo.close()
		self.CrearArchivoParche1(self.inicio)
		
	
	#CREAR ARCHIVO
	def crearArchivo2(self, raiz):
		archivo=open('C:\\Users\\l_enr\\Desktop\\ArbolB.txt','w')
		archivo.write('digraph G{\n')
		archivo.write("node [shape = record];\n");
		archivo.write("rankdir = TD;\n");
		archivo.close()
		self.CrearArchivoParche1(raiz)	
	
	#FORMATO DEL ARCHIVO
	def CrearArchivoParche1(self, raiz):
		self.inicio = raiz
		self.grabarArchivo(self.inicio)
		archivo=open('C:\\Users\\l_enr\\Desktop\\ArbolB.txt','a')
		archivo.write('}')
		archivo.close()
		
	#ESCRIBIR ARCHIVO
	def grabarArchivo(self, raiz):
		nodo = raiz		
		archivo=open('C:\\Users\\l_enr\\Desktop\\ArbolB.txt','a')		
		
		if(nodo == None):
			print("No hay nada que Graficar")
		else:
			if (nodo.cuentas != 0):
				archivo.writelines("activo_" + str(nodo.claves[0].idNombre) + " [label= \"")
				k=1
				while k <= nodo.cuentas:
					archivo.writelines("<r" + str(k - 1) + ">" + " | " + "<cl" + str(k) + ">" + "ID ArbolB: " + str(nodo.claves[k - 1].idNombre) + " &#92;" + "nNombre Registro: " + str(nodo.claves[k - 1].Nombre) + " | ")
					k+=1
				
				
				archivo.writelines("<r" + str(k - 1) + "> \"];\n")
				i=0
				while i <= nodo.cuentas:
					if (nodo.ramas[i] != None):
						if (nodo.ramas[i].cuentas != 0):
							archivo.writelines("activo_" + str(nodo.claves[0].idNombre) + ":r" + str(i) + " -> activo_" + str(nodo.ramas[i].claves[0].idNombre) + ";\n")							
						
					i+=1
					
				j=0
				while j <= nodo.cuentas:
					self.grabarArchivo(nodo.ramas[j])
					j+=1
		
	
	def actualizarH(self, idHabitacion):
		self.actualizarReservacion(idHabitacion, self.inicio)
		return "Nombre Actualizado"
					
	#MODIFICAR NOMBRE
	def actualizarReservacion(self, idHabitacion, raiz):
		nodo = raiz
	
		if(nodo == None):
			variable = "Hola Mundo"
		else:
			if (nodo.cuentas != 0):
				k=1
				while k <= nodo.cuentas:
					if nodo.claves[k - 1].Habitacion == idHabitacion:
						nodo.claves[k - 1].Reservada = "no"
						break
					k+=1
				i=0
				while i <= nodo.cuentas:
					if (nodo.ramas[i] != None):
						if (nodo.ramas[i].cuentas != 0):					
							hola = "Mundo xD"
					i+=1
	
				j=0
				while j <= nodo.cuentas:
					self.actualizarReservacion(idHabitacion, nodo.ramas[j])
					j+=1	
						
	
	
	#Eliminar
	def Eliminar(self, idEliminar):
		self.InsertarNodosLista(self.inicio)
		raizLista = claseListaB.retornarLista()
		self.inicio = Pagina(ramas=[None,None,None,None,None], claves=[None,None,None,None], cuentas=0)

		while raizLista != None:
			if raizLista.index != None and raizLista.nodoArbolB.idNombre != idEliminar:
				self.InsertarArbolB(raizLista.nodoArbolB, self.inicio)
			raizLista = raizLista.siguiente		

		claseListaB.Limpiar()
		return "Elimino"
	
	
	#Modificar
	def Modificar(self, idModificar, idNuevo):
		self.InsertarNodosLista(self.inicio)
		raizLista = claseListaB.retornarLista()
		self.inicio = Pagina(ramas=[None,None,None,None,None], claves=[None,None,None,None], cuentas=0)

		while raizLista != None:
			if raizLista.index != None :
				if raizLista.nodoArbolB.idNombre == idModificar:
					raizLista.nodoArbolB.idNombre = idNuevo
				self.InsertarArbolB(raizLista.nodoArbolB, self.inicio)
			raizLista = raizLista.siguiente		

		claseListaB.Limpiar()
		return "Valor Modificados"	
		
	
	#INSERTAR NODOS EN LISTA
	def InsertarNodosLista(self, raiz):
		nodo = raiz		
		
		if(nodo == None):
			print("No Hay Nada")
		else:
			if (nodo.cuentas != 0):
				k=1
				while k <= nodo.cuentas:
					claseListaB.insertar(nodo.claves[k - 1])					
					k+=1
					
				j=0
				while j <= nodo.cuentas:
					self.InsertarNodosLista(nodo.ramas[j])
					j+=1
					
								