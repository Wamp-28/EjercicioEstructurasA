import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precio, subtotal = 0, iva, total;
        int cantidad;
        String opcion;
        String comprado = "";
        String cantcomprado = "";

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su número de documento: ");
        String documento = scanner.nextLine();

        System.out.print("Ingrese su número de teléfono: ");
        String telefono = scanner.nextLine();

        System.out.println("Bienvenido a la tienda");

        do {
            precio = 0;
            System.out.println("Elige un producto:");
            System.out.println("mo: Mouse - $85,000");
            System.out.println("t: Teclado - $230,000");
            System.out.println("m: Monitor - $940,000");
            System.out.println("di: Disco duro - $120,000");
            System.out.println("d: DFB - $80,000");

            opcion = scanner.next();
            String producto = "";

            if (opcion.equals("mo")) {
                precio = 85000;
                producto = "Mouse";
            } else if (opcion.equals("t")) {
                precio = 230000;
                producto = "Teclado";
            } else if (opcion.equals("m")) {
                precio = 940000;
                producto = "Monitor";
            } else if (opcion.equals("di")) {
                precio = 120000;
                producto = "Disco duro";
            } else if (opcion.equals("d")) {
                precio = 80000;
                producto = "DFB";
            } else {
                System.out.println("Opción no válida, intenta de nuevo.");
                continue;
            }

            System.out.print("¿Cuántas unidades deseas?: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Eso no parece un número, inténtalo otra vez.");
                scanner.next();
            }
            cantidad = scanner.nextInt();

            if (cantidad > 0) {
                subtotal += precio * cantidad;
                comprado += producto + "\n";
                cantcomprado += cantidad + " unidade(s) - " + producto  + "  - $" + precio + " cada uno. ";
            } else {
                System.out.println("La cantidad debe ser mayor a 0.");
                continue;
            }

            System.out.print("¿Quieres agregar otro producto? (1 = Sí / 0 = No): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Eso no parece una opción válida, intenta otra vez.");
                scanner.next();
            }
        } while (scanner.nextInt() == 1);

        iva = subtotal * 0.16;
        total = subtotal + iva;

        System.out.println("--- Factura ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Documento: " + documento);
        System.out.println("Teléfono: " + telefono);

        System.out.println("se compro " );
        System.out.println(cantcomprado );


        System.out.println("Subtotal: $" + subtotal);
        System.out.println("IVA (16%): $" + iva);
        System.out.println("Total a pagar: $" + total);
        System.out.println("¡Gracias por tu compra!");
    }
}
