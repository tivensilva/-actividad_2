import java.util.Scanner;
import java.math.*;

public class punto_2 {
    /*
    
     @ejercicio 3-19
     */
    public static void main(String[] args) {
        double area; float perimeter; float height;
        System.out.println("Por favor ingrese la medida del lado del tríangulo");
        Scanner entryScanner = new Scanner(System.in);
        int side = entryScanner.nextInt();
        area = (Math.sqrt(3) / 4) * Math.pow(side, 2);
        perimeter = (side + side + side);
        height = (float) Math.cbrt(side);
        System.out.println("El area del triangulo es: " + area);
        System.out.println("El perimetro del triangulo es: " + perimeter);
        System.out.println("La altura del triangulo es: " + height);
    }
    
}
