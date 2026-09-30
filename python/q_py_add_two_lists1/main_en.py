a = [1,2,3,4]
b = []
for i in range(len(a)):
    b.append(a[i] + 6)
c = a + b
print(c)