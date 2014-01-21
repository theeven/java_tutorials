package com.industriallogic.bonus;

public class BonusCalculator {

	public static double individualBonus(int sales, int quota, double commission, double tax) {
		double bonus = 0;
		if (getBonus(sales, quota)) 
			return bonus  = (sales - quota) * commission / 100.0 * (1.0 - (tax / 100.0));		
		else 
			return bonus;
	}

	public static double teamBonus(int sales, int quota, double commission, int numberOfTeamMembers) {
		double bonus = 0;
		if (getBonus(sales, quota)) 
			return bonus  = ((sales - quota) * commission / 100.0) / numberOfTeamMembers;		
		else 
			return bonus;
	}
	
	private static boolean getBonus(int sales, int quota) {
		if (sales > quota )
			return true;
		else 
			return false;
	}

}
