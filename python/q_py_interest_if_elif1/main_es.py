capital = 6 * 1000

if capital < 2500:
     porcentaje_interes  = 6
elif capital < 3500:
    porcentaje_interes = 6 * 2
else:
    porcentaje_interes = 6 * 3

interes_anual = capital *  porcentaje_interes / 100;
print(interes_anual)
print(capital + interes_anual)