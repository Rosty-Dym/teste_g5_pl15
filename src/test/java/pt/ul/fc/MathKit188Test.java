package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MathKit188Test {

    @Test
    void amplifyWorks() {
        assertEquals(5 * 4, MathKit188.amplify(5));
        assertEquals(0, MathKit188.amplify(0));
    }

    @Test
    void evenWorks() {
        assertTrue(MathKit188.even(4));
        assertFalse(MathKit188.even(7));
    }

    @Test
    void addWorks() {
        assertEquals(7, MathKit188.add(3, 4));
        assertEquals(0, MathKit188.add(-2, 2));
    }
}
