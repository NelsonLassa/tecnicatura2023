"""
# Operadores Lógicos

a = True
b = True
resultado = a and b
print(resultado)

# Operador or
resultado = a or b
print(resultado)

# Operador not
resultado = not a
print(resultado)
"""
"""
# Ejercicio: Valor dentro de un rango

valor = int(input("Digite un número dentro del rango 0 al 5: "))
valorMinimo = 0
valorMaximo = 5
dentroRango = (valor >= valorMinimo and valor <= valorMaximo)
if dentroRango:
    print(f'El valor {valor} estra dentro del rango')
else:
    print(f'El valor {valor} No esta dentro del rango')
"""
"""
# Ejercicio: Operador or , Operador not

vacaciones = True
diaDescanso = True
if not (vacaciones or diaDescanso):
    print("Tiene trabajo que hacer")
else:
    print("Puede asistir al juego")
"""

# Ejercicio: Rango entre las edades 20 y 30 años
edadUsuario = int(input("Ingresa tu edad: "))
veinte = edadUsuario >= 20 and edadUsuario < 30
print(veinte)
treinta = edadUsuario >= 30 and edadUsuario < 40
print(treinta)
if veinte or treinta:
    print("Estas dentro del rango de los (20'0) a (30'0) años")
else:
    print("No estas dentro del rango de los (20'0) a (30'0) años")
