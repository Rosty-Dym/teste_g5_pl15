package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Basics503Test {

    @Test
    void multiplyWorks() {
        assertEquals(5 * 8, Basics503.multiply(5));
        assertEquals(0, Basics503.multiply(0));
    }

    @Test
    void pickMaxWorks() {
        assertEquals(9, Basics503.pickMax(9, 2));
        assertEquals(9, Basics503.pickMax(2, 9));
    }

    @Test
    void midpointWorks() {
        assertEquals(5.0, Basics503.midpoint(4.0, 6.0), 1e-9);
        assertEquals(0.0, Basics503.midpoint(-1.0, 1.0), 1e-9);
    }
}
