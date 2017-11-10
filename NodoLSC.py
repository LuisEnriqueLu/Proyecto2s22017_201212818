class NodoLSC:
	def __init__(self, IdHabitaciones=None, nivel=None, numero=None, reservada=None):
		self.IdHabitaciones = IdHabitaciones
		self.nivel = nivel
		self.numero = numero
		self.siguiente = None
		self.anterior = None
		self.reservada = reservada