import java.util.Scanner;

public class zadanie7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double meters;

        do {
            System.out.print("Podaj odległość w metrach (lub wprowadź 0 aby zakończyć): ");
            meters = scanner.nextDouble();

            if (meters < 0) {
                System.out.println("Odległość nie może być ujemna. Spróbuj ponownie.");
                continue;
            }

            if (meters == 0) {
                System.out.println("Żegnaj.");
                break;
            }

            showMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showKilometers(meters);
                    break;
                case 2:
                    showInches(meters);
                    break;
                case 3:
                    showFeet(meters);
                    break;
                case 4:
                    System.out.println("Żegnaj.");
                    break;
                default:
                    System.out.println("Błędny wybór. Spróbuj ponownie.");
            }
        } while (meters != 0);

        scanner.close();
    }

    public static void showKilometers(double meters) {
        double kilometers = meters * 0.001;
        System.out.println(meters + " metrów to " + kilometers + " kilometrów.");
    }

    public static void showInches(double meters) {
        double inches = meters * 39.37;
        System.out.println(meters + " metrów to " + inches + " cali.");
    }

    public static void showFeet(double meters) {
        double feet = meters * 3.281;
        System.out.println(meters + " metrów to " + feet + " stóp.");
    }

    public static void showMenu() {
        System.out.println("1. Przelicz na kilometry.");
        System.out.println("2. Przelicz na cale.");
        System.out.println("3. Przelicz na stopy.");
        System.out.println("4. Zamknij program.");
        System.out.print("Podaj wybraną opcję: ");
    }
}
