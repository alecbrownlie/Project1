package com.algorithms;

import java.lang.Math;
import java.math.BigInteger;


public class ConsecutiveIntegerCheck {

	public BigInteger getDivisionCountGCD(BigInteger m, BigInteger n) {
		BigInteger count = BigInteger.ZERO;		
		for (BigInteger t = m.min(n); t.compareTo(BigInteger.ZERO) > 0; t = t.subtract(BigInteger.ONE)) {		
			BigInteger r1 = m.mod(t);			
			count = count.add(BigInteger.ONE);
			if (r1.compareTo(BigInteger.ZERO) == 0) {
				BigInteger r2 = n.mod(t);
				count = count.add(BigInteger.ONE);
				if (r2.compareTo(BigInteger.ZERO) == 0)
					return count;
			}
		}
		return count;
	}
}