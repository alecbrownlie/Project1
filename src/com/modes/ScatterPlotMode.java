package com.modes;

import java.util.Random;
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
	}

	protected void runTask1() {
		XYSeriesCollection dataset = new XYSeriesCollection();
		System.out.println("----- Running " + TASK_1 + " -----");
		Random r = new Random();
		Integer n = r.nextInt((9999 - 999) + 1) + 1;
		System.out.println("Value for n: " + n);
		dataset.addSeries(getAvgModDivisions(n));
		dataset.addSeries(getAvgDivisions(n));
		generateScatterPlot(dataset);
	}

	protected void runTask3() {
		System.out.println("----- Running " + TASK_3 + " (jk) -----");
	}

	private XYSeries getAvgModDivisions(int n) {
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

	private XYSeries getAvgDivisions(int n) {
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

	private void generateScatterPlot(XYDataset dataset) {
		SwingUtilities.invokeLater(() -> {
	      ScatterPlot scatterPlot = new ScatterPlot(TASK_1, dataset, MD_AVG_N, D_AVG_N);
	      scatterPlot.setSize(800, 400);
	      scatterPlot.setLocationRelativeTo(null);
	      scatterPlot.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	      scatterPlot.setVisible(true);
	    });
	}
}