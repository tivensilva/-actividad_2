import java.util.Scanner;

/*
    Módulo 4 - Ejercicio propuesto 11

*/

public class punto_6 {
    public static void main(String[] args) {
        Scanner entryScanner = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Ingrese el primer número: ");
        num1 = entryScanner.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = entryScanner.nextInt();
        System.out.println("Ingrese el tercer número: ");
        num3 = entryScanner.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("El número mayor es: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El número mayor es: " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("El número mayor es: " + num3);
        } else {
            System.out.println("Los números son iguales");
        }
    
}
