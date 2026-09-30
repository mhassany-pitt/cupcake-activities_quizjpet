def test(arr):
    new_list = []
    eCount = 0
    for item in arr:
        try:
            new_list.append(item+2)
        except Exception as e:
            eCount += 1
            if eCount == 5:
                print(type(e))
                break
    print(new_list)
arr = [5, 11, "4", "five", 8, 6, "12", 2, "14", 3, "nine", 0, "1"]
test(arr)