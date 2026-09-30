def funcionImprimir(entrada):
    if (entrada < 1):
        return
    else:
        print(entrada, end = " ")
        funcionImprimir(entrada - 1)  
        print(entrada, end = " ")
        return
entrada = 4
funcionImprimir(entrada)