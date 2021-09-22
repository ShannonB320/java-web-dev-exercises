package exercises.ch03collections.technology.test;

import exercises.ch03collections.technology.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProgramTest {
    Computer testComp;
    Laptop testLaptop;
    Laptop secondLaptop;
    SmartPhone testPhone;


    @Before
    public void setUpTests() {
        testComp = new Computer(10, 500, true);
        testLaptop = new Laptop(20, 100, true, true, 6.0);
        secondLaptop = new Laptop(30, 200, true, true, 3.0);
        testPhone = new SmartPhone(50, 200, false, true, true, 45);
    }

    @Test
    public void computerConstructorSetsProperties() {
        assertEquals(10, testComp.getStorage());
        assertEquals(500, testComp.getRam());
        assertTrue(testComp.getHasKeyboard());
    }

    @Test
    public void laptopConstructorSetsProperties() {
        assertEquals(20, testLaptop.getStorage());
        assertEquals(100, testLaptop.getRam());
        assertTrue(testLaptop.getHasKeyboard());
        assertTrue(testLaptop.getHasWifi());
        assertEquals(6.0, testLaptop.getWeight(), .01);
    }

    @Test
    public void isClunkyReturnsTrue() {
        assertTrue(testLaptop.isClunky());
    }

    @Test
    public void isClunkyReturnsFalse() {
        assertFalse(secondLaptop.isClunky());
    }


    @Test
    public void smartPhoneConstructorSetsProperties() {
        assertEquals(50, testPhone.getStorage());
        assertEquals(200, testPhone.getRam());
        assertFalse(testPhone.getHasKeyboard());
        assertTrue(testPhone.getHasWifi());
        assertTrue(testPhone.getCanMakeCalls());
        assertEquals(45, testPhone.getNumberOfSelfies());
    }

    @Test
    public void takeSelfieAddsToSelfieCount() {
        testPhone.takeSelfie();
        assertEquals(46, testPhone.getNumberOfSelfies());
    }

    @Test
    public void increaseRAMAddsRAM() {
        testLaptop.increaseRAM(20);
        assertEquals(120, testLaptop.getRam());
    }

    @Test
    public void increaseStorageAddsStorage() {
        testLaptop.increaseStorage(10);
        assertEquals(30, testLaptop.getStorage());
    }



}
