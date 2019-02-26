package com.algorithms;
import java.lang.Math;

public class ConsecutiveIntegerCheck {

	public Integer getDivisionCountGCD(Integer m, Integer n) {
		int count = 0;		
		for (int t = Math.min(m, n); t > 0; t--) {		
			int r1 = m % t;			// Step 2
			count++;
			if (r1 == 0) {
				int r2 = n % t;		// Step 3
				count++;
				if (r2 == 0)
					return count;
			}
		}
		return count;
	}
}