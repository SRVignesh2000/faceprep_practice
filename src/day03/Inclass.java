package day03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Inclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String d = sc.nextLine();
		int a = sc.nextInt();
		float b = sc.nextFloat();
		double c = sc.nextDouble();
		long l = sc.nextLong();

		// method 1
//		double ans1 = b / c;
//		int ans2 = (int) c / a;
//		long ans3 = ans2 + l;
//
//		System.out.println(String.format("%.1f", ans1) + " " + ans2 + " " + ans3);
//		System.out.println(d + " " + d.charAt(3));
		
		
		// method 2
		float ans1 =(float) (b / c);
		int ans2 = (int) c / a;
		long ans3 = ans2 + l;

		System.out.printf("%.1f ", ans1);
		System.out.println(ans2 + " " + ans3);
		System.out.println(d + " " + d.charAt(3));
		

	}

}
