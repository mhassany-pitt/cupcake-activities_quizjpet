list = [22, 235, 11, 111, 81]
max_index = 0
for index in range(1,len(list)):
  if (list[index] > list[max_index]):
    max_index = index
result = max_index
print(result)
