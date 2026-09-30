json_data = [{
    "name": "Alice",
    "age": 25,
    "city": "New York",
    "skills": ["Python", "JavaScript", "SQL"]
},
{
    "name": "Nura",
    "age": 26,
    "city": "Pittsburgh",
    "skills": ["Python", "Java"]
}]

for item in json_data:
    print(item["name"], item["age"])