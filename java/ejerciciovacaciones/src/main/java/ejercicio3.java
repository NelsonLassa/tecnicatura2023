import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        int num1;
        int num2;
        float resultado;
        String accion;
        Scanner ingresar = new Scanner(System.in);
        System.out.println("Digite 2 numeros cuales quiera: ");
        System.out.print("Primer número: ");
        num1 = ingresar.nextInt();
        System.out.print("Segundo número: ");
        num2 = ingresar.nextInt();

        if (num2 != num1) {
            if (num2 > num1) {
                resultado = num1 + num2;
                //accion = "Suma";
                accion = "+";
            } else {
                resultado = num1 - num2;
              //  accion = "Resta";
                accion = "-";
            }
        } else {
            resultado = num1 * num2;
            //accion = "Multiplicación";
            accion = "*";
        }
        //System.out.println(accion + " de los números " + num1 + " y " + num2 + " el resultado es: " + resultado);
        System.out.println("Cuenta: " + num1 + accion + num2 + "=" + resultado);
    }
}
