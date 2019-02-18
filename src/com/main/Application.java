package com.main;
import java.util.Scanner;
import com.modes.*;

public class Application {
	private static String PROJECT_BANNER = "----- Project 01: Empirical Analysis of Algorithms -----";
	private static String INSTRUCTIONS = "Please select mode for analysis: ";
	private static String WELCOME_MSG = "      Welcome! " + INSTRUCTIONS;
	private static String USER_TESTING_MODE = "User Testing Mode";
	private static String SCATTER_PLOT_MODE = "Scatter Plot Mode";

	private static UserTestMode userTestMode = new UserTestMode();
	private static ScatterPlotMode scatterPlotMode = new ScatterPlotMode();

	public static void main(String[] args) {
		printMenu();
		processUserInput();
	}

	private static void printMenu() {
		System.out.println(PROJECT_BANNER);
		System.out.println(WELCOME_MSG);
	}

	private static void printChoices() {
		System.out.println("1)    " + USER_TESTING_MODE);
		System.out.println("2)    " + SCATTER_PLOT_MODE);
	}

	private static void processUserInput() {
		Scanner scanner = new Scanner(System.in);
		boolean toProcess = true;
		try {
			while (toProcess) {
				printChoices();
				switch (Integer.parseInt(scanner.nextLine())) {
					case 1:
						System.out.println("Selected: " + USER_TESTING_MODE);
						userTestMode.run();
						toProcess = false;
						break;
					case 2: 
						System.out.println("Selected: " + SCATTER_PLOT_MODE);
						scatterPlotMode.run();
						toProcess = false;
						break;
					default:
						System.out.println("Not a choice. " + INSTRUCTIONS);
				}	
			}
		} catch (java.lang.NumberFormatException e) {
			System.out.println("Not a number. " + INSTRUCTIONS);
			processUserInput();
		}
	}
}