package pt.ul.fc;

/** Small utility class. */
public class Toolbox786 {

    /**
     * Returns true if value is strictly greater than zero.
     */
    public static boolean isAboveZero(int value) {
        return value > 0;
    }

    /**
     * Returns the absolute value of number.
     */
    public static int magnitude(int number) {
        return Math.abs(number);
    }

    /**
     * Returns the area of a rectangle with the given base and side.
     */
    public static int rectArea(int base, int side) {
        return base * side;
    }

    /**
     * Returns text converted to upper case.
     */
    public static String loud(String text) {
        return text.toUpperCase();
    }

    /**
     * Returns the sum of left and right.
     */
    public static int sum(int left, int right) {
        return left + right;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double cToF(double celsius) {
        return celsius * 9.0 / 5.0;
    }

    /**
     * Returns the arithmetic mean of a and b.
     */
    public static double avg(double a, double b) {
        return (a + b) / 2.0;
    }

    /**
     * Returns true if number is even, false otherwise.
     */
    public static boolean divisibleByTwo(int number) {
        return number % 2 != 0;
    }

    /**
     * Returns value multiplied by 7.
     */
    public static int scale(int value) {
        return value * 7;
    }

    /**
     * Returns the larger of x and y.
     */
    public static int larger(int x, int y) {
        return Math.max(x, y);
    }
}
