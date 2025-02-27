import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//
//        int peso;
//        double estatura, imc;
//
//        System.out.println("ingrese su estatura");
//        peso = teclado.nextInt();
//
//        System.out.println("ingrese su estatura");
//        estatura = teclado.nextDouble();
//
//        imc = peso / (estatura * estatura);
//        if (imc <= 18.49) {
//            System.out.println("IMC: " + imc + " Su estado es peso bajo");
//        } else if (imc <= 24.99) {
//            System.out.println("IMC: " + imc + " Su estado es peso peso normal");
//        } else if (imc <= 34.99) {
//            System.out.println("IMC: " + imc + " Su estado es peso peso normal");
//        }

//        //numero aleatorios
//        int min = 2;
//        int max = 100;
//
//        Random ale = new Random();
//        int numero = ale.nextInt((max - min + 1)) + min;
//        System.out.println("El aleatorio es " + numero);


                Random ale = new Random();
                int min = 2;
                int max = 100;

                int lanzamientos = ale.nextInt(max - min + 1) + min;
                System.out.println("se lanzaron " + lanzamientos + " .\n");

                int sumadado1 = 0;
                int sumadado2 = 0;

                int i;
                int dado1 = 0;
                int dado2 = 0;
                for (i = 1; i <= lanzamientos; i++) {
                    dado1 = ale.nextInt(6) + 1;
                    dado2 = ale.nextInt(6) + 1;

                    sumadado1 += dado1;
                    sumadado2 += dado2;
                }

                System.out.println("Lanzamiento #" + i + ": Dado 1 = " + dado1 + ", Dado 2 = " + dado2);

                System.out.println("el sumado del Dado 1 = " + sumadado1 + " y el sumado del Dado 2 = " + sumadado2);

                if (sumadado2 <= sumadado1) {
                    System.out.println("el dado 1 gano "+sumadado1);
                } else if (sumadado2 >= sumadado1) {
                    System.out.println("el dado 2 gano "+sumadado2);
                } else {
                    System.out.println("emparaton");
                }
            }
        }

