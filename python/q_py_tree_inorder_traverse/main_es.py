from arbol_binario import ArbolBinario
def recorrido_inorden(arbol):
  if arbol != None:
    recorrido_inorden(arbol.get_izquierda())
    print(arbol.get_valor_raiz())
    recorrido_inorden(arbol.get_derecha())
arbol = ArbolBinario(10)
arbol.inserta_izquierda(5)
arbol.inserta_derecha(15)
arbol.inserta_derecha(20)
recorrido_inorden(arbol)