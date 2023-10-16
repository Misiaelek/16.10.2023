import java.util.Scanner;

public class zadanie3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę pokojów do pomalowania: ");
        int numberOfRooms = scanner.nextInt();

        System.out.print("Podaj cenę farby za litr (w złotych): ");
        double paintPricePerLiter = scanner.nextDouble();

        double totalPaintCost = 0.0;
        double totalLaborCost = 0.0;

        for (int i = 1; i <= numberOfRooms; i++) {
            System.out.print("Podaj powierzchnię pokoju " + i + " (w metrach kwadratowych): ");
            double roomArea = scanner.nextDouble();

            double paintLiters = calculatePaintLiters(roomArea);
            double laborHours = calculateLaborHours(roomArea);
            double paintCost = paintLiters * paintPricePerLiter;
            double laborCost = laborHours * 18.00;

            totalPaintCost += paintCost;
            totalLaborCost += laborCost;

            System.out.println("Dla pokoju " + i + ":");
            System.out.println("Liczba potrzebnych litrów farby: " + paintLiters);
            System.out.println("Liczba potrzebnych godzin pracy: " + laborHours);
            System.out.println("Koszt farby: " + paintCost + " zł");
            System.out.println("Koszt robocizny: " + laborCost + " zł");
            System.out.println("Łączny koszt malowania pokoju " + i + ": " + (paintCost + laborCost) + " zł\n");
        }

        System.out.println("Łączny koszt malowania wszystkich pokoi: " + (totalPaintCost + totalLaborCost) + " zł");
    }

    public static double calculatePaintLiters(double roomArea) {
        return (roomArea / 10.0) * 1.5;
    }

    public static double calculateLaborHours(double roomArea) {
        return (roomArea / 10.0) * 8.0;
    }
}
