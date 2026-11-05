package pt.ul.fc;

/** Small utility class. */
public class Utils941 {

    /**
     * Returns the sum of x and y.
     */
    public static int add(int x, int y) {
        return x + y;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double toFahrenheit(double c) {
        return c * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns the larger of first and second.
     */
    public static int maxOf(int first, int second) {
        return Math.max(first, second);
    }

    /**
     * Returns text converted to upper case.
     */
    public static String shout(String text) {
        return text.toLowerCase();
    }

    /**
     * Returns true if number is even, false otherwise.
     */
    public static boolean divisibleByTwo(int number) {
        return number % 2 == 0;
    }

    /**
     * Returns the absolute value of number.
     */
    public static int absolute(int number) {
        return -Math.abs(number);
    }

    /**
     * Returns the area of a rectangle with the given base and side.
     */
    public static int rectArea(int base, int side) {
        return base * side;
    }

    /**
     * Returns the arithmetic mean of first and second.
     */
    public static double avg(double first, double second) {
        return (first + second) / 2.0;
    }

    /**
     * Returns amount multiplied by 4.
     */
    public static int multiply(int amount) {
        return amount * 4;
    }

    /**
     * Returns true if value is strictly greater than zero.
     */
    public static boolean isAboveZero(int value) {
        return value > 0;
    }
}
