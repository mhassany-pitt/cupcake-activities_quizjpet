def modificar_la_cadena(la_cadena):
    la_cadena = la_cadena.replace("10", "0")
    return la_cadena

def main():
    cadena_externa = "He visto 10 peliculas."
    print(cadena_externa)
    modificar_la_cadena(cadena_externa)
    print(cadena_externa)
    cadena_externa = modificar_la_cadena(cadena_externa)
    print(cadena_externa)

main()