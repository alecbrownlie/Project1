package com.modes;

import java.util.Scanner;
import java.util.List;
import java.math.BigInteger;


import com.modes.AbstractMode;

public class UserTestMode extends AbstractMode {

	protected void runTask1() {
		System.out.println("----- Running " + TASK_1 + " -----");
		Integer n = getUserInput("n");
		printAvgModDivisions(n);
		printAvgDivisions(n);
		printAvgTimeModDivisions(n);
	}

	protected void runTask2() {
		System.out.println("----- Running " + TASK_2 + " -----");
		Integer k = getUserInput("k");
		BigInteger m = fibonacci.getNthElement(k + 1);
		BigInteger n = fibonacci.getNthElement(k);
		BigInteger gcd = euclids.computeGCD(m, n);
		System.out.println("m = Fib(k + 1) = " + m);
		System.out.println("n = Fib(k) = " + n);
		System.out.println("GCD(m, n) = " + gcd);
		printAvgTimeFibModDivisions(k);
	}

	protected void runTask3() {
		System.out.println("----- Running " + TASK_3 + " -----");
		Integer m = getUserInput("m");
		Integer n = getUserInput("n");

		List<Integer> mPrimeNumbers = eratosthenes.getPrimeNumbers(m);
		List<Integer> nPrimeNumbers = eratosthenes.getPrimeNumbers(n);
		System.out.println("Prime Numbers \u2264 k = m = " + mPrimeNumbers);
		System.out.println("Prime Numbers \u2264 k = n = " + nPrimeNumbers);

		List<Integer> mPrimeFactors = eratosthenes.getPrimeFactors(m);
		List<Integer> nPrimeFactors = eratosthenes.getPrimeFactors(n);
		System.out.println("Prime Factors of m = " + mPrimeFactors);
		System.out.println("Prime Factors of n = " + nPrimeFactors);
		Integer gcd = eratosthenes.computeGCD(m, n);
		System.out.println("GCD(m, n) = " + gcd);	
	}

	private void printAvgModDivisions(int n) {
		double total = 0.0;
		for (BigInteger i = BigInteger.valueOf(1); i.compareTo(BigInteger.valueOf(n + 1)) < 0; i = i.add(BigInteger.ONE)) {
			BigInteger divisions = euclids.getDivisionCountGCD(BigInteger.valueOf(n), i);
			total += divisions.intValue();
		}
		System.out.println("Number of " + MD_AVG_N + " = " + total / n);
	}

	private void printAvgDivisions(int n) {
		double total = 0.0;
		for (int i = 1; i < (n + 1); i++) {
			double divisions = cic.getDivisionCountGCD(n, i);
			total += divisions;
		}
		System.out.println("Number of " + D_AVG_N  + " = " + total / n);
	}

	private void printAvgTimeModDivisions(int n) {
		double totalTime = 0.0;
		for (BigInteger i = BigInteger.valueOf(1); i.compareTo(BigInteger.valueOf(n + 1)) < 0; i = i.add(BigInteger.ONE)) {
			long start = System.nanoTime();
			BigInteger divisions = euclids.getDivisionCountGCD(BigInteger.valueOf(n), i);
			totalTime += (System.nanoTime() - start);
		}
		System.out.println("Average time of modulo divisions in nanoseconds = " + totalTime / n);
	}

	private void printAvgTimeFibModDivisions(Integer k) {
		double totalTime = 0.0;
		for (int i = k; i > 0; i--) {
			BigInteger currentFib = fibonacci.getNthElement(i);
			BigInteger nextFib = fibonacci.getNthElement(i + 1);
			long start = System.nanoTime();
			BigInteger divisions = euclids.computeGCD(nextFib, currentFib);
			totalTime += (System.nanoTime() - start);
		}
		System.out.println("Average time of modulo divisions in nanoseconds = " + totalTime / k);
	}

	private Integer getUserInput(String var) {
		Scanner scanner = new Scanner(System.in);
		boolean toProcess = true;
		int result = 0;
		try {
			while (true) {
				System.out.println("Please enter a single positive value for " + var + ": ");
				result = Integer.parseInt(scanner.nextLine());
				if (result > 0) return result;
			}
		} catch (java.util.InputMismatchException e) {
			System.out.println("Not a number. ");
		}
		return result;
	}
}