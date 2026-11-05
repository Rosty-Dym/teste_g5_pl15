package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Toolbox786Test {

    @Test
    void sumWorks() {
        assertEquals(7, Toolbox786.sum(3, 4));
        assertEquals(0, Toolbox786.sum(-2, 2));
    }

    @Test
    void loudWorks() {
        assertEquals("HELLO", Toolbox786.loud("hello"));
        assertEquals("ABC", Toolbox786.loud("aBc"));
    }

    @Test
    void avgWorks() {
        assertEquals(5.0, Toolbox786.avg(4.0, 6.0), 1e-9);
        assertEquals(0.0, Toolbox786.avg(-1.0, 1.0), 1e-9);
    }
}
