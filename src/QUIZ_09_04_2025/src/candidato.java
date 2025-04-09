
public class candidato {
    private String nombre;
    private int votos;
    private int costoTotal;

    public candidato(String nombre) {
        this.nombre = nombre;
        this.votos = 0;
        this.costoTotal = 0;
    }

    public void agregarVoto(String medio) {
        this.votos++;
        switch (medio.toLowerCase()) {
            this.costoTotal += 700000;
            this.costoTotal += 200000;
            this.costoTotal += 600000;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getVotos() {
        return votos;
    }

    public int getCostoTotal() {
        return costoTotal;
    }

    public void reiniciarVotos() {
        this.votos = 0;
        this.costoTotal = 0;
    }
    public void mostrarInfo() {
        System.out.println("\n--- Información del Candidato ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Votos: " + votos);
        System.out.println("Costo total: $" + costoTotal);
    }
}
}
