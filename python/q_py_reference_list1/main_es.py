def principal(lista1):
    lista_principal = lista1
    lista_principal.append(3)
    return lista_principal
lista1 = [1,2,3]
lista_final = principal(lista1)
print(lista_final)
print(lista1)