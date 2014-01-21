/// ***************************************************************************
/// Copyright (c) 2008, Industrial Logic, Inc., All Rights Reserved.
///
/// This code is the exclusive property of Industrial Logic, Inc. It may ONLY be
/// used by students during Industrial Logic's workshops or by individuals
/// who are being coached by Industrial Logic on a project.
///
/// This code may NOT be copied or used for any other purpose without the prior
/// written consent of Industrial Logic, Inc.
/// ****************************************************************************

package com.wildwestwireless;

public class PhoneBill {

	private static double BasicMonthlyRateGold 		= 49.95;
	private static double BasicMonthlyRateSilver 	= 29.95;
	private static double addtionalRateGold 		= 14.50;
	private static double additionalRateSilver 		= 21.50;
	private static double FamilyDiscountRate 		= 5.00;
	private static double excessMinsRateGold 		= 0.45;
	private static double excessMinsRateSilver 		= 0.54;
	private static double includedMinsGold 			= 1000;
	private static double includedMinsSilver 		= 500;

	public static Double simplePhoneBill(String Plan, int numberOfAdditionalLines, int minsUsed) {
		return rateCalculation(Plan, numberOfAdditionalLines, minsUsed);
	}

	private static Double rateCalculation(String Plan, int numberOfAdditionalLines, int minsUsed) {
		double excessMins = 0;
		if (Plan == "Gold") {
			if (minsUsed > includedMinsGold) {
				excessMins = minsUsed - includedMinsGold;
			}
			return BasicMonthlyRateGold + (addtionalRateGold * numberOfAdditionalLines) + (excessMins * excessMinsRateGold);
		}
		else if (Plan == "Silver") {
			if (minsUsed > includedMinsSilver) {
				excessMins = minsUsed - includedMinsSilver;
			}
			return BasicMonthlyRateSilver + (additionalRateSilver * numberOfAdditionalLines) + (excessMins * excessMinsRateSilver);
		}
		else { 
			return null;
		}
	}
}
