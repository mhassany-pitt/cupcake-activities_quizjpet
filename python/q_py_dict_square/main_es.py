def cuadrado(num_diccionario):
    num_diccionario["n"] *= num_diccionario["n"]
    
dicc = {"n": 8}
cuadrado(dicc)
print(dicc)