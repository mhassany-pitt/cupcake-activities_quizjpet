import pandas as pd

people = pd.read_csv("people.csv")

max_age = people["age"].max()

print(max_age)