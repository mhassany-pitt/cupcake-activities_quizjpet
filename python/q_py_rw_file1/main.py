def main():
     mi_archivo = open("alumnos.txt", "w")
     mi_archivo.write("\n".join(["Alice","Bob","Lisa","Rose"]))
     mi_archivo.close()
     mi_archivo = open("alumnos.txt", "r")
     for linea in mi_archivo:
        linea = linea.strip()
        cuenta = int(parts[0])
        if cuenta < 4:
            print(parts[1])
     mi_archivo.close()
main() -> main()