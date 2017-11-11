from NodoLSC import NodoLSC

class ListaSimpleCircular:
	def __init__(self):
		self.primero = None
		self.ultimo = None				
	
	#INSERTAR AL INICIO
	def InsertarInicio(self, idHabitacion, nivel, numero, reservada):
		if self.primero == None:
			self.primero = self.ultimo = NodoLSC(idHabitacion, nivel, numero, reservada)
		else:			
			aux = NodoLSC(idHabitacion, nivel, numero, reservada)
			aux.siguiente = self.primero
			self.primero.anterior = aux
			self.primero = aux
		self.primero.anterior = self.ultimo
		self.ultimo.siguiente = self.primero
		return "Dato Insertado"
		
	
	#INSERTAR AL FINAL
	def InsertarFinal(self, idHabitacion, nivel, numero, reservada):
		if self.primero == None:
			self.primero = self.ultimo = NodoLSC(idHabitacion, nivel, numero, reservada)
		else:			
			aux = self.ultimo
			self.ultimo = aux.siguiente = NodoLSC(idHabitacion, nivel, numero, reservada)
			self.ultimo.anterior = aux
		self.primero.anterior = self.ultimo
		self.ultimo.siguiente = self.primero
		return "Dato Insertado"
		
	
	#IMPRIMIR
	def ImprimirDatos(self):
		cadenaDatos =""
		aux = self.primero
		while aux:
			if aux.reservada != "si":
				cadenaDatos += aux.IdHabitaciones + "@"
			aux = aux.siguiente
			if aux == self.primero:
				break			
		return cadenaDatos
	
	#IMPRIMIR
	def RetornarNivelyHabitacion(self, idHabitacion):
		cadenaDatos =""
		aux = self.primero
		while aux:
			if aux.IdHabitaciones == idHabitacion:
				cadenaDatos = aux.nivel + "," +aux.numero				
			aux = aux.siguiente
			if aux == self.primero:
				break			
		return cadenaDatos	
	
	
	#ACTUALIZAR
	def actualizarReservacion(self, idHabitacion):
		aux = self.primero
		while aux:
			if aux.IdHabitaciones == idHabitacion:
				aux.reservada = "si"
			aux = aux.siguiente
			if aux == self.primero:
				break			
		return "true"
	
	#ACTUALIZAR
	def actualizarReservacionDevuelta(self, idHabitacion):
		aux = self.primero
		while aux:
			if aux.IdHabitaciones == idHabitacion:
				aux.reservada = "no"
			aux = aux.siguiente
			if aux == self.primero:
				break			
		return "true"	
	
			
			
	#CREAR ARCHIVO
	def grabarArchivo(self):
		cont1 = 0
		temp = self.primero		
		
		archivo=open('C:\\Users\\l_enr\\Desktop\\ListaSimpleCircularHabitaciones.txt','w')				
		archivo.write('digraph G{\n')		
		archivo.write("node [shape = record];\n")
		archivo.write("rankdir = LR;\n")	
		
		while temp != None:
			archivo.write("L"+str(temp.IdHabitaciones) + "_nodo_" + str(cont1) + " [label="+"\"Id Habitacion: "+str(temp.IdHabitaciones)+"\"]\n")
			cont1=cont1+1
			temp = temp.siguiente
			if temp == self.primero:
				break			
		
		cont1 = 0
		cont2 = cont1+1
		temp = self.primero		
		while temp != None:
			if temp.siguiente != None:
				archivo.write("L"+str(temp.IdHabitaciones)+"_nodo_"+str(cont1)+"->"+"L"+str(temp.siguiente.IdHabitaciones)+"_nodo_"+str(cont2)+"\n")
				cont1=cont1+1
				cont2=cont2+1
			temp = temp.siguiente
			if temp == self.ultimo:
				break	
		
		contUltimo=cont1
		'''cont2 = cont1-1
		temp = self.ultimo			
		while temp != None:
			if temp.anterior != None:
				archivo.write(str(temp.IdHabitaciones)+"_nodo_"+str(cont1)+"->"+str(temp.anterior.IdHabitaciones)+"_nodo_"+str(cont2)+"\n")
				cont1=cont1-1
				cont2=cont2-1
			temp = temp.anterior
			if temp == self.primero:
				break'''		
		
		temp = self.primero
		temp2 = self.ultimo
		archivo.write("L"+str(temp.IdHabitaciones)+"_nodo_"+str(0)+"->"+"L"+str(temp2.IdHabitaciones)+"_nodo_"+str(contUltimo)+"\n")
		archivo.write("L"+str(temp2.IdHabitaciones)+"_nodo_"+str(contUltimo)+"->"+"L"+str(temp.IdHabitaciones)+"_nodo_"+str(0)+"\n")
		archivo.write('}')
		archivo.close()
		