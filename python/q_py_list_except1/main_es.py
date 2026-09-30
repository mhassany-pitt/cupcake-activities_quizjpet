la_lista = (1, 2, 3, 4, 5)
suma = 0
error = 0
for i in range(13):
    try:
        suma += la_lista[i]
    except:
        error += 1
print(suma)
print(error)