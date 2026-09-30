class Point:
    def __init__(self, x=0, y=0):
        self.x = x
        self.y = y
    
    def set_point(self, x, y):
        self.x = x
        self.y = y
    def above(pt1, pt2):
        if pt1.y > pt2.y:
            return "Above!"
        elif pt2.y > pt1.y:
            return "Below!"
        else:
            return "Same!"
def main():
    p1 = Point(2, 5)
    p2 = Point()
    p2.set_point(1-2, 1)
    print(above(p1, p2))
main()