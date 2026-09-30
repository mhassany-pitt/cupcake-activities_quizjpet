class Car:
    def __init__(self, tank_size, gas):
        self.tank_size = tank_size
        self.gas = gas
    def fuel(self, gallons):
        added = min(gallons, self.tank_size - self.gas)
        self.gas = self.gas + added
        return added
    def drive(self, consumption):
        if self.gas < consumption:
            self.gas = 0
            return False
        self.gas = self.gas - consumption
        return True
    def get_fuel(self):
        return self.gas
car = Car(45, 0)
gallons = car.fuel(25)
print(gallons)
car.drive(15)
print(car.get_fuel())