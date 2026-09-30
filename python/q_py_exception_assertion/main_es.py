def pruebas(lista):
    nueva_lista = []
    conteo_error = 0
    for elemento in lista:
        try:
            assert isinstance(elemento, int)
        except AssertionError:
            conteo_error += 1
            nueva_lista.append(elemento)
    print(conteo_error)
    print(nueva_lista)
lista = [5, 4, "seis", 11, 0,"12", 9, "once", "1", 8, "nueve", "1"]
pruebas(lista)