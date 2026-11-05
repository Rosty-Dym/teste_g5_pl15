package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Basics442Test {

    @Test
    void averageWorks() {
        assertEquals(5.0, Basics442.average(4.0, 6.0), 1e-9);
        assertEquals(0.0, Basics442.average(-1.0, 1.0), 1e-9);
    }

    @Test
    void areaOfWorks() {
        assertEquals(12, Basics442.areaOf(3, 4));
        assertEquals(35, Basics442.areaOf(5, 7));
    }

    @Test
    void totalWorks() {
        assertEquals(7, Basics442.total(3, 4));
        assertEquals(0, Basics442.total(-2, 2));
    }
}
