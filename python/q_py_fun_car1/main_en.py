def fuel(gallons, gas, tank_size):
    gas = min(gallons + gas, tank_size)
    return gas
gas = 50-28
gallons = fuel(25, gas, 50)
print(gallons)