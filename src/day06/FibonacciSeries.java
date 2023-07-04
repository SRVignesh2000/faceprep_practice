package day06;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int a = 0, b = 1, c, size = 0;
        if (month == 1) {
            size = a;
        } else if (month == 2) {
            size = b;
        } else {
            for (int i = 3; i <= month; i++) {
                c = a + b;
                a = b;
                b = c;
                size = b;
            }
        }
        System.out.println(size);
        scanner.close();

	}

}
