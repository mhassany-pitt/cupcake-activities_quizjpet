class Coche:
    def __init__(self, tanque, gasolina):
        self.tanque = tanque
        self.gasolina = gasolina
    def combustible(self, galones):
        agregado = min(galones, self.tanque - self.gasolina)
        self.gasolina = self.gasolina + agregado
        return agregado
    def conducir(self, consumo):
        if self.gasolina < consumo:
            self.gasolina = 0
            return False
        self.gasolina = self.gasolina - consumo
        return True
    def obtener_combustible(self):
        return self.gasolina
    def tiene_mas_combustible(self, otro):
        return self.gasolina > otro.gasolina
coche = Coche(30, 5)
galones = coche.combustible(25)
print(galones)
coche.conducir(15)
print(coche.obtener_combustible())
otro_coche = Coche(30, 5)
otro_coche.combustible(10)
print(coche.tiene_mas_combustible(otro_coche))