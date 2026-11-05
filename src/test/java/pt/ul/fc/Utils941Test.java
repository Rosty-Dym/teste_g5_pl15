package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Utils941Test {

    @Test
    void avgWorks() {
        assertEquals(5.0, Utils941.avg(4.0, 6.0), 1e-9);
        assertEquals(0.0, Utils941.avg(-1.0, 1.0), 1e-9);
    }

    @Test
    void isAboveZeroWorks() {
        assertTrue(Utils941.isAboveZero(3));
        assertFalse(Utils941.isAboveZero(-3));
        assertFalse(Utils941.isAboveZero(0));
    }

    @Test
    void rectAreaWorks() {
        assertEquals(12, Utils941.rectArea(3, 4));
        assertEquals(35, Utils941.rectArea(5, 7));
    }
}
