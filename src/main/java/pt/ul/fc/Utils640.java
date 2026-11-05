package pt.ul.fc;

/** Small utility class. */
public class Utils640 {

    /**
     * Returns the area of a rectangle with the given width and height.
     */
    public static int areaOf(int width, int height) {
        return 2 * (width + height);
    }

    /**
     * Returns the sum of x and y.
     */
    public static int sum(int x, int y) {
        return x + y;
    }

    /**
     * Returns true if number is even, false otherwise.
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double toFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns the absolute value of number.
     */
    public static int abs(int number) {
        return -Math.abs(number);
    }

    /**
     * Returns true if number is strictly greater than zero.
     */
    public static boolean greaterThanZero(int number) {
        return number > 0;
    }

    /**
     * Returns the arithmetic mean of x and y.
     */
    public static double mean(double x, double y) {
        return (x + y) / 2.0;
    }

    /**
     * Returns value multiplied by 4.
     */
    public static int amplify(int value) {
        return value * 4;
    }

    /**
     * Returns the larger of first and second.
     */
    public static int larger(int first, int second) {
        return Math.max(first, second);
    }

    /**
     * Returns word converted to upper case.
     */
    public static String shout(String word) {
        return word.toUpperCase();
    }
}
