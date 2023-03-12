import java.util.Scanner;

/*
    Módulo 4 - Ejercicio propuesto 22
 */

public class punto_11 {
    public static void main(String args[]) {
        // Definimos el escaner para leer datos por teclado
        Scanner entryScanner = new Scanner(System.in);
        
        // Definimos las variables
        String nombre; float sueldoHora, sueldo; int horas;

        // Pedimos los datos por teclado
        System.out.print("Ingrese el nombre del trabajador: ");
        nombre = entryScanner.nextLine();
        System.out.print("Ingrese el sueldo por hora: ");
        sueldoHora = entryScanner.nextFloat();
        System.out.print("Ingrese la cantidad de horas trabajadas: ");
        horas = entryScanner.nextInt();

        // Definimos el sueldo
        sueldo = sueldoHora * horas;

        // Definimos la impresión
        if (sueldo> 450000) {
            System.out.println("Trabajador: " + nombre);
            System.out.println("Sueldo: " + sueldo);
        } else {
            System.out.println(nombre);

        entryScanner.close();
        }
    }
}