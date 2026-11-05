package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MathKit767Test {

    @Test
    void convertTempWorks() {
        assertEquals(212.0, MathKit767.convertTemp(100.0), 1e-9);
        assertEquals(32.0, MathKit767.convertTemp(0.0), 1e-9);
    }

    @Test
    void totalWorks() {
        assertEquals(7, MathKit767.total(3, 4));
        assertEquals(0, MathKit767.total(-2, 2));
    }

    @Test
    void maxOfWorks() {
        assertEquals(9, MathKit767.maxOf(9, 2));
        assertEquals(9, MathKit767.maxOf(2, 9));
    }
}
