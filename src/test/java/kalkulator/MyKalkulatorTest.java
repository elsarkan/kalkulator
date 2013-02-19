package kalkulator;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import kalkulator.MyKalkulator;

public class MyKalkulatorTest {

	  @BeforeClass
	  public static void testSetup() {
	  }

	  @AfterClass
	  public static void testCleanup() {
	  }

	  @Test(expected = IllegalArgumentException.class)
	  public void testExceptionIsThrown1() {
	    MyKalkulator kalk = new MyKalkulator();
	    kalk.mnozenie(1, 120);
	  }

	  @Test(expected = IllegalArgumentException.class)
	  public void testExceptionIsThrown2() {
	    MyKalkulator kalk = new MyKalkulator();
	    kalk.mnozenie(120, 1);
	  }

	  @Test
	  public void testMnozenie() {
	    MyKalkulator kalk = new MyKalkulator();
	    assertEquals("Result", 500, kalk.mnozenie(10, 50));
	  }

}
