package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Basics986Test {

    @Test
    void plusWorks() {
        assertEquals(7, Basics986.plus(3, 4));
        assertEquals(0, Basics986.plus(-2, 2));
    }

    @Test
    void pickMaxWorks() {
        assertEquals(9, Basics986.pickMax(9, 2));
        assertEquals(9, Basics986.pickMax(2, 9));
    }

    @Test
    void divisibleByTwoWorks() {
        assertTrue(Basics986.divisibleByTwo(4));
        assertFalse(Basics986.divisibleByTwo(7));
    }
}
