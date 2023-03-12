import java.util.Scanner;

/*
    Módulo 4 - Ejercicio propuesto 15
 */

public class punto_10 {
    public static void main(String args[]) {
        // Definimos el escaner para leer datos por teclado
        Scanner entryScanner = new Scanner(System.in);
        
        // Definimos las variables
        int A, B, C, D;

        // Pedimos los datos por teclado
        System.out.print("Ingrese el valor de la esfera A: ");
        A = entryScanner.nextInt();
        System.out.print("Ingrese el valor de la esfera B: ");
        B = entryScanner.nextInt();
        System.out.print("Ingrese el valor de la esfera C: ");
        C = entryScanner.nextInt();
        System.out.print("Ingrese el valor de la esfera D: ");
        D = entryScanner.nextInt();

        // Hacemos la comparación
        if (A == B && B == C) {
            System.out.println("D es la esfera diferente");
        } else if (A == B && B == D) {
            System.out.println("C es la esfera diferente");
        } else if (A == C && C == D) {
            System.out.println("B es la esfera diferente");
        } else if (B == C && C == D) {
            System.out.println("A es la esfera diferente");
        }

        entryScanner.close();
    }
}