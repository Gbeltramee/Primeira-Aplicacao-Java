public class Main {
    public static void main(String[] args) {

        double celsius = 35.3;

        double fahrenheit = (celsius * 1.8) + 32;

        System.out.println(String.format("A temperatura em graus celsius são %.2f °C, que convertido para fahrenheit é %.2f °F.",
                celsius,fahrenheit));

    }
}