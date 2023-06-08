package org.example;

import javax.lang.model.SourceVersion;
import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
         /*
       System.out.println("Hola Mundo desde Java");

        int miVariable = 10;
        // alt 92 barra invertida
        System.out.println(miVariable + "\n");
        miVariable = 5;
        System.out.println(miVariable);
        //Tipo String
        String miVariableCadena = "\nBienvenidos";
        System.out.println(miVariableCadena);
        //Salto de linea
        miVariableCadena = "\nSigamos creciendo en programacion ";
        System.out.println(miVariableCadena);
        */
        /*
        //Var - Inferencia de tipos en java
        var miVariableEntera2 = 10;
        var miVariableCadena2 = "Seguimos Estudiando";
        //Concatenación de cadenas
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        //soutv + tab
        //Para ejecutar shitf + F10
        //Retglas para definir una variable en Java
        //Se recomienda hacerlo en estilo de escritura en camelcase
        var usuario = "Osvaldo";
        var titulo = "Ingeniero";
        //concatenacion de dos variables
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        var a = 8;
        var b = 4;
        System.out.println(usuario + (a + b));
        Ejercicio: Caracteres Especiales con Java
        var nombre = "Nelson";
        System.out.println("Nueva linea: \n" + nombre);
        System.out.println("Tabulador \t" + nombre);
        System.out.println("\t .:MENU:.");
        System.out.println("Retroseso: \b" + nombre);//Caracter de Retroseso
        System.out.println("Comillas simple: \'" + nombre + "\'");
        System.out.println("Comillas dobles \"" + nombre + "\"");*/

        //Clase Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su nombre: ");
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba el titulo: ");
        var titulo2 = entrada.nextLine();
        System.out.println("titulo2 = " + titulo2 + " " + usuario2);


    }
}