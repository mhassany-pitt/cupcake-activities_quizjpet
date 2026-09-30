tamano=3
cuadrado = []
i = 0
while i < tamano:
    cuadrado.append([])
    i = i + 1
m = 0
n = 0
while m < tamano:
    for n in range(tamano):
        cuadrado[m].append("*")
    m = m + 1
for fila in cuadrado:
    for columna in fila:
        print(columna, end="")
    print(end="\n")