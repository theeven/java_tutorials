package com.industriallogic.tailqueue;

import java.util.Calendar;

import junit.framework.TestCase;

public class TailQueueTest extends TestCase {

	public void testEmplyListAdd () {
		Calendar currentTime = Calendar.getInstance();
		TailQueue queue = new TailQueue();
		Tail tail = new Tail(1, Tail.URGENT, currentTime);
		queue.add(tail);
		assertEquals(tail, queue.get());
	}
}
