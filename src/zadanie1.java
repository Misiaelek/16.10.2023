public class zadanie1 {
    public static void showChar(String str, int position) {
        if (position >= 0 && position < str.length()) {
            char character = str.charAt(position);
            System.out.println("Znak na pozycji " + position + " to: " + character);
        } else {
            System.out.println("Pozycja poza zakresem łańcucha.");
        }
    }

    public static void main(String[] args) {
        String cityName = "Warszawa";
        showChar(cityName, 2);
    }
}
