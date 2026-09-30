class Persona:
  def __init__(self, nombre, apellido, edad):
    self.nombre = nombre
    self.apellido = apellido
    self.edad = edad

  def printNombre(self):
    print(self.nombre, self.apellido)

  def printEdad(self):
    print(self.edad)

class Estudiante(Persona):
  pass

x = Estudiante("Mike", "Olsen", 18)
x.printNombre()
x.printEdad()