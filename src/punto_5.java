import java.util.Scanner;

public class punto_5 {
    public static void main(String[] args) {
        
        // Definimos los tipos de variable que vamos a usar
        int estrato, num; String nom; float pat, total, pago;

        // Definimos el scanner para obtener los datos
        Scanner entryScanner = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de pago de matrícula");
        System.out.println("por favor brinde los siguientes datos para contninuar \n");
        System.out.print("Ingrese el nombre del estudiante: ");
        nom = entryScanner.nextLine();
        System.out.print("Ingrese el número de de inscripción: ");
        num = entryScanner.nextInt();
        System.out.print("Ingrese el estrato socioeconómico: ");
        estrato = entryScanner.nextInt();
        System.out.print("Ingrese el patrimonio de la familia: ");
        pat = entryScanner.nextFloat();

        // Realizamos el condicional e imprimimos
        pago = 50000;
        if (pat > 2000000 && estrato > 3) {
            total = (float) (pago + (pat * 0.03));
            System.out.println("El estudiante " + nom + " con número de inscripción " + num + " debe pagar " + total + " por concepto de matrícula");
        }
    }
    
}
