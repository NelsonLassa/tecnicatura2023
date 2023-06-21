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

        if (num2 % 2 == 0){
            System.out.println("Es un numero par");}
        else {
            System.out.println("Es un numero impar");
            }

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


        //Operadores Unarios: cambio de Signo
        var varA = 7;
        var varB = -varA;
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB);

        //Operador de Navegación
        var varC = true; //Esta literal por default en java es de tipo boolean
        var varD = !varC; //Aqui esta invirtiendo el valor
        System.out.println("varC = " + varC);
        System.out.println("varD = " + varD);

        //Operadores Unarios de Incremento:
        var varE = 9; // Se va a modificar su valor
        var varF = ++varE;// Simbolo antes de la variable
        //Primero se incremente la variable y despues se usa
        System.out.println("varE = " + varE); // se incrementa en la unidad
        System.out.println("varF = " + varF);
        
        //Post incremento (el simbolo va despues de la variable)
        var varH = 3;
        var varG = varH++;
        System.out.println("varH = " + varH);
        System.out.println("varG = " + varG);
        
        //Operadores Unarios de decremento
        var varI = 4;
        var varJ = --varI;
        System.out.println("varI = " + varI);
        System.out.println("varJ = " + varJ);

        //Postdecremento
        var varK = 8;
        var varL = varK--;
        System.out.println("varK = " + varK);
        System.out.println("varL = " + varL);*/
        /*
        //Operadores de igualdad y Relacionales
        var aNum = 5;
        var bNum = 9;
        var cNum = (aNum == bNum);
        System.out.println("cNum = " + cNum);

        var dNum = aNum != bNum;
        System.out.println("dNum = " + dNum);

        var cadenaA = "Hello";
        var cadenaB = "bye bye";
        var cadenaC = cadenaA == cadenaB; // hacen una comparacion del contenido
        System.out.println("cadenaC = " + cadenaC);

        var fvar =cadenaA.equals(cadenaB);
        System.out.println("fvar = " + fvar);

        //operadores relacionales
        var gVar = aNum != bNum; //< , > , <= , >= , != (diferente), ==
        System.out.println("gVar = " + gVar);

        if (aNum % 2 == 0){
            System.out.println("Es un numero par");}
        else{
            System.out.println("Es un numero impar");
        }

        var edad =30;
        var adulto = 18;
        if (edad >=adulto){
            System.out.println("Es mayor de edad");
        }
        else {
            System.out.println("Es menor de edad");
        }
        */
        /*
        //Operedores Condicionales And
        var valorA = 7;
        var valorMinimo = 0;
        var valorMaximo = 10;
        var respuesta = valorA >=0 && valorA <= 10;

        if (respuesta){
            System.out.println("Esta dentro del rango establecido");
                    }
        else {
            System.out.println("Esta fuera del rango establecido");
        }

        //Condicional or
        var vacaciones = false;
        var diaLibre = false;
        if (vacaciones||diaLibre){
            System.out.println("Papá puede asistir al juego de su hijo");
        }
        else {
            System.out.println("Papá no puede asistir al juego de su hijo");
        }*/
        /*
        //Operador Ternario
        var resultado = (5 > 4 ) ? "Verdadero" : "Falso";
        System.out.println("resultado = " + resultado);

        var numeroT = 4;
        resultado = (numeroT % 2 == 0) ? "Es Par" : "Es Impar";
        System.out.println("resultado = " + resultado);*/

        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("z = " + z);
        System.out.println("y = " + y);
        System.out.println("x = " + x);

        var solicionAritmetica= 4+5*6/3;
        System.out.println("solicionAritmetica = " + solicionAritmetica);

        solicionAritmetica = (4+5)*6/3;
        System.out.println("solicionAritmetica = " + solicionAritmetica);
    }
}