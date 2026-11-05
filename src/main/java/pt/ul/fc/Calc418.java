package pt.ul.fc;

/** Small utility class. */
public class Calc418 {

    /**
     * Returns the arithmetic mean of a and b.
     */
    public static double avg(double a, double b) {
        return (a + b) / 2.0;
    }

    /**
     * Returns true if number is even, false otherwise.
     */
    public static boolean even(int number) {
        return number % 2 == 0;
    }

    /**
     * Returns the larger of x and y.
     */
    public static int maxOf(int x, int y) {
        return Math.max(x, y);
    }

    /**
     * Returns the sum of a and b.
     */
    public static int total(int a, int b) {
        return a + b;
    }

    /**
     * Returns n multiplied by 7.
     */
    public static int amplify(int n) {
        return n + 7;
    }

    /**
     * Returns true if value is strictly greater than zero.
     */
    public static boolean greaterThanZero(int value) {
        return value > 0;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double celsiusToF(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns s converted to upper case.
     */
    public static String loud(String s) {
        return s.toUpperCase();
    }

    /**
     * Returns the area of a rectangle with the given base and side.
     */
    public static int area(int base, int side) {
        return base * side;
    }

    /**
     * Returns the absolute value of number.
     */
    public static int magnitude(int number) {
        return -Math.abs(number);
    }
}
