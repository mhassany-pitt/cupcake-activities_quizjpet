def combustible(litros, gasolina, tamano_tanque):
    gasolina = min(litros + gasolina, tamano_tanque)
    return gasolina
def conduccion(gasolina, consumo):
    if gasolina < consumo:
        gasolina = 0
    else:
        gasolina = gasolina - consumo
    return gasolina
gasolina = 50 - 34
litros = combustible(25, gasolina, 50)
print(litros)
litros = conduccion(litros, 20)
print(litros)