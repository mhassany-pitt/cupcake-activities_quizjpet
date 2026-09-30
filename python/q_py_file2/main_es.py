puntuaciones_archivo = open("studentscores.txt", "r")
for linea in puntuaciones_archivo:
    informacion_alumno = linea.split()
    nombre_alumno = informacion_alumno[0]
    puntaje_total = 0.0
    conteo_puntajes = 3
    for i in range(0, conteo_puntajes):
        puntaje_total += float(informacion_alumno[i + 1])
    promedio = puntaje_total/conteo_puntajes
    print(nombre_alumno, promedio)