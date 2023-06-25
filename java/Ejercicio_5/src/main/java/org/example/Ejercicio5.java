package org.example;

import java.util.Scanner;

public class Ejercicio5 {

    /*Hacer un programa que calcule e imprima la suma de tres calificaciones
    Pedir las calificaciones al usuario, crear un proyecto nuevo llamado
    Ejercicio5
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float nota1, nota2, nota3, suma;

        //Solicitamos las 3 notas
        System.out.println("Ingrese las 3 notas-(numericamente)");
        nota1 = Float.parseFloat(entrada.nextLine());
        nota2 = Float.parseFloat(entrada.nextLine());
        nota3 = Float.parseFloat(entrada.nextLine());

        suma = nota1 + nota2 + nota3;

        System.out.println("\nLa suma es: " + suma);
    }
}