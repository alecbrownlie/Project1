public class Euclids {

	public static Integer getDivisionCountGCD(Integer m, Integer n) {
		if (n == 0) return 0;
		else return getDivisionCountGCD(n, m % n) + 1;	// may not work

	}

	public static Double getAvgNumberOfModDivisions(Integer n) {
		Double total = 0.0;
		for (int i = 1; i < (n + 1); i++) {
			total += getDivisionCountGCD(n, i);
		}
		return total / n;
	}
}