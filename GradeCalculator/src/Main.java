
public class Main {
	public static void main(String[] args) {
		GradeCalculator gradeCalculator = new GradeCalculator();
		
		gradeCalculator.inputManagement(3.5);
		gradeCalculator.inputMath(4.5);
		gradeCalculator.inputAlgorithm(3.0);
		
		gradeCalculator.sum(3.5, 4.5, 3.0);
		gradeCalculator.calcAverage(3.5, 4.5, 3.0);
	}
}
