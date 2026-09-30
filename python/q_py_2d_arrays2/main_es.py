num_filas = 4
num_columnas = 4
matriz = [[0] * num_columnas for i in range(num_filas)]
for i in range(0, len(matriz)):
    for j in range(0, len(matriz)):
        matriz[i][j] = i + j
result = matriz[1+1][1-1]
print(result)
