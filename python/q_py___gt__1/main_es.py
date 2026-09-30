class A(object):
    def __gt__(self, otro):
        print("Se ha llamado a '__gt__ de A'")
        return self.valor > otro.valor
class B(object):
    def __gt__(self, otro):
        print("Se ha llamado a '__gt__ de B'")
        return self.valor > otro.valor
a = A()
a.valor = 1
b = B()
b.valor = 4
print(a > b)
print(b > a)