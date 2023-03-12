import java.util.Scanner;

public class Swichpp {

    public static void main(String[] args) {
        Swichnormal colores = new Swichnormal();
        colores.seleccion();
    }
}

class Swichnormal {
    Scanner datos = new Scanner(System.in);

    double vc,vt,bv,ba,bA,br;
    String cb;

    public void seleccion() {
        System.out.println("Ingrese valor de su compra");
        vc = datos.nextDouble();
        System.out.println("Ingrese unicamente el color de la bola en letras minusculas");
        cb = datos.next();
        switch(cb){
            case "blanco":
                System.out.println("Usted no aplica para descuento, el valor total de su compra es"+vc);
                break;
            case "verde":
                bv=(vc*0.10)- vc;
                System.out.println("Su descuento es del 10%, el valor total de su compra es"+bv);
                break;

            case "amarillo":
                ba=(vc*0.25)- vc;
                System.out.println("Su descuento es del 25%, el valor total de su compra es"+ba);
                break;

            case "azul":
                bA=(vc*0.50)- vc;
                System.out.println("Su descuento es del 50%, el valor total de su compra es"+bA);
                break;

            case "roja":
                br=vc-vc;
                System.out.println("Su descuento es del 100%, el valor total de su compra es"+br);
                break;
            default:
                System.out.println("Error al ingresar el color");
                break;
        }
    }
}
