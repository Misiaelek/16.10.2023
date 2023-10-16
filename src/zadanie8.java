import java.util.Scanner;

public class zadanie8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj szybkość pojazdu (w km/h): ");
        double speed = scanner.nextDouble();

        System.out.print("Podaj czas podróży (w godzinach): ");
        double time = scanner.nextDouble();

        double distance = distance(speed, time);

        System.out.println("Pojazd przejechał odległość: " + distance + " kilometrów.");
    }

    public static double distance(double speed, double time) {
        return speed * time;
    }
}
