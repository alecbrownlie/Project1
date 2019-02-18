package com.modes; 

import com.algorithms.Euclids;
import com.algorithms.ConsecutiveIntegerCheck;
import com.algorithms.Fibonacci;
import com.algorithms.SieveOfEratosthenes;

abstract class AbstractMode {
	protected static String MD_AVG_N = "MDavg(n)";
	protected static String D_AVG_N = "Davg(n)";
	protected static String TASK_1 = "Task 1";
	protected static String TASK_3 = "Task 3";

	protected static Euclids euclids = new Euclids();
	protected static ConsecutiveIntegerCheck cic = new ConsecutiveIntegerCheck();
	protected static Fibonacci fibonacci = new Fibonacci();
	protected static SieveOfEratosthenes eratosthenes = new SieveOfEratosthenes();

	public void run() {
		runTask1();
		// runTask2();
		runTask3();
	}

	abstract void runTask1();
	// abstract void runTask2();
	abstract void runTask3();
}