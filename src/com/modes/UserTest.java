package com.modes;
import java.util.Scanner;
import com.algorithms.Euclids;
import com.algorithms.ConsecutiveIntegerCheck;

public class UserTest {
	private static Euclids euclids = new Euclids();
	private static ConsecutiveIntegerCheck cic = new ConsecutiveIntegerCheck();

	public static void run() {
		runTask1();
	}

	private static void runTask1() {
		System.out.println("----- Running Task 1 -----");
		Integer n = getUserInput("n");
		Double modDivisions = getAvgNumberOfModDivisions(n);
		Double divisions = getAvgNumberOfDivisions(n);
		System.out.println("Number of MDavg(n) : " + modDivisions);
		System.out.println("Number of Davg(n)  : " + divisions);
	}

	private static Double getAvgNumberOfModDivisions(Integer n) {
		Double total = 0.0;
		for (int i = 1; i < (n + 1); i++) {
			total += euclids.getDivisionCountGCD(n, i);
		}
		return total / n;
	}

	public static Double getAvgNumberOfDivisions(Integer n) {
		Double total = 0.0;
		for (int i = 1; i < (n + 1); i++) {
			total += cic.getDivisionCountGCD(n, i);
		}
		return total / n;
	}

	private static Integer getUserInput(String var) {
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