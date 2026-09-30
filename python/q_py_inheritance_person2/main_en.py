class Person:
  def __init__(self, fname, lname, age):
    self.firstname = fname
    self.lastname = lname
    self.age = age
  def printname(self):
    print(self.firstname, self.lastname)
    
  def printage(self):
    print(self.age)    
class Student(Person):
  def printname(self):
      print(self.firstname)
student = Student("Adam", "Smith", 58)
student.printname()
student.printage()