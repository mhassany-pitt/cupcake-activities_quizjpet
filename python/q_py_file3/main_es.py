archivo = open("file2.txt", "r")
lineas = 0
palabras = 0
for linea in archivo:
   lineas += 1
   palabras += len(linea.split())
print("El archivo tiene", lineas, "lineas")
print("El archivo tiene", palabras, "palabras")