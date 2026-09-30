filas = 2
columnas = 3
numeros = [[0] * columnas for i in range(filas)]
for i in range(0, filas):
   for j in range(0, columnas):
       numeros[i][j] = 3 + j - i
for i in range(0, filas):
   for j in range(0, columnas):
       print(numeros[i][j])