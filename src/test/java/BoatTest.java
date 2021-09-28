/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;



public class BoatTest {
    Boat b;

    @Before
    public void setUp() throws Exception {
        b = new Boat();
    }


    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(150, b.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        b.upgradeSpeed();
        assertEquals(151, b.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        b.downgradeSpeed();
        assertEquals(149, b.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(10, b.getPrice());
    }

}