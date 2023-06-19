miVariable = 3
print(miVariable)
miVariable = 'Hola a todos los estudiantes de la tecnicatura'
print(miVariable)
miVariable = 3.5
print(miVariable)
x = 10
y = 2
z = x + y
print(id(x))
# Las literales se escriben x328, la variable y = x072, la variable = x392
print(id(y))
print(id(z))

# Tipos int, float, String, Bool
x = 10
print(x)
print(type(x))
x = 14.5
print(x)
print(type(x))
x = "Hola alumnos"
print(x)
print(type(x))
x = True
print(x)
print(type(x))
x = False
print(x)
print(type(x))

# Manejo de cadenas (String)
miGrupoFavorito = "La Konga "
caracteristicas = "La mejor banda para bailar y sacar una sonrisa"
print("Mi grupo favorito es: ", miGrupoFavorito, caracteristicas)

numero1 = "7"
numero2 = "8"
print(int(numero1) + int(numero2))

# Tipos Boleanos (bool)
miBooleano = 3 > 2
print(miBooleano)

if miBooleano:
    print("El resultado es verdadero")
else:
    print("El resultado es falso")

# Procesar la entrada del usuario
# funcion input
resultado = input("Digite un numero: ")  # regresa un dato tipo string
print(resultado)

# Conversión de la entrada de datos
numero1 = int(input("Escribe el primer numero: "))
numero2 = int(input("Escribe el segundo numero: "))
resultado = numero1 + numero2
print("El resultado de la suma es: ", resultado)

# Ejercicio 1
dia = input("¿Como estuvo tu día? ")
print("Mi día estuvo de: " + dia)

# Ejercicio 2
titulo = input("Proporciona el titulo: ")
autor = input("Proporciona el autor: ")
print(titulo, "fue escrito por",autor)
