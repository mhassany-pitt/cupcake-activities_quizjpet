import pandas as pd

people = pd.read_csv("people.csv")

mean_age_by_diet = people.groupby("dietary_restriction")["age"].mean().reset_index()
for ind, row in mean_age_by_diet.iterrows():
	print(row["dietary_restriction"],row["age"])