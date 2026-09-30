def num(arr):
    total = 0
    letter_len = 0
    for number in arr:
        try:
            temp = number // 2
            total += temp
        except TypeError:
            letter_len += len(number)
    return letter_len + total
arr = ["12", "eight", 8, 11, "nine", 8, "14", "five", "six", 3, 0, "1"]
print(num(arr))