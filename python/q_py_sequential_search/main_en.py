def sequential_search(data, target) :
    found = False
    index = 0
    while (not found and index < len(data)):
        if (target == data[index]):
            found = True
        else:
            index = index + 1
    if  (not found):
        index = -1
    return index
data = [0, 3, 2, 5, 1]
target = 4
print(sequential_search(data, target))