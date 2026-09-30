class Persona:
  def __init__(self, nombre, apellido, edad):
    self.primerNombre = nombre
    self.apellido = apellido
    self.edad = edad

  def printNombre(self):
    print(self.primerNombre, self.apellido)

  def printEdad(self):
    print(self.edad) 

class Estudiante(Persona):
  def printNombre(self):
      print(self.primerNombre)

estudiante = Estudiante("Adam", "Smith", 44)
estudiante.printNombre()
estudiante.printEdad()