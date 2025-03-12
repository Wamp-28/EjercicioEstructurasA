import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int LL = 50;
        int Lld = 350;
        int LC = 150;
        int M = 0;
        int C = 0;
        int N = 0;
        int totalLlamadas = 0;
        int totalMinutos = 0;
        int costoTotal = 0;
        int opcion;
        boolean terminar = true;

        do {
            System.out.println("a donde deseas llamar: \n" +
                    "1. llamada local \n" +
                    "2. llamada Larga distancia \n" +
                    "3. llamada Celular \n" +
                    "4. detalle llamadas \n" +
                    "5. terminar");

            System.out.println("dijite cual desea hacer");
            opcion = teclado.nextInt();
            if (opcion == 1) {
                System.out.println("vas a realizar una llamada local \n" +
                        "Dijita el numero");
                N = teclado.nextInt();
                System.out.println("cuantos minutos duro");
                M = teclado.nextInt();
                C = LL * M;
                System.out.println("acabas de llamar al: " + N + ", duraste: " + M + ", el costo de su llamada es: " + C);
                totalLlamadas = 1;
                totalMinutos = M;
                costoTotal = C;
            } else if (opcion == 2) {
                System.out.println("vas a realizar una llamada larga distancia \n" +
                        "Dijita el numero");
                N = teclado.nextInt();
                System.out.println("cuantos minutos duro");
                M = teclado.nextInt();
                C = Lld * M;
                System.out.println("acabas de llamar al: " + N + ", duraste: " + M + ", el costo de su llamada es: " + C);
                totalLlamadas = 1;
                totalMinutos = M;
                costoTotal = C;
            } else if (opcion == 3) {
                System.out.println("vas a realizar una llamada Celular \n" +
                        "Dijita el numero");
                N = teclado.nextInt();
                System.out.println("cuantos minutos duro");
                M = teclado.nextInt();
                C = LC * M;
                System.out.println("acabas de llamar al: " + N + ", duraste: " + M + ", el costo de su llamada es: " + C);
                totalLlamadas = 1;
                totalMinutos = M;
                costoTotal = C;
            }else if (opcion == 4) {
                System.out.println("este es el registro de llamadas");

                totalLlamadas++;
                totalMinutos += M;
                costoTotal += C;

                System.out.println("Resumen de llamadas:");
                System.out.println("Número total de llamadas realizadas: " + totalLlamadas);
                System.out.println("Duración total de las llamadas en minutos: " + totalMinutos);
                System.out.println("Costo total de las llamadas en pesos: " + costoTotal);

            } else {
                System.out.println("no valido");
            }
            if (opcion == 5){
                System.out.println("terminaste");
                terminar=false;
            }
        }while (terminar);
    }
}
//Parcial estructuras
//Se quiere crear una aplicación para controlar los gastos
// telefónicos de una empresa. La empresa cuenta una línea
// telefónica a través de las cuales se pueden realizar
// llamadas locales, de larga distancia y a celulares.
//La empresa cuenta con planes telefónicos que establece las siguientes tarifas:
//
//Minuto Llamada Local: $50 pesos
//
//Minuto Llamada Larga Distancia: $350 pesos
//
//Minuto Llamada Celular: $150 pesos
//
//La aplicación debe permitir:
//
//1.	Registrar una llamada
//2.	Mostrar la información detallada de la línea (número de
// llamadas realizadas, duración total de las llamadas en minutos y el costo
// total de las llamadas en pesos)
//
//Adicionalmente, la aplicación debe permitir reiniciar el uso de la línea
// telefónica, dejando todos sus valores en cero