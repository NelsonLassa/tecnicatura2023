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
"""
# Ejercicio: Rango entre las edades 20 y 30 años
edadUsuario = int(input("Ingresa tu edad: "))
# veinte = edadUsuario >= 20 and edadUsuario < 30
# print(veinte)
# treinta = edadUsuario >= 30 and edadUsuario < 40
# print(treinta)
# if veinte or treinta:
# if (edadUsuario >=20 and edadUsuario < 30) or (edadUsuario >= 30 and edadUsuario <40):
if (20 <= edadUsuario < 30) or (30 <= edadUsuario < 40): # Sintaxis simplificada del operador and
    print("Estas dentro del rango de los (20'0) a (30'0) años")
#   if veinte:
#      print("Estas dentro del rango de los (20'0)  años")
#    elif treinta:
#       print("Estas dentro del rango de los (30'0) años")
else:
    print("No estas dentro del rango de los (20'0) a (30'0) años")
"""
"""
# Ejercicio: El mayor de dos números
numero1 = int(input("Digite un valor para el numero1: "))
numero2 = int(input("Digite un valor para el número2: "))

if numero1 > numero2:
    print(f"El numero1 {numero1} es mayor que {numero2}")
else:
    print(f"El numero2 {numero2} es mayor que {numero1}")
"""
# Ejercicio: Tienda de libros
print("Digite los siguientes Datos: ")
libro = input("Digite el nombre del libro: ")
libroId = int(input("Digite el ID del libro: "))
libroPrecio = float(input("Digite el precio del libro: "))
envioGratuito = input("Indicar si el envio es gratuito (True/False): ")
if envioGratuito == 'True':
    envioGratuito = True
elif envioGratuito == 'False':
    envioGratuito = False
else:
    envioGratuito = "El valor es incorrecto, debe escribir True/False"
print(f'''
        Nombre: {libro}
        Id: {libroId}
        Precio: {libroPrecio}
        Envio Gratuito?: {envioGratuito}
''')
