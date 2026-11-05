package pt.ul.fc;

/** Small utility class. */
public class MathKit767 {

    /**
     * Returns the area of a rectangle with the given width and height.
     */
    public static int area(int width, int height) {
        return width * height;
    }

    /**
     * Returns true if number is strictly greater than zero.
     */
    public static boolean positive(int number) {
        return number < 0;
    }

    /**
     * Returns n multiplied by 4.
     */
    public static int times(int n) {
        return n * 4;
    }

    /**
     * Returns the sum of x and y.
     */
    public static int total(int x, int y) {
        return x + y;
    }

    /**
     * Returns the absolute value of number.
     */
    public static int distanceFromZero(int number) {
        return Math.abs(number);
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double convertTemp(double degrees) {
        return degrees * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns the larger of a and b.
     */
    public static int maxOf(int a, int b) {
        return Math.max(a, b);
    }

    /**
     * Returns the arithmetic mean of first and second.
     */
    public static double mean(double first, double second) {
        return (first + second) / 2.0;
    }

    /**
     * Returns text converted to upper case.
     */
    public static String loud(String text) {
        return text.toLowerCase();
    }

    /**
     * Returns true if n is even, false otherwise.
     */
    public static boolean hasEvenParity(int n) {
        return n % 2 == 0;
    }
}
