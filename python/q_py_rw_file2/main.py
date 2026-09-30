f = open("test.txt", "w")
mi_lista = ["A", "C", "D", "B", "E", "A"]
for e in mi_lista[:5]:
    f.write(e + "")
f.close()
f = open("test.txt", "a")
f.write(\"#Revisa mi eleccion!\\n\")
f.close()
mi_nueva_lista = open("test.txt", "r").readlines()
for e in mi_nueva_lista:
    e = e.strip()
    print(e)