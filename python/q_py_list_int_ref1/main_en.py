def main():
    numbers = [1, 3, 5, 7, 11, 13]
    print(numbers)
    original = numbers
    numbers[3] = 2
    print(original)
    original[3+1] = 4
    print(numbers)
        
main()