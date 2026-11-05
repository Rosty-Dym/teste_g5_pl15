package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Calc418Test {

    @Test
    void areaWorks() {
        assertEquals(12, Calc418.area(3, 4));
        assertEquals(35, Calc418.area(5, 7));
    }

    @Test
    void maxOfWorks() {
        assertEquals(9, Calc418.maxOf(9, 2));
        assertEquals(9, Calc418.maxOf(2, 9));
    }

    @Test
    void celsiusToFWorks() {
        assertEquals(212.0, Calc418.celsiusToF(100.0), 1e-9);
        assertEquals(32.0, Calc418.celsiusToF(0.0), 1e-9);
    }
}
