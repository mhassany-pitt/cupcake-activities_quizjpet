class A(object):
    def __gt__(self, other):
        print("A __eq__ called")
        return self.value > other.value
class B(object):
    def __gt__(self, other):
        print("B __eq__ called")
        return self.value > other.value
a = A()
a.value = 3
b = B()
b.value = 4
print(a > b)
print(b > a)