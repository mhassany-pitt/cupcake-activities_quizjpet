def main():
    numeros = [1, 3, 5, 7, 11, 13]
    print(numeros)
    original = numeros
    numeros[3] = 2
    print(original)
    original[3+1] = 4
    print(numeros)
main()