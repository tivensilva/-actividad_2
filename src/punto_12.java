import java.math.*;
import java.util.Scanner;

/*
    Módulo 4 - Ejercicio propuesto 22
 */

public class punto_12 {
    public static void main(String args[]) {
        // Definimos el escaner para leer datos por teclado
        Scanner entryScanner = new Scanner(System.in);
        
        // Definimos las variables
        int A, B, C; float resultado; double r;

        System.out.println("La ecuación es: Ax^2 + Bx + C = 0 | Por favor ingrese los valores de A, B y C");
        System.out.print("Ingrese el valor de A: ");
        A = entryScanner.nextInt();
        System.out.print("Ingrese el valor de B: ");
        B = entryScanner.nextInt();
        System.out.print("Ingrese el valor de C: ");
        C = entryScanner.nextInt();

        // Definimos la impresión
        System.out.println("La ecuación ingresada es: " + A + "x^2 + " + B + "x + " + C + " = 0");

        // Resolvemos la ecuación
        r = Math.pow(B, 2) - 4 * A * C;
        if (r < 0) {
            System.out.println("La ecuación no tiene solución real");
        } else {
            resultado = (float) ((-B + Math.sqrt(r)) / (2 * A));
            System.out.println("El resultado de la ecuación es: " + resultado);
        }
        entryScanner.close();
    }
}