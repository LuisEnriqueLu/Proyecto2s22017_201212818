from ListaDoble import ListaDoble
from ListaSimpeCircular import ListaSimpleCircular
from ArbolB import ArbolB
from ListaB import ListaB
from TablaHash import TablaHash
from Matriz import Matriz
from NodoMatriz import NodoMatriz
from NodoB import NodoB

claseListaDoble = ListaDoble()
claseListaSimple = ListaSimpleCircular()
claseArbolB = ArbolB()
claseListaB = ListaB()
claseHash = TablaHash()
claseMatriz = Matriz()


if __name__ == "__main__":    
    
    nwhile = 0
    while nwhile!=None:
        print("\n---- MENU ----")
        num = input("Opcion: ")
        if num == "1":
            print(claseListaDoble.Insertar("Luis", "123", "24", "55", "8C"))
            print(claseListaDoble.Insertar("Enrique", "123", "24", "55", "8C"))
            print(claseListaDoble.Insertar("Lopez", "123", "24", "55", "8C"))
            print(claseListaDoble.Insertar("Luis", "456", "24", "55", "8C"))
            print(claseListaDoble.Insertar("Lopez", "456", "24", "55", "8C"))
            print(claseListaDoble.Insertar("Enrique", "456", "24", "55", "8C"))
        elif num == "2":
            print(claseListaDoble.BuscarDatoLogin("Luis", "123"))
            print(claseListaDoble.BuscarDatoLogin("Luis", "1234"))
            print(claseListaDoble.BuscarDatoLogin("Enrique", "123"))
            print(claseListaDoble.BuscarDatoLogin("Lopez", "1234"))
            print(claseListaDoble.BuscarDatoLogin("Enrique", "123"))
        elif num == "3":
            claseListaDoble.grabarArchivo()
        elif num == "4":
            print(claseListaSimple.InsertarFinal("252", "2", "52"))
            print(claseListaSimple.InsertarFinal("356", "3", "56"))
            print(claseListaSimple.InsertarFinal("478", "4", "78"))
            print(claseListaSimple.ImprimirDatos())
            claseListaSimple.grabarArchivo()
        elif num == "5":            
            claseArbolB.crearNodoInsertar(97, "A", "2", "1", "3", 456)
            claseArbolB.crearNodoInsertar(98, "b", "2", "1", "3", 132)
            claseArbolB.crearNodoInsertar(99, "c", "2", "1", "3", 562)
            claseArbolB.crearNodoInsertar(102, "A", "2", "1", "3", 789)
            claseArbolB.crearNodoInsertar(122, "z", "2", "1", "3", 46)
            claseArbolB.crearNodoInsertar(150, "A", "2", "1", "3", 10)
            claseArbolB.crearNodoInsertar(65, "z", "2", "1", "3", 4568)
            claseArbolB.crearNodoInsertar(82, "z", "2", "1", "3", 1230)
            claseArbolB.crearArchivo()
            claseArbolB.Eliminar(97)
            print(claseArbolB.retornarHabitaciones("A"))
            print(claseArbolB.retornarHabitaciones("z"))
        elif num == "6":
            claseArbolB.Eliminar(97)
            
        elif num == "7":
            claseArbolB.Eliminar(122)
            
        elif num == "8":
            claseArbolB.Eliminar(65)
            claseArbolB.Eliminar(99)
            claseArbolB.crearNodoInsertar(100, "z", "2", "1", "3")
            claseArbolB.crearArchivo()
        elif num == "9":
            claseHash.CrearNodoInsertar(1, "Luis")
            claseHash.CrearNodoInsertar(9, "Enrique")
            claseHash.CrearNodoInsertar(10, "Lopez")
            claseHash.CrearNodoInsertar(25, "TATO")
            claseHash.CrearNodoInsertar(15635461, "ROMA")
            claseHash.CrearNodoInsertar(15, "Julio")
            claseHash.CrearNodoInsertar(105, "Julio")
            claseHash.CrearNodoInsertar(42, "Julio")
            claseHash.CrearNodoInsertar(105, "Julio")
            claseHash.CrearNodoInsertar(56, "Julio")
            claseHash.CrearNodoInsertar(5451321321310, "Julio")
            claseHash.CrearNodoInsertar(78, "Julio")
            claseHash.CrearNodoInsertar(26, "Julio")
            claseHash.CrearNodoInsertar(76546513218, "Julio")
            claseHash.CrearNodoInsertar(23, "Julio")
            claseHash.CrearNodoInsertar(1, "Julio")
            claseHash.CrearNodoInsertar(2, "Julio")
            claseHash.CrearNodoInsertar(3, "Julio")
            claseHash.CrearNodoInsertar(4, "Julio")
            claseHash.CrearNodoInsertar(5, "Julio")
            claseHash.CrearNodoInsertar(30, "Julio")
            claseHash.CrearNodoInsertar(31, "Julio")
            claseHash.CrearNodoInsertar(32, "Julio")
            claseHash.CrearNodoInsertar(40, "Julio")
            claseHash.CrearNodoInsertar(6, "Julio")
            claseHash.CrearNodoInsertar(7, "Julio")
            claseHash.CrearNodoInsertar(89, "Julio")
            claseHash.CrearNodoInsertar(77, "Julio")
            claseHash.CrearNodoInsertar(56, "Julio")
            claseHash.CrearNodoInsertar(789, "Julio")
            claseHash.CrearNodoInsertar(78, "Julio")
            claseHash.CrearNodoInsertar(26, "Julio")
            claseHash.CrearNodoInsertar(76546513218, "Julio")
            claseHash.CrearNodoInsertar(23, "Julio")
            claseHash.CrearNodoInsertar(1, "Julio")
            claseHash.CrearNodoInsertar(2, "Julio")
            claseHash.CrearNodoInsertar(3, "Julio")
            claseHash.CrearNodoInsertar(4, "Julio")
            claseHash.CrearNodoInsertar(5, "Julio")
            claseHash.CrearNodoInsertar(30, "Julio")
            claseHash.CrearNodoInsertar(31, "Julio")
            claseHash.CrearNodoInsertar(32, "Julio")
            claseHash.CrearNodoInsertar(40, "Julio")
            claseHash.CrearNodoInsertar(6, "Julio")
            claseHash.CrearNodoInsertar(7, "Julio")
            claseHash.CrearNodoInsertar(89, "Julio")
            claseHash.CrearNodoInsertar(77, "Julio")
            claseHash.CrearNodoInsertar(56, "Julio")
            claseHash.CrearNodoInsertar(789, "Julio")
            claseHash.CrearNodoInsertar(77, "Julio")
            claseHash.CrearNodoInsertar(56, "Julio")
            claseHash.CrearNodoInsertar(789, "Julio")
            claseHash.CrearNodoInsertar(78, "Julio")
            claseHash.CrearNodoInsertar(26, "Julio")
            claseHash.CrearNodoInsertar(76546513218, "Julio")
            claseHash.CrearNodoInsertar(23, "Julio")
            claseHash.CrearNodoInsertar(1, "Julio")
            claseHash.CrearNodoInsertar(2, "Julio")
            claseHash.CrearNodoInsertar(3, "Julio")
            claseHash.CrearNodoInsertar(4, "Julio")
            claseHash.CrearNodoInsertar(5, "Julio")
            claseHash.CrearNodoInsertar(30, "Julio")
            claseHash.CrearNodoInsertar(31, "Julio")
            claseHash.CrearNodoInsertar(32, "Julio")
            claseHash.CrearNodoInsertar(40, "Julio")
            claseHash.CrearNodoInsertar(6, "Julio")
            claseHash.CrearNodoInsertar(7, "Julio")
            claseHash.CrearNodoInsertar(89, "Julio")
            claseHash.CrearNodoInsertar(77, "Julio")
            claseHash.CrearNodoInsertar(56, "Julio")
            claseHash.CrearNodoInsertar(789, "Julio")
            claseHash.CrearNodoInsertar(77, "Julio")
            claseHash.CrearNodoInsertar(56, "Julio")
            claseHash.CrearNodoInsertar(789, "Julio")
            claseHash.CrearNodoInsertar(78, "Julio")
            claseHash.CrearNodoInsertar(26, "Julio")
            claseHash.CrearNodoInsertar(76546513218, "Julio")
            claseHash.CrearNodoInsertar(23, "Julio")
            claseHash.CrearNodoInsertar(1, "Julio")
            claseHash.CrearNodoInsertar(2, "Julio")
            claseHash.CrearNodoInsertar(3, "Julio")
            claseHash.CrearNodoInsertar(4, "Julio")
            claseHash.CrearNodoInsertar(5, "Julio")
            claseHash.CrearNodoInsertar(30, "Julio")
            claseHash.CrearNodoInsertar(31, "Julio")
            claseHash.CrearNodoInsertar(32, "Julio")
            claseHash.CrearNodoInsertar(40, "Julio")
            claseHash.CrearNodoInsertar(6, "Julio")
            claseHash.CrearNodoInsertar(7, "Julio")
            claseHash.CrearNodoInsertar(89, "Julio")
            claseHash.CrearNodoInsertar(77, "Julio")
            claseHash.CrearNodoInsertar(56, "Julio")
            claseHash.CrearNodoInsertar(789, "Julio")
            claseHash.CrearNodoInsertar(56, "Julio")
            claseHash.CrearNodoInsertar(789, "Julio")
            claseHash.CrearNodoInsertar(78, "Julio")
            claseHash.CrearNodoInsertar(26, "Julio")
            claseHash.CrearNodoInsertar(713218, "Julio")
            claseHash.CrearNodoInsertar(253, "Julio")
            claseHash.CrearNodoInsertar(165, "Julio")
            claseHash.CrearNodoInsertar(2789, "Julio")
            
            claseHash.CrearNodoInsertar(45456, "Julio")
            claseHash.CrearNodoInsertar(78564569, "Julio")
            claseHash.CrearNodoInsertar(5556, "Julio")
            claseHash.CrearNodoInsertar(789566, "Julio")
            claseHash.CrearNodoInsertar(7834, "Julio")
            claseHash.CrearNodoInsertar(261, "Julio")
            claseHash.CrearNodoInsertar(7133218, "Julio")
            claseHash.CrearNodoInsertar(25378, "Julio")
            claseHash.CrearNodoInsertar(16590, "Julio")
            claseHash.CrearNodoInsertar(278900, "Julio") 
            
            claseHash.CrearNodoInsertar(454456, "Julio")
            claseHash.CrearNodoInsertar(785624569, "Julio")
            claseHash.CrearNodoInsertar(555611, "Julio")
            claseHash.CrearNodoInsertar(76, "Julio")
            claseHash.CrearNodoInsertar(720, "Julio")
            claseHash.CrearNodoInsertar(28, "Julio")
            claseHash.CrearNodoInsertar(33218, "Julio")
            claseHash.CrearNodoInsertar(278, "Julio")
            claseHash.CrearNodoInsertar(190, "Julio")
            claseHash.CrearNodoInsertar(2900, "Julio")            
            claseHash.mostrar()
            claseHash.graficar()
            print(claseHash.retornarMaxsize())
            claseHash.Eliminar(42)
            #claseHash.mostrar()
        elif num == "10":
            anio = "2017"
            numeroMes = "02"
            dia = "14"
            mes = claseMatriz.verMes(numeroMes)
            
            claseMatriz.aumetarContador()
            codigo = str(claseMatriz.obtenerContador())
            
            nuevoNodo = NodoMatriz(mes, numeroMes, anio, dia, codigo)
            
            if claseMatriz.existeReservacion(nuevoNodo) == False:
                claseMatriz.agregarCabecerasMatriz(nuevoNodo)
                if claseMatriz.necesitaProfundidad(nuevoNodo) == True:
                    claseMatriz.agregarProfundidad(nuevoNodo)
                else:
                    claseMatriz.agregarMatriz(nuevoNodo)            
            
        
        elif num == "11":
            anio = "2019"
            numeroMes = "05"
            dia = "3"
            mes = claseMatriz.verMes(numeroMes)
            
            claseMatriz.aumetarContador()
            codigo = str(claseMatriz.obtenerContador())            
            
            nuevoNodo = NodoMatriz(mes, numeroMes, anio, dia, codigo)
            
            if claseMatriz.existeReservacion(nuevoNodo) == False:
                claseMatriz.agregarCabecerasMatriz(nuevoNodo)
                if claseMatriz.necesitaProfundidad(nuevoNodo) == True:
                    claseMatriz.agregarProfundidad(nuevoNodo)
                else:
                    claseMatriz.agregarMatriz(nuevoNodo)
            
            claseMatriz.ArchivoMatriz()
        
        elif num == "12":
            anio = "2017"
            numeroMes = "01"
            dia = "24"
            mes = claseMatriz.verMes(numeroMes)
            
            claseMatriz.aumetarContador()
            codigo = str(claseMatriz.obtenerContador())
            
            nuevoNodo = NodoMatriz(mes, numeroMes, anio, dia, codigo)
            
            if claseMatriz.existeReservacion(nuevoNodo) == False:
                claseMatriz.agregarCabecerasMatriz(nuevoNodo)
                if claseMatriz.necesitaProfundidad(nuevoNodo) == True:
                    claseMatriz.agregarProfundidad(nuevoNodo)
                else:
                    claseMatriz.agregarMatriz(nuevoNodo) 
            
            claseMatriz.ArchivoMatriz()
            
        
            
            
            
            
            
            
            
            
        