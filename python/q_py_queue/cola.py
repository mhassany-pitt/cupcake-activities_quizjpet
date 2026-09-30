class Cola:
    def __init__(self):
        self.items = []

    def vacia(self):
        return len(self.items) == 0

    def enqueue(self, item):
        self.items.insert(0, item)

    def encolar(self, item):
        self.items.insert(0, item)

    def desencolar(self):
        return self.items.pop()

    def tamanio(self):
        return len(self.items)
