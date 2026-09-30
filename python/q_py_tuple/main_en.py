def greet(name, value):
    # Return multiple values
    return name, value + 2
number = 28
greet("Alice", number)
print(number)
name,number = greet("Bob", number)
print(name)
print(number)