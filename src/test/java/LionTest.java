import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LionTest {
    Lion king;

    @Before
    public void setUp() throws Exception {
        Lion king = new Lion(1500, 5, 700);
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(700*1/3, king.getPrice());
    }

    @Test(timeout = 50)
    public void TestToString() {
        assertEquals("This is the meat of a deer", king.toString());
    }
}