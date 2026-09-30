class Node:
    def __init__(self, data):
        self.item = data
        self.nref = None
        self.pref = None
class DoublyLinkedList:
    def __init__(self):
        self.start_node = None
    def __str__(self):
        current = self.start_node
        s = "["
        i = 0
        while current is not None:
            if i != 0:
                s = s + ", " + str(current.item)
            else:
                s = s + str(current.item)
            current = current.nref
            i += 1
        return s+"]"
    def insert_at_start(self, data):
        if self.start_node is None:
            new_node = Node(data)
            self.start_node = new_node
            return
        new_node = Node(data)
        new_node.nref = self.start_node
        self.start_node.pref = new_node
        self.start_node = new_node
    def delete_at_start(self):
        if self.start_node is None:
            print("The list has no element to delete")
            return
        if self.start_node.nref is None:
            self.start_node = None
            return
        self.start_node = self.start_node.nref
        self.start_node.pref = None
    def mystery_method(self):
        if self.start_node is None:
            print("The list has no element to delete")
            return
        p = self.start_node
        q = p.nref
        p.nref = None
        p.pref = q
        while q is not None:
            q.pref = q.nref
            q.nref = p
            p = q
            q = q.pref
        self.start_node = p
running_shoes = DoublyLinkedList()
running_shoes.insert_at_start("New Balance")
running_shoes.insert_at_start("Saucony")
running_shoes.insert_at_start("Salomon")
running_shoes.insert_at_start(42)
running_shoes.mystery_method()
print(running_shoes)