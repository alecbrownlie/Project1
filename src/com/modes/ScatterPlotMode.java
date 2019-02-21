package com.modes;

import java.util.List;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import com.modes.AbstractMode;
import com.chart.ScatterPlot;

public class ScatterPlotMode extends AbstractMode {
	private Integer comparisonCount = 0;

	protected void runTask1() {
		XYSeriesCollection datasetMD = new XYSeriesCollection();
		XYSeriesCollection datasetD = new XYSeriesCollection();
		XYSeriesCollection dataset = new XYSeriesCollection();

		System.out.println("----- Running " + TASK_1 + " -----");

		Integer n = randomNumGen.nextInt(150 - 60 + 1) + 60;
		System.out.println("n = " + n);
		datasetMD.addSeries(getAvgModDivisions(n));
		datasetD.addSeries(getAvgDivisions(n));
		dataset.addSeries(getAvgModDivisions(n));
		dataset.addSeries(getAvgDivisions(n));

		String titleMD = TASK_1 + ": " + EUCLIDS_ALGO;
		String titleD = TASK_1 + ": " + CIC_ALGO;
		generateScatterPlot(datasetMD, titleMD, N_EQUALS_STR + n, MD_AVG_N);
		generateScatterPlot(datasetD, titleD, N_EQUALS_STR + n, D_AVG_N);
		generateScatterPlot(dataset, TASK_1, N_EQUALS_STR + n, "");
	}

	protected void runTask2() { 
		XYSeriesCollection dataset = new XYSeriesCollection();

		System.out.println("----- Running " + TASK_2 + " -----");

		Integer k = 45;
		System.out.println("k = " + k);
		dataset.addSeries(getWorstModDivisions(k));
		
		String title = TASK_2 + ": " + EUCLIDS_ALGO;
		generateScatterPlot(dataset, title, K_EQUALS_STR + k, MD_WORST_N);
	}

	protected void runTask3() {
		XYSeriesCollection dataset = new XYSeriesCollection();

		System.out.println("----- Running " + TASK_3 + " -----");
		dataset.addSeries(getCommonFactorsComplexity());

		String title = TASK_3 + ": " + COMMON_FACTORS;
		generateScatterPlot(dataset, title, N_EQUALS_STR + 1000, "Common Factors");
	}

	private XYSeries getCommonFactorsComplexity() {
		// Commented out comparing lists of prime factors using sieve algo.
		// It seems that comparing many small (prime) numbers in two large lists
		// demonstrates the comparison algorithm running in O(g) more clearly. 

		// Integer m = 5040;
		// Integer n = 2520;
		// List<Integer> mPrimeFactors = eratosthenes.getPrimeFactors(m);
		// List<Integer> nPrimeFactors = eratosthenes.getPrimeFactors(n);
		List<Integer> aRandomNumbers = getRandomNumbers();
		List<Integer> bRandomNumbers = getRandomNumbers();

		// System.out.println("m = " + m);
		// System.out.println("n = " + n);
		// System.out.println("Prime Factors of m = " + mPrimeFactors);
		// System.out.println("Prime Factors of n = " + nPrimeFactors);
		System.out.println("List A = " + aRandomNumbers);
		System.out.println("List B = " + bRandomNumbers);
		XYSeries series = plotCommonElementsXY(aRandomNumbers, bRandomNumbers);
		return series;
	}

	private XYSeries plotCommonElementsXY(List<Integer> m, List<Integer> n) {
		XYSeries series = new XYSeries(THETA_G_N);
		int i = 0, j = 0; 
	    while (i < m.size() && j < n.size()) 
	    { 
	    	comparisonCount++;
	    	if (m.get(i) < n.get(j)) 
	        	i++; 
	      	else if (n.get(j) < m.get(i)) 
	        	j++; 
	      	else {
	        	series.add(i, comparisonCount); 
	      		j++; 
	        	i++; 
	      	} 
	    }
	    return series;
	}

	private List<Integer> getRandomNumbers() {
		List<Integer> randomNumbers = new ArrayList<Integer>();
		for (int i = 0; i < 150; i++) {
			randomNumbers.add(randomNumGen.nextInt(2 - 1 + 1) + 1);
		}
		return randomNumbers;
	}

	private XYSeries getWorstModDivisions(int k) {
		XYSeries series = new XYSeries(MD_AVG_N);
		for (int i = 1; i < k; i++) {
			Integer currentFib = fibonacci.getNthElement(i);
			Integer nextFib = fibonacci.getNthElement(i+1);
			series.add(i, euclids.getDivisionCountGCD(nextFib, currentFib));
		}
		return series;
	}

	private XYSeries getAvgModDivisions(int n) {
		XYSeries series = new XYSeries(MD_AVG_N);
		for (int i = 1; i < (n + 1); i++) {
			series.add(i, euclids.getDivisionCountGCD(n, i));
		}
		return series;
	}

	private XYSeries getAvgDivisions(int n) {
		XYSeries series = new XYSeries(D_AVG_N);
		for (int i = 1; i < (n + 1); i++) {
			series.add(i, cic.getDivisionCountGCD(n, i));
		}
		return series;
	}

	private void generateScatterPlot(XYDataset dataset, String title, String xAxis, String yAxis) {
		SwingUtilities.invokeLater(() -> {
	      ScatterPlot scatterPlot = new ScatterPlot(title, dataset, xAxis, yAxis);
	      scatterPlot.setSize(900, 450);
	      scatterPlot.setLocationRelativeTo(null);
	      scatterPlot.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	      scatterPlot.setVisible(true);
	    });
	}
}