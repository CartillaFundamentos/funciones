# Ejercicio No. 59: Promedio de pares.

# processing
def promediar_pares(lista):
    suma = 0
    promedio = 0
    cont = 0
    for i in lista:
        if i&2 == 0:
            suma += i
            cont += 1
    promedio = suma / cont
    return promedio

lista1 = [1,2,3,4,5]
promedio = promediar_pares(lista1)

# output
print(promedio)