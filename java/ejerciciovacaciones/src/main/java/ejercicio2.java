import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        int compra;
        float precio_final;
        float descuento = 0.8f;
        Scanner ingresar = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de productos");
        compra = ingresar.nextInt();

        if (compra >= 100) {
            precio_final = compra * descuento;
        } else {
            precio_final = compra;
        }
        System.out.println("El total a pagar es: " + precio_final + " pesos");

    }
}
