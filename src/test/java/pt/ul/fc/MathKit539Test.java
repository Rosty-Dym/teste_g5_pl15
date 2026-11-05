package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MathKit539Test {

    @Test
    void magnitudeWorks() {
        assertEquals(5, MathKit539.magnitude(5));
        assertEquals(5, MathKit539.magnitude(-5));
    }

    @Test
    void divisibleByTwoWorks() {
        assertTrue(MathKit539.divisibleByTwo(4));
        assertFalse(MathKit539.divisibleByTwo(7));
    }

    @Test
    void cToFWorks() {
        assertEquals(212.0, MathKit539.cToF(100.0), 1e-9);
        assertEquals(32.0, MathKit539.cToF(0.0), 1e-9);
    }
}
