import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        System.out.println("selecciona cual deseas hacer: \n 1: Libro impreso \n 2: Libro digital");
        opcion = scanner.nextInt();

        if (opcion == 1) {
            libroimpreso libroFisico = new libroimpreso(
                    "Los apendices de Paris",
                    "Matias Serra",
                    110000.0,
                    200
            );
            System.out.println("\n=== LIBRO IMPRESO ===");
            libroFisico.mostrarInfo();

        } else if (opcion == 2) {
            librodigital libroDigital = new librodigital(
                    "Sé tú mismo: La locura de la superación personal",
                    "Svend",
                    80000.0,
                    150
            );
            System.out.println("\n=== LIBRO DIGITAL ===");
            libroDigital.mostrarInfo();

        } else {
            System.out.println("No hay información para la opción seleccionada");
        }
    }
}
