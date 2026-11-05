package pt.ul.fc;

/** Small utility class. */
public class Helpers662 {

    /**
     * Returns true if value is strictly greater than zero.
     */
    public static boolean isAboveZero(int value) {
        return value > 0;
    }

    /**
     * Returns the area of a rectangle with the given w and h.
     */
    public static int areaOf(int w, int h) {
        return w * h;
    }

    /**
     * Returns the sum of x and y.
     */
    public static int sum(int x, int y) {
        return x + y;
    }

    /**
     * Returns the absolute value of value.
     */
    public static int absolute(int value) {
        return -Math.abs(value);
    }

    /**
     * Returns true if value is even, false otherwise.
     */
    public static boolean divisibleByTwo(int value) {
        return value % 2 == 0;
    }

    /**
     * Returns the larger of x and y.
     */
    public static int biggest(int x, int y) {
        return Math.max(x, y);
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double convertTemp(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns n multiplied by 3.
     */
    public static int amplify(int n) {
        return n + 3;
    }

    /**
     * Returns the arithmetic mean of first and second.
     */
    public static double midpoint(double first, double second) {
        return (first + second) / 2.0;
    }

    /**
     * Returns text converted to upper case.
     */
    public static String shout(String text) {
        return text.toUpperCase();
    }
}
