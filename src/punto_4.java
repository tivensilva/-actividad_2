import java.util.Scanner;

public class punto_4 {
    public static void main(String[] args) {

        // Definimos los tipos de variable que vamos a usar
        float A, B;

        //Definimos el scanner para obtener los datos
        Scanner entryScanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número A: ");
        A = entryScanner.nextFloat();
        System.out.print("Ingrese el segundo número B: ");
        B = entryScanner.nextFloat();

        // Realizamos el condicional e imprimimos
        if (A > B) {
            System.out.println("El número " + A + " es mayor que " + B);
        } else if (A < B) {
            System.out.println("El número " + A + " es menor que " + B);
        } else {
            System.out.println("El número " + A + " es igual que " + B);
        }

        
    }
}
