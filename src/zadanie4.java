public class zadanie4 {
    public static void main(String[] args) {
        for (int time = 1; time <= 10; time++) {
            double distance = fallingDistance(time);
            System.out.println("Czas: " + time + " sekundy, Odległość: " + distance + " metrów");
        }
    }

    public static double fallingDistance(int time) {
        double g = 9.8;
        double distance = 0.5 * g * time * time;
        return distance;
    }
}
