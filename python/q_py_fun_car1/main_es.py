def combustible(galones, gasolina, tamano_tanque):
    gasolina = min(galones + gasolina, tamano_tanque)
    return gasolina
gasolina = 50 - 29
galones = combustible(25, gasolina, 50)
print(galones)