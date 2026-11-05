package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Utils603Test {

    @Test
    void surfaceWorks() {
        assertEquals(12, Utils603.surface(3, 4));
        assertEquals(35, Utils603.surface(5, 7));
    }

    @Test
    void cToFWorks() {
        assertEquals(212.0, Utils603.cToF(100.0), 1e-9);
        assertEquals(32.0, Utils603.cToF(0.0), 1e-9);
    }

    @Test
    void meanWorks() {
        assertEquals(5.0, Utils603.mean(4.0, 6.0), 1e-9);
        assertEquals(0.0, Utils603.mean(-1.0, 1.0), 1e-9);
    }
}
