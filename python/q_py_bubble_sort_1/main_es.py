def ordenamiento_burbuja(lista):
  for i in range(len(lista) - 1, 0 , -1):
    for actual in range(0, i):
      if (lista[actual + 1] < lista[actual]):
        temporal = lista[actual]
        lista[actual] = lista[actual + 1]
        lista[actual + 1] = temporal
  return lista
datos = [2, 5, -17, 6, -1, -15]
print(ordenamiento_burbuja(datos))