# Ejercicio No. 63: Verificar número primo

# processing
def es_primo(n):
    for i in range(2, n):
        if n % i == 0:
            return False
    return True

# input
n = int(input("Cantidad de números: "))

# processing
i = 2
s = "Primos: "
np = 0
while np < n:
    if es_primo(i):
        s = s + str(i) + ","
        np = np + 1
    i = i + 1

# output
print(s)