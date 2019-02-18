package com.modes;
import java.util.Scanner;
import java.util.List;

import com.modes.AbstractMode;

public class UserTestMode extends AbstractMode {

	protected void runTask1() {
		System.out.println("----- Running " + TASK_1 + " -----");
		Integer n = getUserInput("n");
		printAvgModDivisions(n);
		printAvgDivisions(n);
	}

	protected void runTask3() {
		System.out.println("----- Running " + TASK_3 + " -----");
		Integer m = getUserInput("m");
		Integer n = getUserInput("n");
		Integer gcd = eratosthenes.computeGCD(m, n);
		System.out.println("GCD(m, n): " + gcd);	
	}

	private void printAvgModDivisions(int n) {
		double total = 0.0;
		for (int i = 1; i < (n + 1); i++) {
			double divisions = euclids.getDivisionCountGCD(n, i);
			total += divisions;
		}
		System.out.println("Number of " + MD_AVG_N + " : " + total / n);
	}

	private void printAvgDivisions(int n) {
		double total = 0.0;
		for (int i = 1; i < (n + 1); i++) {
			double divisions = cic.getDivisionCountGCD(n, i);
			total += divisions;
		}
		System.out.println("Number of " + D_AVG_N  + " : " + total / n);
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

	// TODO
	// private static void runTask2() {
	// 	XYSeriesCollection dataset = new XYSeriesCollection();
	// 	System.out.println("----- Running " + TASK_1 + " -----");
	// 	Integer n = getUserInput("k");
	// }

	// private static XYSeries computeGDC(int k) {
	// 	double totalModDivisions = 0.0;
	// 	for (k; k >= 1; i++; i--) {
	// 		int m = fibonacci.getNthElement(k);
	// 		int n = fibonacci.getNthElement(k + 1);
	// 	}
	// }
	///////
}