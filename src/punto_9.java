import java.util.Scanner;

/*
    Módulo 4 - Ejercicio propuesto 14
 */

public class punto_9 {
    public static void main(String args[]) {
        // Definimos el escaner para leer datos por teclado
        Scanner entryScanner = new Scanner(System.in);

        // Definimos las variables
        int dep1, dep2, dep3, sueldo, ventas, sueldoFinal;
        
        // Pedimos los datos
        System.out.println("Ingrese las ventas del departamento 1: ");
        dep1 = entryScanner.nextInt();
        System.out.println("Ingrese las ventas del departamento 2: ");
        dep2 = entryScanner.nextInt();
        System.out.println("Ingrese las ventas del departamento 3: ");
        dep3 = entryScanner.nextInt();
        System.out.println("Ingrese el sueldo de los vendedores: ");
        sueldo = entryScanner.nextInt();

        entryScanner.close();

        // Calculamos las ventas totales
        ventas = dep1 + dep2 + dep3;

        // Calculamos los porcentajes de ventas y el sueldo final del departamento 1
        if ((dep1 > 0.33*ventas)==true) {
            sueldoFinal = (int) (sueldo + 0.2*sueldo);
            System.out.println("Sueldo departamento 1: $" + sueldoFinal);
        } else {
            System.out.println("Sueldo departamento 1: $" + sueldo);
        }

        // Calculamos los porcentajes de ventas y el sueldo final del departamento 2
        if (dep2 > 0.33*ventas) {
            sueldoFinal = (int) (sueldo + 0.2*sueldo);
            System.out.println("Sueldo departamento 2: $" + sueldoFinal);
        } else {
            System.out.println("Sueldo departamento 2: $" + sueldo);
        }

        // Calculamos los porcentajes de ventas y el sueldo final del departamento 3
        if (dep3 > 0.33*ventas) {
            sueldoFinal = (int) (sueldo + 0.2*sueldo);
            System.out.println("Sueldo departamento 3: $" + sueldoFinal);
        } else {
            System.out.println("Sueldo departamento 3: $" + sueldo);
        }
    }
    
}
