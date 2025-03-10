import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double C;
        double F;
        double K;
        double Ra;
        double Re;
        int opcion;

        boolean terminar = true;

        do {
            System.out.println("que deseas hacer: " +
                    "1. Celsius a Fahrenheit" +
                    "2. Celsius a Kelvin" +
                    "3. Celsius a Rankine" +
                    "4. Celsius a Réaumur" +
                    "5. Fahrenheit a Celsius" +
                    "6. Fahrenheit a Kelvin" +
                    "7. Fahrenheit a Rankine" +
                    "8. Fahrenheit a Réaumur" +
                    "9. Kelvin a Celsius" +
                    "10. Kelvin a Fahrenheit" +
                    "11. Kelvin a Rankine" +
                    "12. Kelvin a Réaumur" +
                    "13. Rankine a Celsius" +
                    "14. Rankine a Fahrenheit" +
                    "15. Rankine a Kelvin " +
                    "16. Salir ");
            System.out.println("dijite cual desea hacer");
            opcion = teclado.nextInt();
            if (opcion == 1) {
                System.out.println("vas a calcular de Celcius a Fahrenheit");
                System.out.println("dijita los  los grados celsius");
                C = teclado.nextDouble();
                F = ((C * (9 / 5)) + 32);
                System.out.println("el valor de fahrenheit (ºF) es : " + F);
            } else if (opcion == 2) {
                System.out.println("vas a calcular de Celcius a Kelvin");
                System.out.println("dijita los  los grados celsius");
                C = teclado.nextDouble();
                K = (C + 273.15);
                System.out.println("el valor de Kelvin (K) es : " + K);
            } else if (opcion == 3) {
                System.out.println("vas a calcular de Celcius a Rankine");
                System.out.println("dijita los  los grados celsius");
                C = teclado.nextDouble();
                Ra = ((C + 273.15) * (9 / 5));
                System.out.println("el valor de Rankine (ºR) es: " + Ra);
            } else if (opcion == 4) {
                System.out.println("vas a calcular de Celcius a Rèaumur");
                System.out.println("dijita los  los grados celsius");
                C = teclado.nextDouble();
                Re = (C * (4 / 5));
                System.out.println("el valor de Rèaumun (Re) es : " + Re);
            } else if (opcion == 5) {
                System.out.println("vas a calcular de Fahrenheit a Celsius");
                System.out.println("dijita los  los grados Fahrenheit");
                F = teclado.nextDouble();
                C = ((F - 32) * (5 / 9));
                System.out.println("el valor de Celsius (ºC) es: " + C);
            } else if (opcion == 6) {
                System.out.println("vas a calcular de Fahrenheit a Kelvin");
                System.out.println("dijita los  los grados Fahrenheit");
                F = teclado.nextDouble();
                K = ((F - 32) * (5 / 9) + 275.15);
                System.out.println("el valor de Kelvin (K) es: " + K);
            } else if (opcion == 7) {
                System.out.println("vas a calcular de Fahrenheit a Rankine");
                System.out.println("dijita los  los grados Fahrenheit");
                F = teclado.nextDouble();
                Ra = (F + 459.67);
                System.out.println("el valor de Rankine (ºR) es: " + Ra);
            } else if (opcion == 8) {
                System.out.println("vas a calcular de Fahrenheit a Réaumur ");
                System.out.println("dijita los  los grados Fahrenheit");
                F = teclado.nextDouble();
                Re = ((F - 32) * (4 / 9));
                System.out.println("el valor de Rèaumur (ºRe) es: " + Re);
            } else if (opcion == 9) {
                System.out.println("vas a calcular de Kelvin a Celsius  ");
                System.out.println("dijita los  los grados Kelvin");
                K = teclado.nextDouble();
                C = ( K - 273.15 );
                System.out.println("el valor de Celsius (ºC) es: " + C);
            } else if (opcion == 10) {
                System.out.println("vas a calcular de Kelvin a Fahrenheit");
                System.out.println("dijita los  los grados Kelvin");
                K = teclado.nextDouble();
                F = (  (K - 273.15) * (9/5) + 32);
                System.out.println("el valor de Fahrenheit (ºF) es: " + F);
            } else if (opcion == 11) {
                System.out.println("vas a calcular de Kelvin a Rankine  ");
                System.out.println("dijita los  los grados Kelvin");
                K = teclado.nextDouble();
                Ra = ( K * (9/5) );
                System.out.println("el valor de Celsius (ºC) es: " + Ra);
            } else if (opcion == 12) {
                System.out.println("vas a calcular de Kelvin a Réaumur");
                System.out.println("dijita los  los grados Kelvin");
                K = teclado.nextDouble();
                Re = ( (K - 273.15) * (4/5) );
                System.out.println("el valor de Réaumur  (ºRe) es: " + Re);
            } else if (opcion == 13) {
                System.out.println("vas a calcular de Rankine a Celsius ");
                System.out.println("dijita los  los grados Rankine");
                Ra = teclado.nextDouble();
                C = ( (Ra - 491.67) * (5/9)  );
                System.out.println("el valor de Celsius (ºC) es: " + C);
            } else if (opcion == 14) {
                System.out.println("vas a calcular Rankine a Fahrenheit ");
                System.out.println("dijita los  los grados Rankine");
                Ra = teclado.nextDouble();
                F = ( Ra - 459.67 );
                System.out.println("el valor de Fahrenheit (ºF) es: " + F);
            } else if (opcion == 15) {
                System.out.println("vas a calcular Rankine a Kelvin ");
                System.out.println("dijita los  los grados Rankine");
                Ra = teclado.nextDouble();
                K = ( Ra * (5/9));
                System.out.println("el valor de Kelvin (ºK) es: " + K);
            } else {
                System.out.println("no valido");
            }
            if (opcion == 16){
                System.out.println("salir");
                terminar=false;
            }
        }while (terminar);
        }
    }