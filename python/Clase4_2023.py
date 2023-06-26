#  Operadores Aritmeticos
""""
operandoA = 8
operandoB = 5
suma = operandoA + operandoB
# print("Resultado de la suma: ", suma)
print(f'El resultado de la suma es: {suma} ')

resta = operandoA - operandoB
print(f'El resultado de la resta es: {resta}')

multiplicacion = operandoA * operandoB
print(f'El resultado de la multiplicacion es: {multiplicacion}')

division = operandoA / operandoB
print(f'El resultado de la division es: {division}')

division = operandoA // operandoB
print(f'El resultado de la division (int) es: {division}')

modulo = operandoA % operandoB
print(f'El resultado de la division o residuo (modulo) es: {modulo}')

exponente = operandoA ** operandoB
print(f'El resultado del exponente es: {exponente}')


# Ejercicio: Rectangulo
alto = int(input("Proporciona el alto del rectangulo: "))
ancho = int(input("Proporciona el ancho del rectangulo: "))
area = alto * ancho
perimetro = (ancho + alto) * 2
print(f"Area: {area}")
print(f'Perimetro: {perimetro}')
"""
"""
miVariable3 = 10
print(miVariable3)

# Operadores de reasignacion
miVariable3 = miVariable3 + 1
print(miVariable3)

miVariable3 += 1
print(miVariable3)

# miVariable3 = miVariable3 - 2
miVariable3 -= 2
print(miVariable3)

# miVariable3 = miVariable3 * 3
miVariable3 *= 3
print(miVariable3)

# miVariable3 = miVariable3 / 2
miVariable3 /= 2
print(miVariable3)
"""
"""
# Operadores de comparacion

d = 4
b = 2

resultado = d == b  # Comprobamos si son iguiales
print(resultado)

# Operador diferente
resultado = d != b
print(resultado)

# Operador Mayor que
resultado = d > b
print(resultado)

# Operador Menor que
resultado = d < b
print(resultado)

# Operador menor o igual que
resultado = d <= b
print(resultado)

# Operador Mayo o igual que
resultado = d >= b
print(resultado)
"""
"""
# Ejercicio1: Número par o impar

a = int(input("Digite un número: "))
print(f"El residuo de la division es: {a % 2}")
if a % 2 == 0:
    print(f"El valor de a es: {a} es un numero PAR" )
else:
    print(f"El valor de a es: {a} es un número IMPAR")
"""

# Ejercicio2: Determinar si es mayor de edad
mayorEdad = 18
edadIngresada = int(input("Ingrese la edad:  "))

if edadIngresada >= mayorEdad:
    print(f"Su edad es: {edadIngresada} años, es mayor de edad")
else:
    print(f"Su edad es: {edadIngresada} años, es menor de edad")
