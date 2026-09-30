class A(object):
    def __eq__(self, otro):
        print("Se llamo a A __eq__")
        return self.valor == otro
class B(object):
    def __eq__(self, otro):
        print("Se llamo a B __eq__")
        return self.valor == otro
a = A()
a.valor = 5
b = B()
b.valor = 5
print(a==b)