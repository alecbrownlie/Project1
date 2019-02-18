package com.algorithms;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class SieveOfEratosthenes {

	public Integer computeGCD(Integer m, Integer n) {
		Integer result = 1;
		List<Integer> primeFactors = getPrimeFactors(m);
		primeFactors.retainAll(getPrimeFactors(n));
		for (Integer i : primeFactors) {
			result *= i;
		}
		return result;
	}

	private List<Integer> getPrimeFactors(Integer number){
		int copy = number;
		List<Integer> factors = new ArrayList<Integer>();
		for (int i = 2; i <= copy; i++) {
			if (copy % i == 0 && getPrimeNumbers(number).contains(i)) {
				factors.add(i);
				copy /= i;
				i--;
			}
		}
		return factors;
	}

	// from Section (1.1)
	private List<Integer> getPrimeNumbers(Integer n) {
		List<Integer> L = new ArrayList<Integer>();
		boolean A[] = new boolean[n]; 

        for (int p = 2; p < n; p++) {
        	A[p] = true;
      	}

      	for (int p = 2; p < Math.sqrt(n); p++) {
        	if (A[p] == true) {
            	for(int j = (p * p); j < n; j = j + p) {
               		A[j] = false;
            	}
        	}
      	}

      	for (int p = 2; p < n; p++) {
      		if (A[p] == true) {
      			L.add(p);
      		}
      	}
      	return L;
	}
}