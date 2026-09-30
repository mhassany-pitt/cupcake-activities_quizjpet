size=4
square = []
i = 0
while i < size:
    square.append([])
    i = i + 1
m = 0
n = 0
while m < size:
    for n in range(size):
        square[m].append("*")
    m = m + 1
for row in square:
    for column in row:
        print(column, end="")
    print(end="\n")