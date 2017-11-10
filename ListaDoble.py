from NodoLD import NodoLD

class ListaDoble:
	def __init__(self):
		self.primero = None
		self.ultimo = None
		self.contador = 0		
	
	#INSERTAR
	def Insertar(self, NombreUsuario, Contrasena, Edad, Telefono, Direccion):
		buscar =""
		buscar = self.BuscarDatos(NombreUsuario)
		if buscar != "True":
			self.contador +=1
			if self.primero == None:
				self.primero = self.ultimo = NodoLD(self.contador, NombreUsuario, Contrasena, Edad, Telefono, Direccion)
			else:
				aux = self.ultimo
				self.ultimo = aux.siguiente = NodoLD(self.contador, NombreUsuario, Contrasena, Edad, Telefono, Direccion)
				self.ultimo.anterior = aux
			return "Usuario Creado con Exito!!"
		else:
			return "Usuario Repetido, No se Puede Crear"
			
	
	#IMPRIMIR DATOS
	def ImprimirDatos(self):
		cadenaDatos =""
		aux = self.primero
		while aux != None:
			cadenaDatos += aux.NombreUsuario + " "
			aux = aux.siguiente
		
		return cadenaDatos
			
			
	#BUSCAR DATO
	def BuscarDatos(self, usuario):
		aux = self.primero
		while aux != None:
			if aux.NombreUsuario == usuario:
				return "True"
			else:
				aux = aux.siguiente		
				
	
	#BUSCAR DATO PARA LOGIN
	def BuscarDatoLogin(self, usuario, contrasena):
		aux = self.primero
		while aux != None:
			if aux.NombreUsuario == usuario and aux.Contrasena == contrasena:
				return "True"
			aux = aux.siguiente
			if aux == None:
				return "False"
	
	
	#CREAR ARCHIVO PARA GRAFICAR
	def grabarArchivo(self):
		cont1 = 0
		temp = self.primero		
		
		archivo=open('C:\\Users\\l_enr\\Desktop\\ListaDobleUsuarios.txt','w')				
		archivo.write('digraph G{\n')		
		archivo.write("node [shape = record];\n");
		archivo.write("rankdir = LR;\n");		
		
		while temp != None:
			archivo.write(str(temp.NombreUsuario) + "_nodo_" + str(cont1) + " [label="+str(temp.NombreUsuario)+"]\n")
			cont1=cont1+1
			temp = temp.siguiente
			if temp == self.primero:
				break			
		
		cont1 = 0
		cont2 = cont1+1
		temp = self.primero		
		while temp != None:
			if temp.siguiente != None:
				archivo.write(str(temp.NombreUsuario)+"_nodo_"+str(cont1)+"->"+str(temp.siguiente.NombreUsuario)+"_nodo_"+str(cont2)+"\n")
				cont1=cont1+1
				cont2=cont2+1
			temp = temp.siguiente
			if temp == self.ultimo:
				break	
		
		contUltimo=cont1
		cont2 = cont1-1
		temp = self.ultimo			
		while temp != None:
			if temp.anterior != None:
				archivo.write(str(temp.NombreUsuario)+"_nodo_"+str(cont1)+"->"+str(temp.anterior.NombreUsuario)+"_nodo_"+str(cont2)+"\n")
				cont1=cont1-1
				cont2=cont2-1
			temp = temp.anterior
			if temp == self.primero:
				break		
		
		archivo.write('}')
		archivo.close()