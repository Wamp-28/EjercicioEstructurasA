import java.util.Scanner;

public class ClasePersona {

    Scanner scanner = new Scanner(System.in);

    public void mostrarpersona() {

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su número de documento: ");
        String documento = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        String edad = scanner.nextLine();

            System.out.print("nombre: " + nombre + ", identificado con: " + documento + ", de " + edad + " años");
        }
    }
