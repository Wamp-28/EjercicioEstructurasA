import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //JUEGO APUESTA Y GANA
        double dinero;
        int opcion;
        int numero;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("ingrese su cantidad inicial");
        dinero= scanner.nextDouble();

        while (dinero > 0) {
           numero = random.nextInt(3) + 1;
            System.out.println("el numero es " + numero);
            if (numero == 3) {
                System.out.println("perdiste " + numero);
            } else if (numero == 2) {
                dinero /= 2;
                System.out.println("tu dinero se se redujo a la mitad " + numero);
                System.out.print("¿Quieres seguir jugando? (s/n): ");
                opcion = scanner.nextInt();
                if (opcion == 1 ){
                    numero = random.nextInt(3) + 1;
                    continue;
                }else {
                    break;
                }
            } else if (numero == 1) {
                dinero *= 2;
                System.out.println("tu dinero se a multiplicado");
                System.out.print("¿Quieres seguir jugando? (s/n): ");
                opcion = scanner.nextInt();
                if (opcion == 1 ){
                    numero = random.nextInt(3) + 1;
                    continue;
                }else {
                    break;
                }
            }

        }
        System.out.println("el juego a terminado tienes= "+ dinero);

    }
}
