def test(arr):
    new_list = []
    eCount = 0
    for item in arr:
        try:
            assert isinstance(item,int)
        except AssertionError:
            eCount += 1
            new_list.append(item)
    print(eCount)
    print(new_list)
arr = [5, 4, "six", 13, 0, "12", 9, "eleven", "1", 8, "nine", "1"]
test(arr)