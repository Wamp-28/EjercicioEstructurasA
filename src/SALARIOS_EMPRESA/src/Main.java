import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad = 0;
        int horas = 0;
        int opcion = 0;

        System.out.println("selecciona cual eres: \n 1: empleado de planta \n 2: empleado por horas");
        opcion = scanner.nextInt();

        if (opcion == 1) {

            System.out.print("Ingrese su nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese su edad: ");
            edad = scanner.nextInt();
            System.out.print("Ingrese su salario: ");
            double salario = scanner.nextDouble();

            empleadoplanta empleado = new empleadoplanta(nombre, edad, salario);

            System.out.println("\nInformación del empleado:");
            empleado.mostrarInfo();

        } else if (opcion == 2) {

            System.out.print("Ingrese su nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese su edad: ");
            edad = scanner.nextInt();
            System.out.print("Ingrese las horas que trabajo: ");
            horas = scanner.nextInt();
            Double salario = (double) (horas * 98000);


            empleadoplanta empleado = new empleadohoras(nombre, edad, salario);

            System.out.println("\nInformación del empleado:");
            empleado.mostrarInfo();

        } else {
            System.out.println("No hay información para la opción seleccionada");
        }
    }
}