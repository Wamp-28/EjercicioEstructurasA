public class empleadohoras extends tipoe {
    private String nombre;
    private int edad;
    private double salario;

    public empleadohoras(String nombre, int edad, double salario) {
        super(nombre, edad, salario);
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Salario: $" + salario);
    }
}
