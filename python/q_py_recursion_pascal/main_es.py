def triangulo_pascal(n):
    if n == 1:
        return [1]
    else:
        contador = 0
        linea = [1]
        linea_anterior = triangulo_pascal(n-1)
        for i in range(len(linea_anterior)-1):
            contador+=1
            linea.append(linea_anterior[i] + linea_anterior[i+1])
        linea += [1]
        if contador == 5:
            print(linea)
    return linea
triangulo_pascal(8)