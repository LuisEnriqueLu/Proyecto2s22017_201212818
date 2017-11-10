from NodoLB import NodoLB

class ListaB:
	def __init__(self):
		self.raiz = None
		self.indiceLista = 0
		self.contadorRegistro = 0
		self.archivoBitacora =""
	
	def insertar(self, nodoB):
		self.contadorRegistro +=1
		if self.raiz == None:			
			nodo = NodoLB(self.contadorRegistro, nodoB, self.indiceLista)
			self.raiz = nodo
			self.indiceLista = self.indiceLista + 1
		else :
			aux = self.raiz
			while aux.siguiente != None:
				aux = aux.siguiente				
			
			nodo = NodoLB(self.contadorRegistro, nodoB, self.indiceLista)
			self.indiceLista = self.indiceLista + 1
			aux.siguiente = nodo
		print("Inserto En Lista")
				
	
	def eliminar(self, dato):
		if self.raiz != None:
			if self.raiz.nodoArbolB.idNombre == dato:
				if self.raiz.siguiente != None: 
					self.raiz = self.raiz.siguiente
				else:
					self.raiz == None
			temp = self.raiz
			while temp.siguiente != None:
				temp2 = temp.siguiente
				if temp2.nodoArbolB.idNombre == dato:
					temp.siguiente = temp2.siguiente
					break;
				temp = temp.siguiente			
		
	
	def consultarLista(self):
		aux = self.raiz
		dato = ""
		if aux == None:			
			return "Lista Vacia"			
		else :
			while aux != None:
				if aux.index != None:
					dato += str(aux.idB) + " -> "+ str(aux.nodoArbolB.idNombre) +"; \n"										
				aux = aux.siguiente
			return str(dato) 
	
	def retornarLista(self):
		return self.raiz	
	
	def Limpiar(self):
		self.raiz=None
	
	
	