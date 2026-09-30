from arbol_binario import ArbolBinario
def preorden(arbol):
  if arbol != None:
    print(arbol.get_valor_raiz())
    preorden(arbol.get_izquierdo())
    preorden(arbol.get_derecho())
arbol = ArbolBinario(2)
arbol.inserta_izquierda(1)
arbol.inserta_derecha(3)
arbol.inserta_derecha(4)
preorden(arbol)