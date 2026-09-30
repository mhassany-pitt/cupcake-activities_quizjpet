data = [[0, 2, 5, -1],
        [1 ,2, 4, 3],
        [0, 7, -1, 0],
        [0, -1, 2, 9]]
result = 0
for i in range(0,len(data)):
    for j in range(0,len(data)):
        if data[i][j] > -1:
            result += 1
print(result)
