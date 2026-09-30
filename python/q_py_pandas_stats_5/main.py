import pandas as pd
people = pd.read_csv("people.csv")
shortlisted_counts = people["age"].value_counts().reset_index()
count = 0
for ind, row in shortlisted_counts.iterrows():
	if count < 2:
		print(row["index"],",",row["age"])
	count += 1