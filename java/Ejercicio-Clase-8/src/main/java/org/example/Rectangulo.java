package org.example;

import java.util.Scanner;

public class Rectangulo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la altura del RECTANGULO: ");
        float alto = entrada.nextFloat();
        System.out.println("Ingrese el ancho del RECTANGULO: ");
        float ancho = entrada.nextFloat();
        float area = alto * ancho;
        float perimetro = (alto + ancho) * 2;
        System.out.println("------Datos del area------");
        System.out.println("Area= " + area + " metros cuadrados");
        System.out.println("Perimetro = " + perimetro + " metros");
        var mayor = alto > ancho;
        //var mayor = (alto > ancho) ? "Verdadero" : "Falso";
        //System.out.println("El alto es mayor = " + mayor);

        if (mayor){
            System.out.println("Es mas alto que ancho");
        }
        else {
            System.out.println("Es mas ancho que alto");
        }

    }
}