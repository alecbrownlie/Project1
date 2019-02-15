package com.modes;
import java.util.Scanner;
import com.algorithms.Euclids;

public class UserTest {
	private static Euclids euclids = new Euclids();

	public static void run() {
		runTask1();
	}

	private static void runTask1() {
		System.out.println("----- Running Task 1 -----");
		Integer n = getUserInput("n");
		Double numOfDivisions = getAvgNumberOfModDivisions(n);
		System.out.println("Number of divisions: " + numOfDivisions);
	}

	private static Double getAvgNumberOfModDivisions(Integer n) {
		Double total = 0.0;
		for (int i = 1; i < (n + 1); i++) {
			total += euclids.getDivisionCountGCD(n, i);
		}
		return total / n;
	}

	private static Integer getUserInput(String var) {
		Scanner scanner = new Scanner(System.in);
		boolean toProcess = true;
		int result = 0;
		try {
			while (true) {
				System.out.println("Please enter a single value for " + var + ": ");
				result = scanner.nextInt();
				if (result > 0) return result;
			}
		} catch (java.util.InputMismatchException e) {
			System.out.println("Not a number. ");
			getUserInput(var);
		}
		return result;
	}
}