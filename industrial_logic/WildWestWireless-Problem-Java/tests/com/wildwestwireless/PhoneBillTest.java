package com.wildwestwireless;

import junit.framework.TestCase;

public class PhoneBillTest extends TestCase {
	
	public void testBasicMonthlyRateGold() {
		assertEquals("Basic Monthly Rate for Gold Plan", 49.95d, PhoneBill.simplePhoneBill("Gold", 0, 0), 0.001d);
	}
	
	public void testBasicMonthlyRateSilver() {
		assertEquals("Basic Monthly Rate for Silver Plan", 29.95d, PhoneBill.simplePhoneBill("Silver", 0, 0), 0.001d);
	}

	public void testDoubleMonthlyRateGold() {
		assertEquals("Monthly Rate for Gold Plan for 1 Addtional Line", 64.45d, PhoneBill.simplePhoneBill("Gold", 1, 0), 0.001d);
	}
	
	public void testTripleMonthlyRateSilver() {
		assertEquals("Monthly Rate for Silver Plan for 2 Additonal Lines", 72.95d, PhoneBill.simplePhoneBill("Silver", 2, 0), 0.001d);
	}
	
	public void testDoubleMonthlyRateGoldWithAccessMinsUnused() {
		assertEquals("Monthly Rate for Gold with Access Mins Unused", 49.95d, PhoneBill.simplePhoneBill("Gold", 0, 999), 0.001d);
	}
	
	public void testDoubleMonthlyRateGoldWithAccessMinsUsed() {
		assertEquals("Monthly Rate for Gold with Access Mins Used", 50.40d, PhoneBill.simplePhoneBill("Gold", 0, 1001), 0.001d);
	}
	
	public void testDoubleMonthlyRateSilverWithAccessMinsUnused() {
		assertEquals("Monthly Rate for Silver with Access Mins Unused", 29.95d, PhoneBill.simplePhoneBill("Silver", 0, 499), 0.001d);
	}
	
	public void testDoubleMonthlyRateSilverWithAccessMinsUsed() {
		assertEquals("Monthly Rate for Silver with Access Mins Used", 40.75d, PhoneBill.simplePhoneBill("Silver", 0, 520), 0.001d);
	}
	
	//public void testFourMonthlyRateSilverWithFamilyDiscount() {
	//	assertEquals("Monthly Rate for Gold Plan for 3 Addtional Line Eligible for Family Discount", 83.95d, PhoneBill.simplePhoneBill("Silver", 3, 499), 0.001d);
	//}
	
}
