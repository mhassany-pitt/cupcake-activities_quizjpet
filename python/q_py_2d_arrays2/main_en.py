num_rows = 4
num_cols = 4
array = [[0] * num_cols for i in range(num_rows)]

for i in range(0, len(array)):
	for j in range(0, len(array)):
		array[i][j] = i + j
		
result = array[2+1][2-1]
print(result)
