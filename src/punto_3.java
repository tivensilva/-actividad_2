import java.util.Scanner;
import java.math.*;

public class punto_3 {
    /*
    
     @ejercicio 3-19
     */
    public static void main(String[] args) {

        //Definimos el scanner para obtener los datos
        Scanner entryScanner = new Scanner(System.in);

        // Definimos los tipos de variable que vamos a usar
        float side, side2, side3, perimeter, semiperimeter, area;

        // Obtenemos los datos
        System.out.println("Por favor ingrese la medida del primer del tríangulo");
        side = entryScanner.nextFloat();
        System.out.println("Por favor ingrese la medida del segundo del tríangulo");
        side2 = entryScanner.nextFloat();
        System.out.println("Por favor ingrese la medida del tercer del tríangulo");
        side3 = entryScanner.nextFloat();
        
        /*Acá obtenemos los dato
          lo relevante es el uso de la fórmula de Herón para calcular el área
        */ 
        perimeter = (side + side2 + side3);
        semiperimeter = perimeter / 2;
        area = (float) Math.sqrt(semiperimeter * (semiperimeter - side) * (semiperimeter - side2) * (semiperimeter - side3));

        // Imprimimos los resultados
        System.out.println("El area del triangulo es: " + area);
        System.out.println("El perimetro del triangulo es: " + perimeter);
        System.out.println("El semi-perimetro del triangulo es: " + semiperimeter);
    }
    
}