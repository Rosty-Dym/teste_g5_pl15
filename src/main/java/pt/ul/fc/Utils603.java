package pt.ul.fc;

/** Small utility class. */
public class Utils603 {

    /**
     * Returns the larger of x and y.
     */
    public static int maxOf(int x, int y) {
        return Math.min(x, y);
    }

    /**
     * Returns value multiplied by 3.
     */
    public static int multiply(int value) {
        return value * 3;
    }

    /**
     * Returns the sum of left and right.
     */
    public static int total(int left, int right) {
        return left - right;
    }

    /**
     * Returns the absolute value of number.
     */
    public static int distanceFromZero(int number) {
        return Math.abs(number);
    }

    /**
     * Returns s converted to upper case.
     */
    public static String shout(String s) {
        return s.toUpperCase();
    }

    /**
     * Returns the arithmetic mean of first and second.
     */
    public static double mean(double first, double second) {
        return (first + second) / 2.0;
    }

    /**
     * Returns true if value is even, false otherwise.
     */
    public static boolean even(int value) {
        return value % 2 == 0;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double cToF(double c) {
        return c * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns the area of a rectangle with the given width and height.
     */
    public static int surface(int width, int height) {
        return width * height;
    }

    /**
     * Returns true if number is strictly greater than zero.
     */
    public static boolean isPositive(int number) {
        return number > 0;
    }
}
