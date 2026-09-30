capital = 4 * 1000

if capital < 2500:
    porcentaje_interes = 4
else:
     porcentaje_interes = 4 * 2 

interes_anual = capital *  porcentaje_interes / 100
print(interes_anual)
print(capital + interes_anual)