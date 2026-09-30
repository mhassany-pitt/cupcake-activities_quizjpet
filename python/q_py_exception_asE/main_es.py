def prueba(arr):
    nueva_lista = []
    contador_errores = 0
    for elemento in arr:
        try:
            nueva_lista.append(elemento+2)
        except Exception as e:
            contador_errores += 1
            if contador_errores == 5:
                print(type(e))
                break
    print(nueva_lista)
arr = [5, 11,"4","cinco", 8, 6, "12", 2, "14", 3, "nueve", 0, "1"]
prueba(arr)