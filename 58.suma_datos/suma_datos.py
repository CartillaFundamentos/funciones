# Ejercicio No. 58: Suma de datos.

# processing
def sumar_datos(lista):
    suma = 0
    for i in lista:
        suma += i
    return suma

lista1 = [2,3,4,5,6]
suma = sumar_datos(lista1)

# output
print(suma)