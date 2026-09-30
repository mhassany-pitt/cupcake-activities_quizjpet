class A (object):
    def __eq__ (self, other):
        print ("Llamada a A __eq__")
        return self.valor == otros
class B(object):
    def __eq__(self, other):
        print ("Llamada a B __eq__")
        return self.valor == otros
A.valor = 3
B.valor = 3
print(A == B)