package day02;


public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the celcius");

		float celcius = 1.0f;

		float kelvin = celcius + 273.15f;
		float fahren = (celcius * 9 / 5) + 32;

		System.out.printf("%.2f%n", fahren);
		System.out.printf("%.2f", kelvin);

	}

}
