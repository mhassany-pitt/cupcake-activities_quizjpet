lado1 = 52
lado2 = 55
lado3 = 53
if (lado1 + lado2) > lado3 and (lado1 + lado3) > lado2 and (lado2 + lado3) > lado1:
    if lado1 == lado2 == lado3:
        print("triangulo equilatero")
    elif (lado1 == lado2 and lado3 != lado1) or (lado1 == lado3 and lado2 != lado1) or (lado2 == lado3 and lado2 != lado1):
        print("triangulo isosceles")
    elif (lado1 != lado2) and (lado1 != lado3) and  (lado2 != lado3):
        print("triangulo escaleno")
else:
    print("no es un triangulo")