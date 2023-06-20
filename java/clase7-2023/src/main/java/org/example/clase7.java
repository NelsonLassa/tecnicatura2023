package org.example;

public class clase7 {
    public static void main(String[] args) {

/*
        //inicializacion de varias varibles
        int num1 = 5, num2 = 4;
        var solucion = num1 + num2;
        System.out.println("solucion de la suma = " + solucion);

        solucion = num1 - num2;
        System.out.println("solucion de la resta = " + solucion);

        solucion = num1 * num2;
        System.out.println("solucion de la multipicacion = " + solucion);

        var solucion1 = num1 / num2;
        System.out.println("solucion de la division = " + solucion1);

        var solucion2 = 3.4 / num2;
        System.out.println("solucion2 de la division = " + solucion2);

        solucion1 = num1 % num2;//Guarda el residui entero de la division
        System.out.println("solucion1 = " + solucion1);

        if (num2 % 2 == 0)
            System.out.println("Es un numero par");
        else
            System.out.println("Es un numero impar");*/

        int varNum1 = 1, varNum2 = 4 ;
        int varNum3 = varNum1 + 6 - varNum2;//  una operacion
        System.out.println("varNum3 = " + varNum3);


        varNum1 += 1;
        System.out.println("varNum1 = " + varNum1);

        varNum2 -= 2;
        System.out.println("varNum2 = " + varNum2);

        varNum3 *=10;
        System.out.println("varNum3 = " + varNum3);

        varNum3 /= 2;
        System.out.println("varNum3 = " + varNum3);

        varNum3 %=2;
        System.out.println("varNum3 = " + varNum3);

    }
}