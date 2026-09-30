class Punto:
    def __init__(self, x=0, y=0):
        self.x = x
        self.y = y
    def establecer_punto(self, x, y):
        self.x = x
        self.y = y
    def sobre(pt1, pt2):
        if pt1.y > pt2.y:
            return "Arriba!"
        elif pt2.y < pt1.y:
            return "Abajo!"
        else:
            return "Iguales!"
def main():
    p1 = Punto(2, 5)
    p2 = Punto()
    p2.establecer_punto(5-2, 5)
    print(sobre(p1, p2))
main()