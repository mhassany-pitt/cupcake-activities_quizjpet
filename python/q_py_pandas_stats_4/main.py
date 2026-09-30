import pandas as pd
people = pd.read_csv("people.csv")
count = 0
for _, row in people.iterrows():
   if count < 2:
        print(row["name"],",",row["dietary_restriction"])  
   count += 1