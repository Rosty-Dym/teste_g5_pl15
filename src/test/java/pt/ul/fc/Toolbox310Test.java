package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Toolbox310Test {

    @Test
    void shoutWorks() {
        assertEquals("HELLO", Toolbox310.shout("hello"));
        assertEquals("ABC", Toolbox310.shout("aBc"));
    }

    @Test
    void meanWorks() {
        assertEquals(5.0, Toolbox310.mean(4.0, 6.0), 1e-9);
        assertEquals(0.0, Toolbox310.mean(-1.0, 1.0), 1e-9);
    }

    @Test
    void positiveWorks() {
        assertTrue(Toolbox310.positive(3));
        assertFalse(Toolbox310.positive(-3));
        assertFalse(Toolbox310.positive(0));
    }
}
