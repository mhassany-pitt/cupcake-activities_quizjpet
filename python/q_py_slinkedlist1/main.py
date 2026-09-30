class SLinkedListNode:
    def __init__(self, initData, initNext):
        self.data = initData
        self.next = initNext
    def getData(self):
        return self.data
    def getNext(self):
        return self.next
    def setData(self, newData):
        self.data = newData
    def setNext(self, newNext):
        self.next = newNext
class SLinkedList:
    def __init__(self):
        self.head = None
        self.size = 0
    def __str__(self):
        s = "["
        i = 0
        current = self.head
        while current != None:
            if i > 0:
                s = s + ","
            dataObject = current.getData()
            if dataObject != None:
                s = s + "%s" % dataObject
                i = i + 1
            current = current.getNext()
        s = s + "]"
        return s
    def add(self, item):
        temp = SLinkedListNode(item, None)
        temp.setNext(self.head)
        self.head = temp
        self.size += 1
    def index(self, item):
        current = self.head
        found = False
        index = 0
        while current != None and not found:
            if current.getData() == item:
                found = True
            else:
                current = current.getNext()
                index = index + 1
        if not found:
            index = -1
        return index
    def remove(self, item):
        current = self.head
        previous = None
        found = False
        while not found:
            if current.getData() == item:
                found = True
            else:
                previous = current
                current = current.getNext()
        if previous == None:
            self.head = current.getNext()
        else:
            previous.setNext(current.getNext())
        self.size -= 1
    def append(self, item):
        temp = SLinkedListNode(item, None)
        if (self.head == None):
            self.head = temp
        else:
            current = self.head
            while (current.getNext() != None):
                current = current.getNext()
            current.setNext(temp)
        self.size += 1
    def pop(self):
        current = self.head
        previous = None
        while (current.getNext() != None): # prevents calling on an empty list
            previous = current
            current = current.getNext()
        if (previous == None):
            self.head = None
        else:
            previous.setNext(None)
        self.size -= 1
        return current.getData()
location = SLinkedList()
location.add("Edmonton")
location.add("Napa Valley")
location.append("Vancouver")
print(location.pop())
location.add("Boston")
location.add("Big Sur")
location.add(42)
print(location.index("Napa Valley"))
location.remove(42)
print(location)