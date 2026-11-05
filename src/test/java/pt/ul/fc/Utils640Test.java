package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Utils640Test {

    @Test
    void amplifyWorks() {
        assertEquals(5 * 4, Utils640.amplify(5));
        assertEquals(0, Utils640.amplify(0));
    }

    @Test
    void greaterThanZeroWorks() {
        assertTrue(Utils640.greaterThanZero(3));
        assertFalse(Utils640.greaterThanZero(-3));
        assertFalse(Utils640.greaterThanZero(0));
    }

    @Test
    void sumWorks() {
        assertEquals(7, Utils640.sum(3, 4));
        assertEquals(0, Utils640.sum(-2, 2));
    }
}
