import java.util.Scanner;


public class punto_1 {
    /**
     * @author Stiven
     * @ejercicio 3-18
     */
    public static void main(String[] args) {
        Scanner entryScanner = new Scanner(System.in);
        String code, names;
        int hours;
        float value;
        double percent;
        System.out.println("Hola, bienvenido al programa de calculo de sueldo");
        System.out.println("Por favor ingrese el codigo del empleado");
        code = entryScanner.nextLine();
        System.out.println("Por favor ingrese el nombre del empleado");
        names = entryScanner.nextLine();
        System.out.println("Por favor ingrese la cantidad de horas trabajadas");
        hours = entryScanner.nextInt();
        System.out.println("Por favor ingrese el valor de la hora");
        value = entryScanner.nextFloat();
        System.out.println("Por favor ingrese el porcentaje de retencion en la fuente");
        percent = entryScanner.nextDouble();
        System.out.println("El codigo del empleado es: " + code);
        System.out.println("El nombre del empleado es: " + names);
        System.out.println("El salario del empleado es: " + (hours * value));
        System.out.println("El salario del empleado con retencion es: " + ((hours * value) - (hours * value) * (percent / 100)));

    }

}
