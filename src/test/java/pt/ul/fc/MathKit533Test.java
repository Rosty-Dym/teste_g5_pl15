package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MathKit533Test {

    @Test
    void magnitudeWorks() {
        assertEquals(5, MathKit533.magnitude(5));
        assertEquals(5, MathKit533.magnitude(-5));
    }

    @Test
    void capitalizeAllWorks() {
        assertEquals("HELLO", MathKit533.capitalizeAll("hello"));
        assertEquals("ABC", MathKit533.capitalizeAll("aBc"));
    }

    @Test
    void celsiusToFWorks() {
        assertEquals(212.0, MathKit533.celsiusToF(100.0), 1e-9);
        assertEquals(32.0, MathKit533.celsiusToF(0.0), 1e-9);
    }
}
