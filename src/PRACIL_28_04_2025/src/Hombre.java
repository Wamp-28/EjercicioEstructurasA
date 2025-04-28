import java.util.Scanner;
public class Hombre {
    private String nombre;
    public Hombre(String nombre) {
        this.nombre = nombre;
    }

    public void jugarConRobot(Robot robot) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("\n QUE ACCION DESEAS HACER\n"+
                    "1. Avanzar\n"+
                    "2. Retroceder\n"+
                    "3. Ver energía\n"+
                    "4. Dormir al robot\n"+
                    "5. Despertar al robot\n"+
                    "6. Recargar batería\n"+
                    "Elige una opción: ");
            opcion = teclado.nextInt();

            if (opcion == 1) {
                System.out.print("¿Cuántos pasos quieres avanzar?: ");
                int pasos = teclado.nextInt();
                robot.avanzar(pasos);
            } else if (opcion == 2) {
                System.out.print("¿Cuántos pasos quieres retroceder?: ");
                int pasos = teclado.nextInt();
                robot.retroceder(pasos);
            } else if (opcion == 3) {
                System.out.println("Energía actual: " + robot.energiaActual());
            } else if (opcion == 4) {
                robot.dormir();
            } else if (opcion == 5) {
                robot.despertar();
            } else if (opcion == 6) {
                robot.recargar();
            } else {
                System.out.println("Opción incorrecta.");
            }
        }

        System.out.println(nombre + " ha terminado de jugar con el robot.");
    }
}

