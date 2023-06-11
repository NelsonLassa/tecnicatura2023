package org.example;

import javax.lang.model.SourceVersion;
import javax.sql.rowset.serial.SQLOutputImpl;
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
        //Tipo Strin
        String miVariableCadena = "\nBienvenidos";
        System.out.println(miVariableCadena);
        //Salto de linea
        miVariableCadena = "\nSigamos creciendo en programacion ";
        System.out.println(miVariableCadena);
        */
        /*
        //Clase Scanner

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su nombre: ");
        //Variable tipo string (nextline lee una linea completa)
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba el titulo: ");
        var titulo2 = entrada.nextLine();
        System.out.println("titulo2 = " + titulo2 + " " + usuario2);
        */
        /*
        Scanner scanner = new Scanner(System.in);
        //Escribe tu solucion aqui
        System.out.println("Proporciona el Titulo");
        String titulo = scanner.nextLine();
        System.out.println("Proporciona el autor");
        String autor = scanner.nextLine();
        System.out.println(titulo + " quien lo escribio fue: " + autor);
        */

        /*byte numEnteroByte =  127;
        System.out.println("numEnteroByte = " + numEnteroByte);
        //Las clases comienzan con la Letra Mayuscula (Byte)
        System.out.println("Valor minimo del Byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo del Byte: " + Byte.MAX_VALUE);*/


        /*float numFloat = 3.4028235E38F;
        System.out.println("numFloat = " + numFloat);
        System.out.println("El valor minimo de float: " + Float.MIN_VALUE);
        System.out.println("El valor maximo de float: " + Float.MAX_VALUE);

        double numDouble = 1.7976931348623157E308;
        System.out.println("numDoble = " + numDouble);
        System.out.println("El valor minimo de double: " + Double.MIN_VALUE);
        System.out.println("El valor maximo de double: " + Double.MAX_VALUE);*/

        //Interencia de tipos var y tipos primitivos
        var numEntero = 20; //Las literales sin punto automaticamente son de tipo int
        System.out.println("numEntero = " + numEntero);
        var numFloat = 10.0F; //Automaticamente con el punto decimal se transforma en tipo double
        System.out.println("numFloat = " + numFloat);
        var numDouble = 10.0;
        System.out.println("numDouble = " + numDouble);


    }
}