public class libroimpreso extends LIBRO {
    private int pesoGramos;

    public libroimpreso(String titulo, String autor, double precio, int peso) {
        super(titulo, autor, precio);
        this.pesoGramos = peso;
    }

    public int getPeso() {
        return pesoGramos;
    }

    public void setPeso(int nuevoPeso) {
        this.pesoGramos = nuevoPeso;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Peso: " + pesoGramos + " gramos");
    }
}
