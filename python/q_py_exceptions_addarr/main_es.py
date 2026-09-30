def contar_numeros(arr):
    total = 0
    longitud_letras = 0
    for numero in arr:
        try:
            temp = numero // 2
            total += temp
        except TypeError:
            longitud_letras += len(numero)
    return longitud_letras + total
arr = ["12", "ocho", 3, 11, "nueve", 8, "14","cinco", "seis", 3, 0, "1"]
print(contar_numeros(arr))