package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Helpers662Test {

    @Test
    void isAboveZeroWorks() {
        assertTrue(Helpers662.isAboveZero(3));
        assertFalse(Helpers662.isAboveZero(-3));
        assertFalse(Helpers662.isAboveZero(0));
    }

    @Test
    void sumWorks() {
        assertEquals(7, Helpers662.sum(3, 4));
        assertEquals(0, Helpers662.sum(-2, 2));
    }

    @Test
    void midpointWorks() {
        assertEquals(5.0, Helpers662.midpoint(4.0, 6.0), 1e-9);
        assertEquals(0.0, Helpers662.midpoint(-1.0, 1.0), 1e-9);
    }
}
