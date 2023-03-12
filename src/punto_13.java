import java.util.Scanner;

/*
    Módulo 4 - Ejercicio propuesto 22
 */

public class punto_13 {
    public static void main(String args[]) {
        // Definimos el escaner para leer datos por teclado
        Scanner entryScanner = new Scanner(System.in);
        
        // Definimos las variables
        int A, B, C;

        // Solicitamos los datos
        System.out.println("Ingrese el peso de la esfera A: ");
        A = entryScanner.nextInt();
        System.out.println("Ingrese el peso de la esfera B: ");
        B = entryScanner.nextInt();
        System.out.println("Ingrese el peso de la esfera C: ");
        C = entryScanner.nextInt();

        // Definimos la impresión
        if (A > B && A > C) {
            System.out.println("La esfera A es la más pesada");
        } else if (B > A && B > C) {
            System.out.println("La esfera B es la más pesada");
        } else if (C > A && C > B) {
            System.out.println("La esfera C es la más pesada");
        } else {
            System.out.println("Las esferas A, B y C tienen el mismo peso");
        }

        entryScanner.close();
    }
}