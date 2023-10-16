import java.util.Scanner;

public class zadanie2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj cenę hurtową produktu (w złotych): ");
        double wholesalePrice = scanner.nextDouble();

        System.out.print("Podaj marżę (w procentach): ");
        double marginPercentage = scanner.nextDouble();

        double retailPrice = calculateRetail(wholesalePrice, marginPercentage);

        System.out.println("Cena detaliczna produktu wynosi: " + retailPrice + " zł");
    }

    public static double calculateRetail(double wholesalePrice, double marginPercentage) {
        double margin = (marginPercentage / 100.0) * wholesalePrice;
        double retailPrice = wholesalePrice + margin;
        return retailPrice;
    }
}

