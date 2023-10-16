public class zadanie5  {
    public static void main(String[] args) {
        System.out.println("Fahrenheit\tCelsius");
        for (int fahrenheit = 0; fahrenheit <= 20; fahrenheit++) {
            double celsius = celsius(fahrenheit);
            System.out.println(fahrenheit + "\t\t" + celsius);
        }
    }

    public static double celsius(int fahrenheit) {
        double celsius = (5.0 / 9.0) * (fahrenheit - 32);
        return celsius;
    }
}
