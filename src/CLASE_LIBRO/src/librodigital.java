public class librodigital extends LIBRO {
    private int tamañoMB;

    public librodigital(String titulo, String autor, double precio, int tamañoMB) {
        super(titulo, autor, precio);
        this.tamañoMB = tamañoMB;
    }

    public int getTamaño() {
        return tamañoMB;
    }

    public void setTamaño(int nuevoTamaño) {
        this.tamañoMB = nuevoTamaño;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tamaño: " + tamañoMB + " MB");
    }
}
