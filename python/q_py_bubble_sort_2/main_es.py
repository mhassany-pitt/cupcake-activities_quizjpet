def ordenar_burbuja(lista):
  for i in range(len(lista) - 1, 0 , -1):
    for actual in range(0, i):
      if (lista[actual+1] > lista[actual]):
        temporal = lista[actual]
        lista[actual] = lista[actual+1]
        lista[actual+1] = temporal
  return lista
datos = [4, -1, -13, 6, 1, 2]
print(ordenar_burbuja(datos))