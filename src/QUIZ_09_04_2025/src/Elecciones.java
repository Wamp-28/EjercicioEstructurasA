import java.util.ArrayList;

public class Elecciones {
    private ArrayList<Candidato> candidatos;

    public Elecciones() {
        candidatos = new ArrayList<>();
        candidatos.add(new Candidato("Candidato A"));
        candidatos.add(new Candidato("Candidato B"));
        candidatos.add(new Candidato("Candidato C"));
    }

    public void votar(int indice, String medio) {
        if (indice >= 0 && indice < candidatos.size()) {
            Candidato c = candidatos.get(indice);
            c.votar(medio);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void mostrarResultados() {
        int totalVotos = contarVotos();
        System.out.println("RESULTADOS:");
        for (Candidato c : candidatos) {
            int votos = c.getTotalVotos();
            double porcentaje = 0;
            if (totalVotos > 0) {
                porcentaje = (votos * 100.0) / totalVotos;
            }
            System.out.println(c.getNombre() + ": " + votos + " votos (" + String.format("%.2f", porcentaje) + "%), Costo campaña: $" + c.getCostoCampaña());
        }
        System.out.println("Costo promedio de campaña: $" + calcularCostoPromedio());
    }

    public int contarVotos() {
        int total = 0;
        for (Candidato c : candidatos) {
            total += c.getTotalVotos();
        }
        return total;
    }

    public int calcularCostoPromedio() {
        int suma = 0;
        for (Candidato c : candidatos) {
            suma += c.getCostoCampaña();
        }
        return suma / candidatos.size();
    }

    public void resetearUrnas() {
        for (Candidato c : candidatos) {
            c.resetVotos();
        }
    }

    public ArrayList<Candidato> getCandidatos() {
        return candidatos;
    }
}
