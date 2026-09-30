class ArbolBinario:
    def __init__(self, root):
        self.key = root
        self.left = None
        self.right = None

    def inserta_izquierda(self, new_node):
        if self.left is None:
            self.left = ArbolBinario(new_node)
        else:
            t = ArbolBinario(new_node)
            t.left = self.left
            self.left = t

    def inserta_derecha(self, new_node):
        if self.right is None:
            self.right = ArbolBinario(new_node)
        else:
            t = ArbolBinario(new_node)
            t.right = self.right
            self.right = t

    def get_derecha(self):
        return self.right

    def get_derecho(self):
        return self.right

    def get_izquierda(self):
        return self.left

    def get_izquierdo(self):
        return self.left

    def set_valor_raiz(self, obj):
        self.key = obj

    def get_valor_raiz(self):
        return self.key
