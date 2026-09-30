def saludar(nombre, valor):
    
    return nombre, valor + 2

numero = 18
saludar("Alice", numero)
print(numero)
nombre,numero = saludar("Bob", numero)
print(nombre)
print(numero)