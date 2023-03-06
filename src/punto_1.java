import java.util.Scanner; // Acá importamos el scan que usaremos

/*
  Módulo 3 - Ejercicio propuesto 18
*/

public class punto_1 {
    /*
     Después de iniciada la clase, procedemos con el esqueleto
     */
    public static void main(String[] args) {
        // Definimos el Scanner "entryScanner"
        Scanner entryScanner = new Scanner(System.in);
        
        // Declaramos las variables
        String code, names;
        int hours;
        float value;
        double percent;
        
        //Solicitamos la información del empleado, cada uno respetando el tipo de dato que requiere
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
        
        // Acá optimizamos y no realizamos variables de cálculo intermedias y aplicamos directamente en el mensaje
        System.out.println("El codigo del empleado es: " + code);
        System.out.println("El nombre del empleado es: " + names);
        System.out.println("El salario del empleado es: " + (hours * value));
        System.out.println("El salario del empleado con retencion es: " + ((hours * value) - (hours * value) * (percent / 100)));

    }

}
