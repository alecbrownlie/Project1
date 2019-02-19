package com.modes; 

import java.util.Random;

import com.algorithms.Euclids;
import com.algorithms.ConsecutiveIntegerCheck;
import com.algorithms.Fibonacci;
import com.algorithms.SieveOfEratosthenes;

abstract class AbstractMode {
	protected static String EUCLIDS_ALGO = "Euclid's Algorithm";
	protected static String CIC_ALGO = "Consecutive Integer Check Algorithm";
	protected static String SIEVE_ALGO = "Sieve Of Eratosthenes Algorithm";

	protected static String MD_AVG_N = "MDavg(n)";
	protected static String MD_WORST_N = "MDworst(n)";
	protected static String D_AVG_N = "Davg(n)";
	protected static String COMMON_FACTORS = "Finding Common Factors for GCD(m, n) using " + SIEVE_ALGO;
	protected static String N_EQUALS_STR = "n = ";
	protected static String K_EQUALS_STR = "k = ";
	protected static String TASK_1 = "Task 1";
	protected static String TASK_2 = "Task 2";
	protected static String TASK_3 = "Task 3";
	protected static String THETA_G_N = "\u03B8(g)";

	protected static Euclids euclids = new Euclids();
	protected static ConsecutiveIntegerCheck cic = new ConsecutiveIntegerCheck();
	protected static Fibonacci fibonacci = new Fibonacci();
	protected static SieveOfEratosthenes eratosthenes = new SieveOfEratosthenes();

	protected static Random randomNumGen = new Random();

	public void run() {
		runTask1();
		runTask2();
		runTask3();
	}

	abstract void runTask1();
	abstract void runTask2();
	abstract void runTask3();
}