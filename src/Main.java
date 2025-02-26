import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Ejercicio #2 - Switch Case Nuevo

        Scanner opcion = new Scanner(System.in);

        System.out.println("    ------------------------------");
        System.out.println("    ------------ MENÚ ------------");
        System.out.println("    ------------------------------");
        System.out.println("    1. Restar dos números");
        System.out.println("    2. Dividir dos números");
        System.out.println("    Dígite la opción que desea elegir: ");

        int opc = opcion.nextInt();
        int n1, n2;
        double n3, n4;

        switch (opc){
            case 1 -> { System.out.println("    Dígite el primer número: ");
            n1= opcion.nextInt();
            System.out.println("    Dígite el segundo número: ");
            n2= opcion.nextInt();
            System.out.println("    La suma es: "+(n1-n2));}
            case 2 -> { System.out.println("    Dígite el dividendo: ");
                n3= opcion.nextInt();
                System.out.println("    Dígite el divisor: ");
                n4= opcion.nextInt();
                System.out.println("    La resultado es: "+(n3/n4));}
            default -> { System.out.println("*** OPCIÓN NO VÁLIDA ***");
            System.out.println("*** SALIENDO DEL SISTEMA... ***");}
        }
    }
}