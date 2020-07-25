package pl.tomaszosuch;

public class Calculator {

    private static double add(double a, double b) {
        return a + b;
    }

    private static double subtraction(double a, double b) {
        return a - b;
    }

    public static void main(String[] args) {
        double a = 2;
        double b = 8.7;

        System.out.println("Wynik działania: " + a + " + " + b + " = " + add(a, b));
        System.out.println("Wynik działania: " + a + " - " + b + " = " + subtraction(a, b));
    }
}
