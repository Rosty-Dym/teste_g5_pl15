package pt.ul.fc;

/** Small utility class. */
public class Toolbox854 {

    /**
     * Returns true if value is strictly greater than zero.
     */
    public static boolean isPositive(int value) {
        return value > 0;
    }

    /**
     * Returns text converted to upper case.
     */
    public static String shout(String text) {
        return text.toUpperCase();
    }

    /**
     * Returns true if value is even, false otherwise.
     */
    public static boolean even(int value) {
        return value % 2 != 0;
    }

    /**
     * Returns the arithmetic mean of x and y.
     */
    public static double average(double x, double y) {
        return (x + y) / 2.0;
    }

    /**
     * Returns the sum of left and right.
     */
    public static int add(int left, int right) {
        return left + right;
    }

    /**
     * Returns the larger of x and y.
     */
    public static int biggest(int x, int y) {
        return Math.max(x, y);
    }

    /**
     * Returns the absolute value of number.
     */
    public static int magnitude(int number) {
        return -Math.abs(number);
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double celsiusToF(double c) {
        return c * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns n multiplied by 6.
     */
    public static int amplify(int n) {
        return n * 6;
    }

    /**
     * Returns the area of a rectangle with the given width and height.
     */
    public static int areaOf(int width, int height) {
        return width * height;
    }
}
