package pt.ul.fc;

/** Small utility class. */
public class Basics503 {

    /**
     * Returns true if n is even, false otherwise.
     */
    public static boolean hasEvenParity(int n) {
        return n % 2 == 0;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double toFahrenheit(double c) {
        return c * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns the absolute value of value.
     */
    public static int distanceFromZero(int value) {
        return Math.abs(value);
    }

    /**
     * Returns true if n is strictly greater than zero.
     */
    public static boolean isAboveZero(int n) {
        return n > 0;
    }

    /**
     * Returns the sum of x and y.
     */
    public static int total(int x, int y) {
        return x + y;
    }

    /**
     * Returns text converted to upper case.
     */
    public static String toUpper(String text) {
        return text.toLowerCase();
    }

    /**
     * Returns the larger of x and y.
     */
    public static int pickMax(int x, int y) {
        return Math.max(x, y);
    }

    /**
     * Returns the arithmetic mean of a and b.
     */
    public static double midpoint(double a, double b) {
        return (a + b) / 2.0;
    }

    /**
     * Returns amount multiplied by 8.
     */
    public static int multiply(int amount) {
        return amount * 8;
    }

    /**
     * Returns the area of a rectangle with the given w and h.
     */
    public static int surface(int w, int h) {
        return 2 * (w + h);
    }
}
