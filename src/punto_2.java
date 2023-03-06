import java.util.Scanner;
import java.math.*;

public class punto_2 {
    /*
    Despúes de iniciada la clase procedemos con el esqueleto
     */
    public static void main(String[] args) {

        // declaramos el tipo de datos de las variables
        double area; float perimeter; float height;

    
        // Iniciamos el scanner y solicitamos los 3 datos
        Scanner entryScanner = new Scanner(System.in);
        System.out.println("Por favor ingrese la medida del lado del tríangulo");
        int side = entryScanner.nextInt();

        // Realizamos los calculos
        area = (Math.sqrt(3) / 4) * Math.pow(side, 2);
        perimeter = (side + side + side);
        height = (float) Math.cbrt(side);

        // Imprimimos los resultados
        System.out.println("El area del triangulo es: " + area);
        System.out.println("El perimetro del triangulo es: " + perimeter);
        System.out.println("La altura del triangulo es: " + height);
    }
    
}
