import java.util.Scanner;

/*
   Módulo 4 - Ejercicio propuesto 12
 */

public class punto_7 {
    public static void main(String[] args) {
        Scanner entryScanner = new Scanner(System.in);
        int hours, value; String name;
        System.out.println("Ingrese el nombre del empleado: ");
        name = entryScanner.nextLine();
        System.out.println("Ingrese la cantidad de horas trabajadas: ");
        hours = entryScanner.nextInt();
        System.out.println("Ingrese el valor por hora: ");
        value = entryScanner.nextInt();
        if (hours > 40) {
            int extraHours = hours - 40;
            hours = 40;
            if (extraHours > 8) {
                int extraHours2 = extraHours - 8;
                extraHours = 8;
                int salary = (hours * value) + (extraHours * (value * 2)) + (extraHours2 * (value * 3));
                System.out.println("El trabajador " + name + " devengó: $" + salary);
            } else {
                int salary = (40 * value) + (extraHours * (value * 2));
                System.out.println("El salario de " + name + " es de " + salary);
            }
    }   else {
            int salary = hours * value;
            System.out.println("El salario de " + name + " es de " + salary);
        }
}
}