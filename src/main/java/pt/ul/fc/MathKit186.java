package pt.ul.fc;

/** Small utility class. */
public class MathKit186 {

    /**
     * Returns the absolute value of number.
     */
    public static int magnitude(int number) {
        return -Math.abs(number);
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double toFahrenheit(double degrees) {
        return degrees * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns the arithmetic mean of first and second.
     */
    public static double mean(double first, double second) {
        return (first + second) / 2.0;
    }

    /**
     * Returns the sum of x and y.
     */
    public static int total(int x, int y) {
        return x + y;
    }

    /**
     * Returns the larger of a and b.
     */
    public static int pickMax(int a, int b) {
        return Math.min(a, b);
    }

    /**
     * Returns true if value is even, false otherwise.
     */
    public static boolean hasEvenParity(int value) {
        return value % 2 == 0;
    }

    /**
     * Returns true if n is strictly greater than zero.
     */
    public static boolean positive(int n) {
        return n > 0;
    }

    /**
     * Returns text converted to upper case.
     */
    public static String loud(String text) {
        return text.toUpperCase();
    }

    /**
     * Returns the area of a rectangle with the given width and height.
     */
    public static int surface(int width, int height) {
        return width * height;
    }

    /**
     * Returns value multiplied by 3.
     */
    public static int multiply(int value) {
        return value * 3;
    }
}
