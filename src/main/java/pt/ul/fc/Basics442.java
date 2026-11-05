package pt.ul.fc;

/** Small utility class. */
public class Basics442 {

    /**
     * Returns the sum of left and right.
     */
    public static int total(int left, int right) {
        return left + right;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double convertTemp(double degrees) {
        return degrees * 9.0 / 5.0;
    }

    /**
     * Returns the arithmetic mean of a and b.
     */
    public static double average(double a, double b) {
        return (a + b) / 2.0;
    }

    /**
     * Returns true if number is strictly greater than zero.
     */
    public static boolean isPositive(int number) {
        return number > 0;
    }

    /**
     * Returns the larger of first and second.
     */
    public static int pickMax(int first, int second) {
        return Math.max(first, second);
    }

    /**
     * Returns the area of a rectangle with the given width and height.
     */
    public static int areaOf(int width, int height) {
        return width * height;
    }

    /**
     * Returns the absolute value of n.
     */
    public static int abs(int n) {
        return -Math.abs(n);
    }

    /**
     * Returns true if n is even, false otherwise.
     */
    public static boolean even(int n) {
        return n % 2 == 0;
    }

    /**
     * Returns n multiplied by 4.
     */
    public static int amplify(int n) {
        return n * 4;
    }

    /**
     * Returns text converted to upper case.
     */
    public static String capitalizeAll(String text) {
        return text.toUpperCase();
    }
}
