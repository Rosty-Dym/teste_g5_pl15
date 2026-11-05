package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MathKit186Test {

    @Test
    void loudWorks() {
        assertEquals("HELLO", MathKit186.loud("hello"));
        assertEquals("ABC", MathKit186.loud("aBc"));
    }

    @Test
    void positiveWorks() {
        assertTrue(MathKit186.positive(3));
        assertFalse(MathKit186.positive(-3));
        assertFalse(MathKit186.positive(0));
    }

    @Test
    void multiplyWorks() {
        assertEquals(5 * 3, MathKit186.multiply(5));
        assertEquals(0, MathKit186.multiply(0));
    }
}
