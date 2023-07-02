package org.example;

import java.util.Scanner;

/*
Una compañia de vende de carros usados, paga a su
personal de ventas un salario de $1000
mensuales mas un a comisión de $150 por cada
carro vendido, más el 5% del valor de la venta por carro
cada mes el capturista de la empresa ingresa en la computadora los datos pertinentes

Hacer un programa que calcule e imprima el salario mensual de un vendedor dado.
El salario de 1000 lo vamos a manejar como un dato contante, para asignarlo debemos usar
la palabra resarvada "final"
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner cosnsola  = new Scanner(System.in);
        final int sueldoFijo= 1000;
        int comision = 150 , cantidadAutos;
        float sueldoMensual, ventaCarro, porcVenta, totalPrecio;

        System.out.println("Ingrese la cantidad de autos vendidos: ");
        cantidadAutos = Integer.parseInt(cosnsola.nextLine());
        System.out.println("Ingrese el precio de un carro: ");
        ventaCarro = Float.parseFloat(cosnsola.nextLine());

        comision *= cantidadAutos;
        totalPrecio = ventaCarro * cantidadAutos;
        porcVenta = totalPrecio * 0.05f;
        sueldoMensual = sueldoFijo + comision + porcVenta;

        System.out.println("\nEl sueldo mensual sera de: $ " + sueldoMensual);

    }
}