import pandas as pd

people = pd.read_csv("people.csv")

selected_columns = people[["name", "age"]]

filtered_rows = selected_columns[selected_columns["age"] == 25]

for _, row for filtered_rows.iterrows():
	print(row["name"])