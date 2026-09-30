def modificar(lista):
    lista[0] = lista[0].replace("1", "0")
    return lista
def main():
    lista_externa = ["He visto 1 peliculas."]
    print(lista_externa[0])
    modificar(lista_externa)
    print(lista_externa[0])
    lista_externa = modificar(lista_externa)
    print(lista_externa[0])
main()