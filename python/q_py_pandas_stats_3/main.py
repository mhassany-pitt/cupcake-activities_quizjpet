import pandas as pd
people = pd.read_csv("people.csv")

median_age = people["age"].median()
print(median_age)