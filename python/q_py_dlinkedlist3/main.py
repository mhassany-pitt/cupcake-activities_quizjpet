class Node:
    def __init__(self, data):
        self.item = data
        self.nref = None
        self.pref = None

class DoublyLinkedList:
    def __init__(self):
        self.start_node = None
        self.count1 = 0
        self.count2 = 0
        self.count3 = 0
        self.count4 = 0
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
        return s + "]"
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
    
    def getCount(self):
        return [self.count1,self.count2,self.count3,self.count4]
    
    def delete_element_by_value(self, x):
        if self.start_node is None:
            print("The list has no element to delete")
            self.count1 += 1
            return
        if self.start_node.nref is None:
            if self.start_node.item == x:
                self.start_node = None
            else:
                self.count2 += 1
                print("Item not found")
            return
        if self.start_node.item == x:
            self.start_node = self.start_node.nref
            self.start_node.pref = None
            return
        n = self.start_node
        while n.nref is not None:
            self.count3 += 1
            if n.item == x:
                break
            n = n.nref
        if n.nref is not None:
            n.pref.nref = n.nref
            n.nref.pref = n.pref
        else:
            if n.item == x:
                n.pref.nref = None
            else:
                self.count4 += 1
                print("Element not found")
list = DoublyLinkedList()
list.insert_at_start(0)
list.insert_at_start(2)
list.insert_at_start(3)
list.insert_at_start(4)
list.delete_element_by_value(3)
print(list)
print(list.getCount())