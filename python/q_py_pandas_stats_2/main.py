import pandas as pd
people = pd.read_csv("people.csv")
min_age = people["age"].min()
print(min_age)