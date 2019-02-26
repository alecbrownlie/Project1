package com.algorithms;
import java.math.BigInteger;

public class Euclids {

	// public int getDivisionCountGCD(int m, int n) {
	// 	if (n == 0) return 0;
	// 	else return getDivisionCountGCD(n, m % n) + 1;
	// }

	// public int computeGCD(int m, int n) {
	// 	if (n == 0) return m;
	// 	else return computeGCD(n, m % n);
	// }

 	public BigInteger computeGCD(BigInteger a, BigInteger b) {
		BigInteger zero = BigInteger.valueOf(0);
	   	if (a.multiply(b).compareTo(zero) == 0)
	       return a.add(b);  
	   	else
	       return computeGCD(b, a.mod(b));  
	}

	public BigInteger getDivisionCountGCD(BigInteger a, BigInteger b) {
		BigInteger zero = BigInteger.valueOf(0);
	   	if (a.multiply(b).compareTo(zero) == 0) return BigInteger.valueOf(0); 
	   	else return getDivisionCountGCD(b, a.mod(b)).add(BigInteger.valueOf(1)); 
	}
}