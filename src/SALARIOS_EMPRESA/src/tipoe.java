public class tipoe {
    private String nombre;
    private int edad;
    private double sueldo;

    public tipoe(String nombre, int edad, double sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
    }
    public String getnombre() {
        return nombre;
    }

    public int getedad() {
        return edad;
    }

    public double getsueldo() {
        return sueldo;
    }

    public void setnombre(String nuevonombre) {
        nombre = nuevonombre;
    }

    public void setedad(int nuevoedad) {
        edad = nuevoedad;
    }

    public void setsueldo(double nuevosueldo) {
        sueldo = nuevosueldo;
    }

    public void mostrarInfo() {
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.printf("sueldo: $" + sueldo);
    }
}