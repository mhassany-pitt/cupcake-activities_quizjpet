cuenta1 = 5
cuenta2 = 5 + 50
precio = 250
puede_permitirse = cuenta1 >= precio or cuenta2 >= precio
cuenta2 = cuenta2 - precio
dinero_restante = cuenta1+cuenta2 > 0
result = dinero_restante
print(result)
