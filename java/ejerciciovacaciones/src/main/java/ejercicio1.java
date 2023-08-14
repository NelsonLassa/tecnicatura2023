import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingresa las calificaciones");
        System.out.print("Nota 1: ");
        int nota1 = scanner.nextInt();
        System.out.print("Nota 2: ");
        int nota2 = scanner.nextInt();
        System.out.print("Nota 3: ");
        int nota3 = scanner.nextInt();
        float prom= (float) (nota1 + nota2 + nota3) /3;
        if (prom >= 70){
            System.out.println("El estudianta aprobo la materia con: " + prom + " de promedio de nota");
        } else {
            System.out.println("El estudianta desaprobo la materia con: " + prom + " de promedio de nota");
        }


    }
}
