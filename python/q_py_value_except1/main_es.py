def int_a_cadena(var):
    try:
        print(int(var))
    except ValueError:
        print("Por favor ingrese un numero!")
mi_lista = ["uno","1", "dos", "2", "tres", "3"]
int_a_cadena(mi_lista[2])