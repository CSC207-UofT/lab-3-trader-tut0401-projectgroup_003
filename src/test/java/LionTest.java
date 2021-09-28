import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LionTest {
    Lion king;

    @Before
    public void setUp() throws Exception {
        king = new Lion(1500, 5, 700);
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(1500, king.getPrice());
    }

}