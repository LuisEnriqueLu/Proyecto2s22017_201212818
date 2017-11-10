class NodoLD:
	def __init__(self, IdUsuario=None, NombreUsuario=None, Contrasena=None, Edad=None, Telefono=None, Direccion=None):
		self.IdUsuario = IdUsuario
		self.NombreUsuario = NombreUsuario
		self.Contrasena = Contrasena
		self.Edad = Edad
		self.Telefono = Telefono
		self.Direccion = Direccion
		self.siguiente = None
		self.anterior = None