package edu.csbsju.ntc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class NewTelephoneCompanyTest_WBT {
	 private NewTelephoneCompany ntc;
	@Before
	  public void setUp() throws Exception {
	    ntc = new NewTelephoneCompany();
	  }

	 @Test
	  public void testSetHours() {
	    int expResult = 30;
	    ntc.setStartTime(expResult);
	    int result = ntc.getStartTime();
	    assertEquals("Hours is now " + expResult,expResult, result);
	  }
	@Test(expected = UnsupportedOperationException.class)
	public void testInvalidStartTimeNegative5() {
		ntc.setStartTime(-5);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testInvalidStartTimeNegative1() {
		ntc.setStartTime(-1);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	@Test(expected = UnsupportedOperationException.class)
	public void testInvalidStartTime2544() {
		ntc.setStartTime(2544);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	@Test(expected = UnsupportedOperationException.class)
	public void testInvalidStartTime2400() {
		ntc.setStartTime(2400);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	@Test(expected = UnsupportedOperationException.class)
	public void testInvalidStartTime2401() {
		ntc.setStartTime(2401);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	@Test(expected = UnsupportedOperationException.class)
	public void testInvalidStartTime1578() {
		ntc.setStartTime(1578);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	@Test(expected = UnsupportedOperationException.class)
	public void testInvalidStartTime1160() {
		ntc.setStartTime(1160);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testInvalidStartTime1161() {
		ntc.setStartTime(1161);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	@Test(expected = UnsupportedOperationException.class)
	public void testInvalidStartTime799() {
		ntc.setStartTime(799);
		ntc.setDuration(-5);
		ntc.computeCharge();
	}
	@Test(expected = UnsupportedOperationException.class)
	public void testInvalidDuration0() {
		ntc.setStartTime(1800);
		ntc.setDuration(0);
		ntc.computeCharge();
	}
	@Test(expected = UnsupportedOperationException.class)
	public void testInvalidDuration1() {
		ntc.setStartTime(1801);
		ntc.setDuration(0);
		ntc.computeCharge();
	}
	@Test
	public void testdiscountedTimeAndDuration() {
		ntc.setStartTime(500);
		ntc.setDuration(100);
		double charge = ntc.computeCharge();
		assertTrue(charge == 1768.0);
	}
	@Test
	public void testdiscountedTimeAndDurationBoundary() {
		ntc.setStartTime(759);
		ntc.setDuration(61);
		double charge = ntc.computeCharge();
		assertTrue(charge == 1078.48);
	}
	@Test
	public void testdiscountedTimeAndDurationBoundary1() {
		ntc.setStartTime(1959);
		ntc.setDuration(61);
		double charge = ntc.computeCharge();
		assertTrue(charge == 1078.48);
	}
	@Test
	public void testdiscountedTimeAndDurationBoundary2() {
		ntc.setStartTime(2359);
		ntc.setDuration(65);
		double charge = ntc.computeCharge();
		assertTrue(charge == 1149.20);
	}
	@Test
	public void testDiscountStartTime0() {
		ntc.setStartTime(0);
		ntc.setDuration(60);
		double charge = ntc.computeCharge();
		assertTrue(charge == 1248.00);
	}
	@Test
	public void testDiscountStartTime400() {
		ntc.setStartTime(400);
		ntc.setDuration(59);
		double charge = ntc.computeCharge();
		assertTrue(charge == 1227.20);
	}
	@Test
	public void testDiscountStartTime759() {
		ntc.setStartTime(759);
		ntc.setDuration(1);
		double charge = ntc.computeCharge();
		assertTrue(charge == 20.80);
	}
	@Test
	public void testDiscountStartTime1800() {
		ntc.setStartTime(1800);
		ntc.setDuration(10);
		double charge = ntc.computeCharge();
		assertTrue(charge == 208.00);
	}
	@Test
	public void testDiscountStartTime1801() {
		ntc.setStartTime(1801);
		ntc.setDuration(10);
		double charge = ntc.computeCharge();
		assertTrue(charge == 208.00);
	}
	@Test
	public void testDiscountStartTime2359() {
		ntc.setStartTime(2359);
		ntc.setDuration(10);
		double charge = ntc.computeCharge();
		assertTrue(charge == 208.00);
	}
	@Test
	public void testDiscountduration65() {
		ntc.setStartTime(800);
		ntc.setDuration(65);
		double charge = ntc.computeCharge();
		assertTrue(charge == 2298.40);
	}
	@Test
	public void testDiscountduration61() {
		ntc.setStartTime(900);
		ntc.setDuration(61);
		double charge = ntc.computeCharge();
		assertTrue(charge == 2156.96);
	}
	@Test
	public void testnoDiscounts1000() {
		ntc.setStartTime(1000);
		ntc.setDuration(40);
		double charge = ntc.computeCharge();
		assertTrue(charge == 1664.00);
	}
	@Test
	public void testnoDiscounts800() {
		ntc.setStartTime(800);
		ntc.setDuration(1);
		double charge = ntc.computeCharge();
		assertTrue(charge == 41.60);
	}
	@Test
	public void testnoDiscounts801() {
		ntc.setStartTime(801);
		ntc.setDuration(59);
		double charge = ntc.computeCharge();
		assertTrue(charge == 2454.40);
	}
	@Test
	public void testnoDiscounts1759() {
		ntc.setStartTime(1759);
		ntc.setDuration(60);
		double charge = ntc.computeCharge();
		assertTrue(charge == 2496.00);
	}




}
