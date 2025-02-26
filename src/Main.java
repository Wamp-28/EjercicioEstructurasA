public class Main {
    public static void main(String[] args) {

/*
       System.out.println("buenas");
        System.out.println("Kevin Santiago Santos Castellanos");
        System.out.println("leer");
        System.out.println("ciclismo");
        System.out.println("ninguna");*/
        String Electrodomestico = "Lavadora";

        switch (Electrodomestico.toLowerCase()) {
            case "Nevera":
                Electrodomestico = "Nevera";
                break;
            case "Televisor":
                Electrodomestico = "Televisor";
                break;
            case "lavadora":
                Electrodomestico = "Lavadora";
                break;

            default:
                Electrodomestico = "No es tu electrodomestico";
        }
        System.out.println("Tu electrodomestico es\t" + Electrodomestico);

        int OpBicicleta = 3;


        String marcaBici =switch (OpBicicleta){
            case 1 -> "Scott";
            case 2 ->"Cannondate";
            case 3 ->"Specialized";
            default -> "No es tu bicicleta" ;

        };
        System.out.println("tu bicicleta es \t"+marcaBici);
    ;}

}