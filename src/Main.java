public class Main {
    public static void main(String[] args) {
        //Antiguo
        int day = 3;
        String dayName;
        switch (day) {
            case 1:
                dayName = "Lunes";
                break;
            case 2:
                dayName = "Martes";
                break;
            case 3:
                dayName = "Miércoles";
                break;
            case 4:
                dayName = "Jueves";
                break;
            case 5:
                dayName = "Viernes";
                break;
            case 6:
                dayName = "Sábado";
                break;
            case 7:
                dayName = "Domingo";
                break;
            default:
                dayName = "Día inválido";
                break;
        }
        System.out.println(dayName);

        int dia = 5;
        String Nombre = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Día inválido";
        };

        System.out.println(Nombre);

    }
}