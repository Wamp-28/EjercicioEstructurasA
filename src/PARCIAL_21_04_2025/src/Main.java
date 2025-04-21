import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClasePersona personas = new ClasePersona();
        ClasePerro perros = new ClasePerro();
        int cant;
        boolean continuar = true;


        while (continuar) {
            System.out.println("\n menu opciones \n" +
                    "1. informacion de la persona.\n" +
                    "2. Registrar perros.\n" +
                    "3. Ver personas registradas.\n" +
                    "4. Ver perros disponibles.\n" +
                    " 5. Adoptar perro. \n" +
                    " 6. Consultar el perro más viejo adoptado por una persona. \n" +
                    " 7. Salir del programa. \n" +
                    "Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                personas.mostrarpersona();
            } else if (opcion == 2) {
                perros.listaperro();
            } else if (opcion == 3) {
                perros.listaperro();
            } else if (opcion == 4) {
                perros.perromayor();
            }else {
                System.out.println("Opción no válida. Intente de nuevo.");
            } if (opcion == 7){
                System.out.println("finalisaste");
                continuar=false;
            }
        }while (continuar);
    }
}

