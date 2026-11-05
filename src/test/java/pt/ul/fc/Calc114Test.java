package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Calc114Test {

    @Test
    void surfaceWorks() {
        assertEquals(12, Calc114.surface(3, 4));
        assertEquals(35, Calc114.surface(5, 7));
    }

    @Test
    void averageWorks() {
        assertEquals(5.0, Calc114.average(4.0, 6.0), 1e-9);
        assertEquals(0.0, Calc114.average(-1.0, 1.0), 1e-9);
    }

    @Test
    void toUpperWorks() {
        assertEquals("HELLO", Calc114.toUpper("hello"));
        assertEquals("ABC", Calc114.toUpper("aBc"));
    }
}
