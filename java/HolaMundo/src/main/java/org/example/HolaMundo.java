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
        var usuario2 = entrada.nextLine();//Variable tipo string (nextline lee una linea completa)
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba el titulo: ");
        var titulo2 = entrada.nextLine();
        System.out.println("titulo2 = " + titulo2 + " " + usuario2);
        */
        Scanner scanner = new Scanner(System.in);
        //Escribe tu solucion aqui
        System.out.println("Proporciona el Titulo");
        String titulo = scanner.nextLine();
        System.out.println("Proporciona el autor");
        String autor = scanner.nextLine();
        System.out.println(titulo + " quien lo escribio fue: " + autor);


    }
}