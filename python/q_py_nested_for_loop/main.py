size = 4
for i in range(size):
    for j in range(i, 0, -1):
        print(" ", end="")
    for j in range(size - i, 0, -1):
        print("* ", end="")
    print()