import java.lang.Math;

public class ConsecutiveIntegerCheck {

	// from Section (1.1)
	public static Integer getDivisionCountGCD(Integer m, Integer n) {
		int count = 0;		
		for (int t = Math.min(m, n); t > 1; t--) {		
			int r1 = m % t;			// Step 2
			count++;
			if (r1 == 0) {
				int r2 = n % t;		// Step 3
				count++;
				if (r2 == 0)
					return count;
			}
		}
		return count;
	}

	// TODO: refactor outside of class
	public static Double getAvgNumberOfDivisions(Integer n) {
		Double total = 0.0;
		for (int i = 1; i < (n + 1); i++) {
			total += getDivisionCountGCD(n, i);
		}
		return total / n;
	}
}