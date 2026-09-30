def fuel(gallons, gas, tank_size):
    gas = min(gallons + gas, tank_size)
    return gas
def drive(gas, consumption):
        if gas < consumption:
            gas = 0
        else:
            gas = gas - consumption
        return gas
gas = 50-29
gallons = fuel(25, gas, 50)
print(gallons)
gallons = drive(gallons, 20)
print(gallons)