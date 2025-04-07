public class LIBRO {
    private String titulo;
    private String autor;
    private double precio;

    public LIBRO(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setTitulo(String nuevoTitulo) {
        titulo = nuevoTitulo;
    }

    public void setAutor(String nuevoAutor) {
        autor = nuevoAutor;
    }

    public void setPrecio(double nuevoPrecio) {
        precio = nuevoPrecio;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.printf("Precio: $%.2f%n", precio);
    }
}

