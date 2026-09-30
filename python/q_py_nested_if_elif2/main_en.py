side1 = 52
side2 = 55
side3 = 55
if (side1 + side2) > side3 \
	and (side1 + side3) > side2 \
	and (side2 + side3) > side1:
    if side1 == side2 == side3:
        print("equilateral triangle")
    elif (side1 == side2 and side3 != side1) \
	or (side1 == side3 and side2 != side1) \
	or (side2 == side3 and side2 != side1):
        print("isosceles triangle")
    elif (side1 != side2) \
		and (side1 != side3) \
		and  (side2 != side3):
        print("scalene triangle")
else:
    print("it is not a triangle")