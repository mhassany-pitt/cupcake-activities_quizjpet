data = [
    {"name": "Alice", "age": 25},
    {"name": "Bob", "age": 30},
    {"name": "Charlie", "age": 35}
]

total_age = 0
for person in data:
	total_age += person["age"]
average_age = total_age / len(data)

print(total_age)
print(average_age)