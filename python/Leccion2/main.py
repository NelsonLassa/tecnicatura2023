# En esta clase veremos la sentencia if/else
"""
condicion = True
if condicion == True:
    print("Condicion Verdadera")
elif condicion == False:
    print("Condicion Falsa")
else:
    print("Condicion sin especificar")
"""
# Conversión de Número a texto

num = int(input("Digite un número en el rango del 1 al 3: "))
numTexto = ""
if num == 1:
    numTexto = "Número uno"
elif num == 2:
    numTexto = "Número dos"
elif num == 3:
    numTexto = "Número tres"
else:
    numTexto = "Has ingresado un número fuera de rango"
print(f'El número ingresado es: {num} - {numTexto}')