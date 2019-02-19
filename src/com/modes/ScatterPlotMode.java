package com.modes;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import com.modes.AbstractMode;
import com.chart.ScatterPlot;

public class ScatterPlotMode extends AbstractMode {

	@Override
	public void run() {
		runTask1();
		//runTask3();
	}

	protected void runTask1() {
		XYSeriesCollection datasetMD = new XYSeriesCollection();
		XYSeriesCollection datasetD = new XYSeriesCollection();
		System.out.println("----- Running " + TASK_1 + " -----");

		Integer n = randomNumGen.nextInt((499 - 199) + 1) + 1;
		System.out.println("Value for n: " + n);
		datasetMD.addSeries(getAvgModDivisions(n));
		datasetD.addSeries(getAvgDivisions(n));

		String titleMD = TASK_1 + ": " + EUCLIDS_ALGO;
		String titleD = TASK_1 + ": " + CIC_ALGO;
		generateScatterPlot(datasetMD, titleMD, N_EQUALS_STR + n, MD_AVG_N);
		generateScatterPlot(datasetD, titleD, N_EQUALS_STR + n, D_AVG_N);
	}

	protected void runTask3() {
		XYSeriesCollection dataset = new XYSeriesCollection();
		System.out.println("----- Running " + TASK_3 + " -----");
		dataset.addSeries(getCommonFactorsComplexity());

		String title = TASK_3 + ": " + COMMON_FACTORS;
		generateScatterPlot(dataset, title, N_EQUALS_STR + 1000, "Common Factors");
	}

	private XYSeries getCommonFactorsComplexity() {
		XYSeries series = new XYSeries(THETA_G_N);
		List<Integer> mPrimeFactors = eratosthenes.getPrimeFactors(randomNumGen.nextInt((999 - 99) + 1) + 1);
		List<Integer> nPrimeFactors = eratosthenes.getPrimeFactors(randomNumGen.nextInt((999 - 99) + 1) + 1);
		Integer commonFactorCount = 0;
		Integer max = Math.max(mPrimeFactors.size(), nPrimeFactors.size());
		// finding common factors
		for (int i = 0; i < max; i++) {
			if (mPrimeFactors.contains(nPrimeFactors.get(i))) commonFactorCount++;
			series.add(i, commonFactorCount);
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
	      scatterPlot.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	      scatterPlot.setVisible(true);
	    });
	}
}