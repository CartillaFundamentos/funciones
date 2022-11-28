# Ejercicio No. 60: Promedio de datos.

# processing
def promediar(lista):
    suma = 0
    cont = 0
    for i in lista:
        suma += i
        cont += 1
    promedio = suma / cont
    return promedio

lista1 = [1,2,3,4,5]
promedio = promediar(lista1)

# output
print(promedio)