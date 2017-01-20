
public class Temperator {
	public void changeCelsiusToFahrenheit(double a) {
		double fahrenheit = ((a * 1.8) + 32);

		System.out.println("섭씨 " + a + " = " + "화씨 " + fahrenheit);
	}

	public void changeFahrenheitToCelsius(double a) {
		double celsius = ((a - 32) / 1.8);

		System.out.println("화씨 " + a + " = " + "섭씨 " + celsius);
	}
}
