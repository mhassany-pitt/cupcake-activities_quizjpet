data = [
    {"name": "Alice", "age": 25},
    {"name": "Bob", "age": 17},
    {"name": "Charlie", "age": 35},
    {"name": "David", "age": 16}
]

max_age = 0
for person in data:
    if person["age"] > max_age:
        max_age = person["age"]

print(max_age)