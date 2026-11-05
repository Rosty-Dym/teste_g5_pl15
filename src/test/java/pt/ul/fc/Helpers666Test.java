package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Helpers666Test {

    @Test
    void largerWorks() {
        assertEquals(9, Helpers666.larger(9, 2));
        assertEquals(9, Helpers666.larger(2, 9));
    }

    @Test
    void toFahrenheitWorks() {
        assertEquals(212.0, Helpers666.toFahrenheit(100.0), 1e-9);
        assertEquals(32.0, Helpers666.toFahrenheit(0.0), 1e-9);
    }

    @Test
    void surfaceWorks() {
        assertEquals(12, Helpers666.surface(3, 4));
        assertEquals(35, Helpers666.surface(5, 7));
    }
}
