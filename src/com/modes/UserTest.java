package com.modes;
import java.util.Scanner;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import com.algorithms.Euclids;
import com.algorithms.ConsecutiveIntegerCheck;
import com.algorithms.Fibonacci;
import com.algorithms.SieveOfEratosthenes;

import com.chart.ScatterPlot;

public class UserTest {
	private static String MD_AVG_N = "MDavg(n)";
	private static String D_AVG_N = "Davg(n)";
	private static String TASK_1 = "Task 1";
	private static String TASK_3 = "Task 3";

	private static Euclids euclids = new Euclids();
	private static ConsecutiveIntegerCheck cic = new ConsecutiveIntegerCheck();
	private static Fibonacci fibonacci = new Fibonacci();
	private static SieveOfEratosthenes eratosthenes = new SieveOfEratosthenes();

	public static void run() {
		runTask1();
		runTask3();
		// runTask2();

	}

	private static void runTask1() {
		XYSeriesCollection dataset = new XYSeriesCollection();
		System.out.println("----- Running " + TASK_1 + " -----");
		Integer n = getUserInput("n");
		dataset.addSeries(getAvgModDivisions(n));

		dataset.addSeries(getAvgDivisions(n));
		generateScatterPlot(dataset);
	}

	private static void runTask3() {
		XYSeriesCollection dataset = new XYSeriesCollection();
		System.out.println("----- Running " + TASK_3 + " -----");
		Integer m = getUserInput("m");
		Integer n = getUserInput("n");

		Integer gcd = eratosthenes.computeGCD(m, n);
		System.out.println("GCD(m, n): " + gcd);	
	}

	private static XYSeries getAvgModDivisions(int n) {
		double total = 0.0;
		XYSeries series = new XYSeries(MD_AVG_N);
		for (int i = 1; i < (n + 1); i++) {
			double divisions = euclids.getDivisionCountGCD(n, i);
			total += divisions;
			series.add(i, divisions);
		}
		System.out.println("Number of " + MD_AVG_N + " : " + total / n);
		return series;
	}

	public static XYSeries getAvgDivisions(int n) {
		double total = 0.0;
		XYSeries series = new XYSeries(D_AVG_N);
		for (int i = 1; i < (n + 1); i++) {
			double divisions = cic.getDivisionCountGCD(n, i);
			total += divisions;
			series.add(i, divisions);
		}
		System.out.println("Number of " + D_AVG_N  + " : " + total / n);
		return series;
	}

	private static void generateScatterPlot(XYDataset dataset) {
		SwingUtilities.invokeLater(() -> {
	      ScatterPlot example = new ScatterPlot(TASK_1, dataset, MD_AVG_N, D_AVG_N);
	      example.setSize(800, 400);
	      example.setLocationRelativeTo(null);
	      example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	      example.setVisible(true);
	    });
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