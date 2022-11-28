""" Sin funciones
print("-----------------------------")
print("- BUSCAR NUMERO EN CONJUNTO -")
print("-----------------------------")

b = int(input("Número a buscar: "))

a = [1, 2, 3, 4, 5]
r = False

for i in a:
    if i == b:
        print("Lo encontre")
        r = True
if r == False:
    print("No lo encontre")
print("\nEso era")
"""
def buscar_dato_en_lista(dato_a_buscar, lista):
    r = False
    for i in lista:
        if i == dato_a_buscar:
            r = True
    return r

dato = int(input("Número a buscar: "))
lista = [1, 2, 3, 4, 5]

if buscar_dato_en_lista(dato, lista):
    print("Lo encontre")
else:
    print("No lo encontre")



