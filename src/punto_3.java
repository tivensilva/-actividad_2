import java.util.Scanner;
import java.math.*;

/*
  Módulo 3 - Ejercicio propuesto 21
*/

public class punto_3 {

    public static void main(String[] args) {

        //Definimos el scanner para obtener los datos
        Scanner entryScanner = new Scanner(System.in);

        // Definimos los tipos de variable que vamos a usar
        float side_a, side_b, side_c, perimeter, semiperimeter, area;

        // Obtenemos los datos
        System.out.println("Por favor ingrese la medida del primer lado del triángulo tríangulo");
        side_a = entryScanner.nextFloat();
        System.out.println("Por favor ingrese la medida del segundo lado del tríangulo");
        side_b = entryScanner.nextFloat();
        System.out.println("Por favor ingrese la medida del tercer lado del tríangulo");
        side_c = entryScanner.nextFloat();
        
        /*Acá obtenemos los dato
          lo relevante es el uso de la fórmula de Herón para calcular el área
        */ 
        perimeter = (side_a + side_b + side_c);
        semiperimeter = perimeter / 2;
        area = (float) Math.sqrt(semiperimeter * (semiperimeter - side_a) * (semiperimeter - side_b) * (semiperimeter - side_c));

        // Imprimimos los resultados
        System.out.println("El area del triangulo es: " + area);
        System.out.println("El perimetro del triangulo es: " + perimeter);
        System.out.println("El semi-perimetro del triangulo es: " + semiperimeter);
    }
    
}