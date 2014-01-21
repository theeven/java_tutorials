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

package com.industriallogic.bonus;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class BonusCalculatorTest{
	
	private double individualBonus1, individualBonus2, teamBonus1, teamBonus2;
	private int sales1, sales2, quota;
	private double commision = 10d;
	private double tax = 10d;

	@Before
	public void init() {
		sales1 = 900;
		sales2 = 1100;
		quota = 1000;
		individualBonus1	= (sales1 - quota) * commision / 100.0 * (1.0 - (tax / 100.0));
		individualBonus2	= (sales2 - quota) * commision / 100.0 * (1.0 - (tax / 100.0));
		teamBonus1 	= ((sales1 - quota) * commision / 100.0) / 4;
		teamBonus2	= ((sales2 - quota) * commision / 100.0) / 4;

	}

	//@Test
	public void testIndividualQuotaNotExceeded() {
		Assert.assertEquals("Sales Exceeded Individual Quota.", individualBonus1, BonusCalculator.individualBonus(sales1, quota, commision, tax));
	}
	
	@Test
	public void testIndividualQuotaExceeded() {
		Assert.assertEquals("Sales Exceeded Individual Quota.", individualBonus2, BonusCalculator.individualBonus(sales2, quota, commision, tax));
	}
	
	//@Test
	public void testTeamQuotaNotExceeded() {
		Assert.assertEquals("Sales Exceeded Individual Quota.", teamBonus1, BonusCalculator.teamBonus(sales1, quota, commision, 4));
	}
	
	@Test
	public void testTeamQuotaExceeded() {
		Assert.assertEquals("Sales Exceeded Individual Quota.", teamBonus2, BonusCalculator.teamBonus(sales2, quota, commision, 4));
	}
	
}
	
