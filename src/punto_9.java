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
        System.out.print("Ingrese las ventas del departamento 1: ");
        dep1 = entryScanner.nextInt();
        System.out.print("Ingrese las ventas del departamento 2: ");
        dep2 = entryScanner.nextInt();
        System.out.print("Ingrese las ventas del departamento 3: ");
        dep3 = entryScanner.nextInt();
        System.out.print("Ingrese el sueldo de los vendedores: ");

        // Calculamos las ventas totales
        ventas = dep1 + dep2 + dep3;

        // Calculamos los porcentajes de ventas
        if dep1 > 0.33*ventas {
            sueldoFinal = sueldo + 0.2*sueldo;
        }
        else if dep2 > 0.33*ventas {
            sueldoFinal = sueldo + 0.2*sueldo;
        }
        else if dep3 > 0.33*ventas {
            sueldoFinal = sueldo + 0.2*sueldo;
        }
        else {
            sueldoFinal = sueldo;
        }

    }
}
