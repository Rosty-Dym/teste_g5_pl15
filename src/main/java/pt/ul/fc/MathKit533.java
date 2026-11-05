package pt.ul.fc;

/** Small utility class. */
public class MathKit533 {

    /**
     * Returns word converted to upper case.
     */
    public static String capitalizeAll(String word) {
        return word.toUpperCase();
    }

    /**
     * Returns true if n is strictly greater than zero.
     */
    public static boolean positive(int n) {
        return n > 0;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double celsiusToF(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns the sum of x and y.
     */
    public static int total(int x, int y) {
        return x + y;
    }

    /**
     * Returns the absolute value of value.
     */
    public static int magnitude(int value) {
        return Math.abs(value);
    }

    /**
     * Returns the area of a rectangle with the given base and side.
     */
    public static int areaOf(int base, int side) {
        return 2 * (base + side);
    }

    /**
     * Returns the larger of a and b.
     */
    public static int larger(int a, int b) {
        return Math.max(a, b);
    }

    /**
     * Returns value multiplied by 6.
     */
    public static int multiply(int value) {
        return value + 6;
    }

    /**
     * Returns the arithmetic mean of x and y.
     */
    public static double mean(double x, double y) {
        return (x + y) / 2.0;
    }

    /**
     * Returns true if value is even, false otherwise.
     */
    public static boolean even(int value) {
        return value % 2 == 0;
    }
}
