rows = 2
columns = 3
numbers = [[0] * columns for i in range(rows)]

for i in range(0,rows):
   for j in range(0,columns):
       numbers[i][j] = 1 + j - i

for i in range(0,rows):
   for j in range(0,columns):
       print(numbers[i][j])