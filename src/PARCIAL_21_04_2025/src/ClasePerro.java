import java.util.Scanner;

public class ClasePerro {
    Scanner scanner = new Scanner(System.in);

    public void listaperro() {
        System.out.println("\n lista de perros \n" +
                "1. placa: 0010\n Nombre: Bolt\n Raza: Labrador\n Edad: 4 años\n Tamaño: grande.\n" +
                "2. placa: 0011\n Nombre: Rex\n Raza: Pitbull\n Edad: 6 años\n Tamaño: mediano.\n" +
                "3. placa: 0012\n Nombre: Max\n Raza: Chauchau\n Edad: 2 años\n Tamaño: mediano.\n" +
                "4. placa: 0013\n Nombre: Tobi\n Raza: Golden\n Edad: 7 años\n Tamaño: grande.\n" +
                "5. placa: 0014\n Nombre: Holl\n Raza: Pitbull\n Edad: 8 años\n Tamaño: mediano.\n" +
                "6. placa: 0015\n Nombre: Rey\n Raza: Lobo Siberiano\n Edad: 4 años\n Tamaño: grande.\n" +
                "Seleccione una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        if (opcion == 1) {
            System.out.println("felicidades acabas de aboptar al 1 placa: 0010\n Nombre: Bolt\n Raza: Labrador\n Edad: 4 años\n Tamaño: grande.\n");
        } else if (opcion == 2) {
            System.out.println();
        } else {
            System.out.println("Opción no válida. Intente de nuevo.");
        }
    }
    public void perromayor() {
        Scanner scanner = new Scanner(System.in);

        int num1 = 4;
        int num2 = 6;
        int num3 = 2;
        int num4 = 7;
        int num5 = 8;
        int num6 = 4;
        int opcion = scanner.nextInt();
        scanner.nextLine();
        int mayor = num1;
        mayor = Math.max(mayor, num2 +);
        mayor = Math.max(mayor, num3);
        mayor = Math.max(mayor, num4);
        mayor = Math.max(mayor, num5);
        mayor = Math.max(mayor, num6);

        System.out.println("El perro mayor es: " + mayor);
    }
}


