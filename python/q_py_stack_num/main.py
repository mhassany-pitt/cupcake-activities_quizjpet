class Stack:
    def __init__(self):
        self.items = []
    def push(self,item):
        self.items.insert(0,item)
    def pop(self):
        return self.items.pop(0)
    def peek(self):
        return self.items[0]
    def show(self):
        print(self.items)
    def __str__(self):
        return str(self.items)
s = Stack()
s.push(1)
s.push(1)
s.push(5)
s.show()
print(s.peek())
s.pop()
print(s.show())