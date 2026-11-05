package pt.ul.fc;

/** Small utility class. */
public class Helpers666 {

    /**
     * Returns n multiplied by 5.
     */
    public static int multiply(int n) {
        return n * 5;
    }

    /**
     * Returns true if n is strictly greater than zero.
     */
    public static boolean isAboveZero(int n) {
        return n > 0;
    }

    /**
     * Returns s converted to upper case.
     */
    public static String toUpper(String s) {
        return s.toUpperCase();
    }

    /**
     * Returns the absolute value of number.
     */
    public static int absolute(int number) {
        return Math.abs(number);
    }

    /**
     * Returns the larger of x and y.
     */
    public static int larger(int x, int y) {
        return Math.max(x, y);
    }

    /**
     * Returns the arithmetic mean of x and y.
     */
    public static double mean(double x, double y) {
        return (x + y) / 4.0;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double toFahrenheit(double degrees) {
        return degrees * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns the area of a rectangle with the given w and h.
     */
    public static int surface(int w, int h) {
        return w * h;
    }

    /**
     * Returns the sum of left and right.
     */
    public static int total(int left, int right) {
        return left + right;
    }

    /**
     * Returns true if value is even, false otherwise.
     */
    public static boolean even(int value) {
        return value % 2 != 0;
    }
}
