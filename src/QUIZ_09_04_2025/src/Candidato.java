public class Candidato {
    private String nombre;
    private int votosInternet;
    private int votosRadio;
    private int votosTv;

    public Candidato(String nombre) {
        this.nombre = nombre;
        votosInternet = 0;
        votosRadio = 0;
        votosTv = 0;
    }

    public void votar(String medio) {
        medio = medio.toLowerCase();
        if (medio.equals("internet")) {
            votosInternet++;
        } else if (medio.equals("radio")) {
            votosRadio++;
        } else if (medio.equals("tv")) {
            votosTv++;
        }
    }

    public int getTotalVotos() {
        return votosInternet + votosRadio + votosTv;
    }

    public int getCostoCampaña() {
        int costo = 0;
        costo += votosInternet * 700000;
        costo += votosRadio * 200000;
        costo += votosTv * 600000;
        return costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void resetVotos() {
        votosInternet = 0;
        votosRadio = 0;
        votosTv = 0;
    }
}
