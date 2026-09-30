def busqueda_secuencial(datos, objetivo) :
    encontrado = False
    indice = 0
    while (not encontrado and indice < len(datos)):
        if (objetivo == datos[indice]):
            encontrado = True
        else:
            indice = indice + 1
    if  (no encontrado):
        indice = -1
    return indice
datos = [0, 3, 2, 5, 1]
objetivo = 5
print(busqueda_secuencial(datos, objetivo))