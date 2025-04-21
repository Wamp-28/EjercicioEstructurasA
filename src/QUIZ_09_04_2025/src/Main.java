import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Elecciones elecciones = new Elecciones();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("MENÚ ELECCIONES\n" +
                    "1. Votar\n" +
                    "2. Ver resultados\n" +
                    "3. Vaciar urnas\n" +
                    "4. Salir\n" +
                    "Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar salto de línea

            if (opcion == 1) {
                System.out.println("\nSeleccione un candidato:");
                for (int i = 0; i < elecciones.getCandidatos().size(); i++) {
                    System.out.println((i + 1) + ". " + elecciones.getCandidatos().get(i).getNombre());
                }
                System.out.print("Número del candidato: ");
                int candidato = scanner.nextInt() - 1;
                scanner.nextLine(); // Limpiar salto de línea
                System.out.print("Medio de influencia (Internet, Radio, TV): ");
                String medio = scanner.nextLine();
                elecciones.votar(candidato, medio);
                System.out.println("¡Voto registrado!");
            } else if (opcion == 2) {
                elecciones.mostrarResultados();
            } else if (opcion == 3) {
                elecciones.resetearUrnas();
                System.out.println("Urnas vaciadas correctamente.");
            } else if (opcion == 4) {
                continuar = false;
                System.out.println("Programa finalizado.");
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
