
public class GradeCalculator {
	public double inputManagement(double a) {
		System.out.println("경영: " + a);
		return a;
	}

	public double inputMath(double a) {
		System.out.println("수학: " + a);
		return a;
	}

	public double inputAlgorithm(double a) {
		System.out.println("알고리즘: " + a);
		return a;
	}

	public double sum(double a, double b, double c) {
		System.out.println("총점: " + (a + b + c));
		return a + b + c;
	}

	public double calcAverage(double a, double b, double c) {
		System.out.println("평균: " + ((a + b + c) / 3));
		return (a + b + c) / 3;
	}
}
