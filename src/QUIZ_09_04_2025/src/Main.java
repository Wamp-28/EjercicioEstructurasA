import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        private static candidato[] candidatos = new candidato[3];
        Scanner scanner = new Scanner(System.in);
        candidatos[0] = new candidato("Candidato A");
        candidatos[1] = new candidato("Candidato B");
        candidatos[2] = new candidato("Candidato C");
        int opcion = 1;

        System.out.println("cual accion desear hacer:\n",
                "1.	Votar por el candidato de su elección.\n",
                "2.	Calcular el costo de campaña de un candidato dependiendo de la influencia publicitaria de cada voto.\n",
                "3.	Vaciar todas las urnas de la votación.\n",
                "4.	Conocer el número total de votos.\n",
                "5.	Porcentaje de votos obtenidos por cada candidato.\n",
                "6.	Costo promedio de campaña en elecciones.",
                );
        opcion = scanner.nextInt();

        if (opcion == 1) {

            System.out.print("por cual candidato va a votar: ");
            String nombre = scanner.nextLine();

            candidato candidatos = new candidato (nombre);

            candidatos.mostrarInfo();
        } else if (opcion == 2) {

        } else if (opcion == 3) {
        } else if (opcion == 4) {
        } else if (opcion == 5) {
        } else if (opcion == 6) {
        } else {
            System.out.println("no ay info");
        }
    }
}
