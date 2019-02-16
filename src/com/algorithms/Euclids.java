package com.algorithms;

public class Euclids {

	public static Integer getDivisionCountGCD(Integer m, Integer n) {
		if (n == 0) return 0;
		else return getDivisionCountGCD(n, m % n) + 1;
	}
}