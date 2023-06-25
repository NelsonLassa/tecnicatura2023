package org.example;

import java.util.Scanner;

public class Ejercicio6 {
    /*
    GUILLERMO tiene N dólares. LUIS tiene la mitad de lo que
    posee Guillermo. JUAN tiene la mitad de lo que poseen Luis y Guillermo juntos.
    Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre
    los 3
     */
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        float guillermo, luis, juan, dolarestotales;
        System.out.println("Ingrese los dolares que posee GUILLERMO");
        guillermo = Float.parseFloat(consola.nextLine());

        luis = guillermo / 2;
        juan =(guillermo + luis)/2;
        dolarestotales = guillermo + luis + juan;
        System.out.println("\nLuis posee US$ " +luis );
        System.out.println("\nJuan posee US$ " + juan);
        System.out.println("\nEntre Guillermo, Luis y Juan tienen US$ " + dolarestotales);


    }
}