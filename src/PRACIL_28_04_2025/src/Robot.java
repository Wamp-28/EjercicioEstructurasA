public class Robot {

    public static class Bateria {
        private int carga;

        public Bateria(int cargaInicial) {
            this.carga = cargaInicial;
        }

        public int getCarga() {
            return carga;
        }

        public void setCarga(int nuevaCarga) {
            if (nuevaCarga < 0) nuevaCarga = 0;
            if (nuevaCarga > 1000) nuevaCarga = 1000;
            this.carga = nuevaCarga;
        }
    }

    private boolean dormido;
    private Bateria bateria;

    public Robot() {
        bateria = new Bateria(1000);
        dormido = false;
    }

    public void avanzar(int pasos) {
        if (dormido) {
            System.out.println("El robot está dormido. No puede avanzar.");
        } else if (bateria.getCarga() == 0) {
            System.out.println("La batería está vacía. Recarga para avanzar.");
        } else {
            int energiaGastada = (pasos / 100) * 10;
            bateria.setCarga(bateria.getCarga() - energiaGastada);
            System.out.println("El robot avanzó " + pasos + " pasos.");
        }
    }

    public void retroceder(int pasos) {
        if (dormido) {
            System.out.println("El robot está dormido. No puede retroceder.");
        } else if (bateria.getCarga() == 0) {
            System.out.println("La batería está vacía. Recarga para retroceder.");
        } else {
            int energiaGastada = (pasos / 100) * 10;
            bateria.setCarga(bateria.getCarga() - energiaGastada);
            System.out.println("El robot retrocedió " + pasos + " pasos.");
        }
    }

    public void dormir() {
        dormido = true;
        System.out.println("el robot se encuentra dormido");
    }

    public void despertar() {
        dormido = false;
        System.out.println("El robot ahora esta despieto");
    }

    public void recargar() {
        bateria.setCarga(1000);
        System.out.println("el robot ahoira esta cargado");
    }

    public boolean bateriallena() {
        return bateria.getCarga() = 1000;
    }

    public boolean bateriaVacia() {
        return bateria.getCarga() = 0;
    }
    public int energiaActual() {
        return bateria.getCarga();
    }
    public boolean estaDormido() {
        return dormido;
    }
}
