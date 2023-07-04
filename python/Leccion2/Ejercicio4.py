"""
Ejercicio 4
Area y longitud de un circulo
Hacer un programa para ingresar el radio de un circulo
y se reporte su area y la longitud de la circurferencia.
"""
import math

radio = float(input("Ingresa el valor del radio: "))
# Area
area = math.pi * (radio ** 2)
# Perimetro
perimetro = 2 * math.pi * radio

print(f'El area del circulo de radio {radio} es {area}')
print(f'El perimertro del circulo de radio {radio} es {perimetro} ')