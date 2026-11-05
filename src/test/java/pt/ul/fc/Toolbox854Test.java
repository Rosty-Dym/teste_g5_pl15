package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Toolbox854Test {

    @Test
    void amplifyWorks() {
        assertEquals(5 * 6, Toolbox854.amplify(5));
        assertEquals(0, Toolbox854.amplify(0));
    }

    @Test
    void areaOfWorks() {
        assertEquals(12, Toolbox854.areaOf(3, 4));
        assertEquals(35, Toolbox854.areaOf(5, 7));
    }

    @Test
    void addWorks() {
        assertEquals(7, Toolbox854.add(3, 4));
        assertEquals(0, Toolbox854.add(-2, 2));
    }
}
