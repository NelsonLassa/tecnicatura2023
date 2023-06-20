package org.example;

import java.util.Scanner;

public class Clase6_2023 {
    public static void main(String[] args) {
      /*  System.out.println("Hello world!");


        //Tipos primitivos booleanos
        //boolean varBool = true;
        var varBool = false;
        System.out.println("varBool = " + varBool);

        if (varBool) {
            System.out.println("La bandera es verde");

        }
        else{
            System.out.println("La bandera es roja");
        }

        //Algoritmo: ¿Es mayor de edad?
        var edad = 18; //Literal tener presente la inferencia de tipos
        //var adulto = edad >= 18; //Esta es una expresion booleana
        if (edad >= 18){
            System.out.println("Eres mayor de Edad");
        }
        else{
            System.out.println("Eres menor de Edad");
        }
       */
        /*
        //CONVERSIÓN DE TIPOS PRIMITIVOS
        var edad = Integer.parseInt("20");
        //var edad = "20";//Demostracion de que lo toma como un string
        System.out.println("edad = " + (edad + 1));
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);

         */

        //Pedir un Valor
        var entrada = new Scanner(System.in);
        //System.out.println("Digite su edad: ");
        //edad = Integer.parseInt(entrada.nextLine());
        //System.out.println("edad = " + edad);


        //Conversion de tipos primitivos en Java Parte 2
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);

        var fraseChar = "programadores".charAt(12);
        System.out.println("fraseChar = " + fraseChar);


        System.out.println("Digite un carcter: ");
        fraseChar = entrada.nextLine().charAt(0);
        System.out.println("fraseChar = " + fraseChar);



    }

}