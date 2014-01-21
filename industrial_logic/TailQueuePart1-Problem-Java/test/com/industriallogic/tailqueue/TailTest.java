/// ***************************************************************************
/// Copyright (c) 2009, Industrial Logic, Inc., All Rights Reserved.
///
/// This code is the exclusive property of Industrial Logic, Inc. It may ONLY be
/// used by students during Industrial Logic's workshops or by individuals
/// who are being coached by Industrial Logic on a project.
///
/// This code may NOT be copied or used for any other purpose without the prior
/// written consent of Industrial Logic, Inc.
/// ****************************************************************************

package com.industriallogic.tailqueue;

import java.util.Calendar;

import junit.framework.TestCase;

public class TailTest extends TestCase {

	private Tail firstTail, secondTail, thirdTail, fourthTail, fifthTail, sixthTail, seventhTail, eighthTail, ninthTail;
	
	@Override
	protected void setUp() throws Exception {
		Calendar currentTime = Calendar.getInstance();
		firstTail 	= new Tail(01, Tail.URGENT, currentTime);
		secondTail 	= new Tail(01, Tail.URGENT, currentTime);
		thirdTail 	= new Tail(03, Tail.URGENT, currentTime);
		
		Calendar earlier = Calendar.getInstance();
	    earlier.add(Calendar.SECOND, -10);
	    fourthTail  = new Tail(04, Tail.URGENT, earlier);
	    
	    Calendar later = Calendar.getInstance();
	    later.add(Calendar.SECOND, 10);
	    fifthTail   = new Tail(05, Tail.URGENT, later);
	    
	    sixthTail 	= new Tail(06, Tail.IMPORTANT, currentTime);
	    seventhTail = new Tail(07, Tail.REQUESTING, currentTime);
	    eighthTail 	= new Tail(13, Tail.DISMISSED, currentTime);
	    
	    ninthTail   = new Tail(01, Tail.DISMISSED, currentTime);	    
	}
	
	public void testIfEqual() {
		assertEquals("It should be 0 for equal id's.", 0, firstTail.compareTo(firstTail));
	}
	
	public void testSameIDs() {
		assertEquals("They are same ID's.", 0, firstTail.compareTo(secondTail));
		assertEquals("They are same ID's", 0, secondTail.compareTo(firstTail));
	}
	
	public void testDifferentIDs() {
		assertEquals("first ID is smaller then third ID.", -1, firstTail.compareTo(thirdTail));
		assertEquals("thrid ID is bigger then first ID.", 1, thirdTail.compareTo(firstTail));
	}
	
	public void testDifferentIDsWithEarlierTime() {
		assertEquals("first ID contact time is later then fourth ID.", 1, firstTail.compareTo(fourthTail));
		assertEquals("fourth ID contact time is earlier then first ID.", -1, fourthTail.compareTo(firstTail));
	}

	public void testDifferentIDsWithLaterTime() {
		assertEquals("first ID contact time is earlier then fifth ID.", -1, firstTail.compareTo(fifthTail));
		assertEquals("fifth ID contact time is later then first ID.", 1, fifthTail.compareTo(firstTail));
	}
	
	public void testDifferentIDsWithHigherPriority() {
		assertEquals("priority of first ID is higher.", -1, firstTail.compareTo(sixthTail));
		assertEquals("priority of first ID is higher.", -1, firstTail.compareTo(seventhTail));
		assertEquals("priority of first ID is higher.", -1, firstTail.compareTo(eighthTail));
		assertEquals("priority of sixth ID is higher.", -1, sixthTail.compareTo(seventhTail));
		assertEquals("priority of sixth ID is higher.", -1, sixthTail.compareTo(eighthTail));
		assertEquals("priority of seventh ID is higher.", -1, seventhTail.compareTo(eighthTail));
	}
	
	public void testDifferentIDsWithLowerPriority() {
		assertEquals("priority of eighth ID is lower.", 1, eighthTail.compareTo(firstTail));
		assertEquals("priority of eighth ID is lower.", 1, eighthTail.compareTo(sixthTail));
		assertEquals("priority of eighth ID is lower.", 1, eighthTail.compareTo(seventhTail));
		assertEquals("priority of seventh ID is lower.", 1, seventhTail.compareTo(firstTail));
		assertEquals("priority of seventh ID is lower.", 1, seventhTail.compareTo(sixthTail));
		assertEquals("priority of sixth ID is lower.", 1, sixthTail.compareTo(firstTail));
	}
	
	//public void testSameIDsWithDifferentPriority() {
	//	assertEquals("priority of eighth ID is lower.", -1, ninthTail.compareTo(firstTail));
	//	assertEquals("priority of eighth ID is lower.", 1, firstTail.compareTo(ninthTail));
	//}
	
}
