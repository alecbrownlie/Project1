package com.modes;
import java.util.Scanner;

public class UserTest {

	public static void run() {
		getUserInput();
	}

	private static Integer getUserInput() {
		Scanner scanner = new Scanner(System.in);
		boolean toProcess = true;
		int n = 0;
		try {
			while (toProcess) {
				System.out.println("Please enter a single value for N: ");
				n = scanner.nextInt();
				if (n > 0) toProcess = true;
			}
		} catch (java.util.InputMismatchException e) {
			System.out.println("Not a number. ");
			getUserInput();
		}
		return n;
	}
}