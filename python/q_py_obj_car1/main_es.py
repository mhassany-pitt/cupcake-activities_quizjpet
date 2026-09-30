class Auto:
    def __init__(self, tamano_tanque, gasolina):
        self.tamano_tanque = tamano_tanque
        self.gasolina = gasolina
    def combustible(self, galones):
        agregado = min(galones, self.tamano_tanque - self.gasolina)
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
auto = Auto(43, 0)
galones = auto.combustible(25)
print(galones)
auto.conducir(15)
print(auto.obtener_combustible())