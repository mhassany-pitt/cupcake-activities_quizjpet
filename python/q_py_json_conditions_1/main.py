data = [{
    "name": "Alice",
    "age": 25,
    "city": "Wonderland"
},
{
    "name": "Bob",
    "age": 17,
    "city": "Disneyf"
},
{
    "name": "Chris",
    "age": 20,
    "city": "Pittsburgh"
}]
for person in data:
    if person["age"] >= 18:
        print(person["name"],"is an adult.")
    else:
        print(person["name"],"is a minor.")