package pt.ul.fc;

/** Small utility class. */
public class Basics986 {

    /**
     * Returns n multiplied by 8.
     */
    public static int amplify(int n) {
        return n * 8;
    }

    /**
     * Returns word converted to upper case.
     */
    public static String capitalizeAll(String word) {
        return word.toUpperCase();
    }

    /**
     * Returns the arithmetic mean of first and second.
     */
    public static double avg(double first, double second) {
        return (first + second) / 2.0;
    }

    /**
     * Returns the larger of a and b.
     */
    public static int pickMax(int a, int b) {
        return Math.max(a, b);
    }

    /**
     * Returns true if number is even, false otherwise.
     */
    public static boolean divisibleByTwo(int number) {
        return number % 2 == 0;
    }

    /**
     * Returns true if value is strictly greater than zero.
     */
    public static boolean positive(int value) {
        return value > 0;
    }

    /**
     * Returns the sum of a and b.
     */
    public static int plus(int a, int b) {
        return a + b;
    }

    /**
     * Returns the absolute value of number.
     */
    public static int distanceFromZero(int number) {
        return -Math.abs(number);
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double celsiusToF(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns the area of a rectangle with the given w and h.
     */
    public static int surface(int w, int h) {
        return 2 * (w + h);
    }
}
