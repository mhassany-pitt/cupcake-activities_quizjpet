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
 
    def has_more_fuel(self, another):
        return self.gas > another.gas

car = Car(27, 5)
gallons = car.fuel(25)
print(gallons)
car.drive(15)
print(car.get_fuel())
another_car = Car(27, 5)
another_car.fuel(10)
print(car.has_more_fuel(another_car))