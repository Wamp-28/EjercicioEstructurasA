import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();

        Hombre hombre = new Hombre("Carlos");
        hombre.jugarConRobot(robot);

        if (robot.estaDormido()) {
            robot.despertar();
        }

        System.out.println("Juego terminado.");
    }
}