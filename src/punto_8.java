import java.util.Scanner;

/*
    Módulo 4 - Ejercicio propuesto 13
 */

public class punto_8 {
    public static void main(String[] args) {
        Scanner entryScanner = new Scanner(System.in);
        float valcomp, valpag, pdesc; String color;
        System.out.println("Ingrese el valor del producto: ");
        valcomp = entryScanner.nextFloat();
        System.out.println("Ingrese el color de la bolita: ");
        color = entryScanner.next();

        if (color.equals("blanca")) {
            pdesc = 0f;
        } else if (color.equals("verde")) {
            pdesc = 0.1f;
        } else if (color.equals("amarilla")) {
            pdesc = 0.25f;
        } else if (color.equals("azul")) {
            pdesc = 0.5f;
        } else {
            pdesc = 1f;
        }

        valpag = valcomp - (valcomp * pdesc);
        System.out.println("El valor a pagar es de: $" + valpag);
    }
}
