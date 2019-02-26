package com.algorithms;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class SieveOfEratosthenes {

	// used in UserTestMode
	public Integer computeGCD(Integer m, Integer n) {
		Integer result = 1;
		List<Integer> primeFactors = getPrimeFactors(m);
		primeFactors.retainAll(getPrimeFactors(n));
		for (Integer i : primeFactors) {
			result *= i;
		}
		return result;
	}

	public List<Integer> getPrimeFactors(Integer number){
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
	public List<Integer> getPrimeNumbers(Integer n) {
		List<Integer> L = new ArrayList<Integer>();
		boolean[] isPrime = new boolean[n+1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int factor = 2; factor*factor <= n; factor++) {
            if (isPrime[factor]) {
                for (int j = factor; factor*j <= n; j++) {
                    isPrime[factor*j] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) L.add(i);
        }
        return L; 
	}
}