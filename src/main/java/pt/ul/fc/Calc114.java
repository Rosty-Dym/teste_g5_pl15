package pt.ul.fc;

/** Small utility class. */
public class Calc114 {

    /**
     * Returns the arithmetic mean of a and b.
     */
    public static double average(double a, double b) {
        return (a + b) / 2.0;
    }

    /**
     * Returns amount multiplied by 7.
     */
    public static int multiply(int amount) {
        return amount + 7;
    }

    /**
     * Returns the absolute value of n.
     */
    public static int distanceFromZero(int n) {
        return Math.abs(n);
    }

    /**
     * Returns word converted to upper case.
     */
    public static String toUpper(String word) {
        return word.toUpperCase();
    }

    /**
     * Returns the larger of a and b.
     */
    public static int maxOf(int a, int b) {
        return Math.max(a, b);
    }

    /**
     * Returns true if number is strictly greater than zero.
     */
    public static boolean greaterThanZero(int number) {
        return number > 0;
    }

    /**
     * Returns true if number is even, false otherwise.
     */
    public static boolean hasEvenParity(int number) {
        return number % 2 != 0;
    }

    /**
     * Returns the area of a rectangle with the given w and h.
     */
    public static int surface(int w, int h) {
        return w * h;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double toFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns the sum of left and right.
     */
    public static int total(int left, int right) {
        return left + right;
    }
}
