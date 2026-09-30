class A (object):
    def __eq__(self, other):
        print ("A __eq__ called")
        return self.value == other
class B(object):
    def __eq__(self, other):
        print ("B __eq__ called")
        return self.value == other
A.value = 3
B.value = 3
print(A == B)