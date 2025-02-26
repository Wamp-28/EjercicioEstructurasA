import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("    ------------------------------");
        System.out.println("    ------------ MENÚ ------------");
        System.out.println("    ------------------------------");
        System.out.println("    1. Sumar dos número");
        System.out.println("    2. Multiplicar dos números");
        System.out.println("    Dígite la opción que desea elegir: ");

        int opc = scanner.nextInt();
        int n1, n2;

        switch (opc){
            case 1: System.out.println("    Dígite el primer número: ");
            n1= scanner.nextInt();
            System.out.println("    Dígite el segundo número: ");
            n2= scanner.nextInt();

            System.out.println("    La suma es: "+(n1+n2));
            break;

            case 2: System.out.println("    Dígite el primer número: ");
                n1= scanner.nextInt();
                System.out.println("    Dígite el segundo número: ");
                n2= scanner.nextInt();

                System.out.println("    La multiplicación es: "+(n1*n2));
                break;
            default: System.out.println("*** OPCIÓN NO VÁLIDA ***");
        }




    }
}