data = [
    {"name": "Alice", "age": 25},
    {"name": "Bob", "age": 17},
    {"name": "Charlie", "age": 35},
    {"name": "David", "age": 16}
]
total_age = 0
for person in data:
	total_age += person["age"]
average_age = total_age / len(data)
adult_count = 0
for person in data:
	if person["age"] >= 18:
		adult_count += 1
print(total_age)
print(average_age)
print(adult_count)