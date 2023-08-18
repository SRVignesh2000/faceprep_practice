package day27;

import java.util.*;

abstract class Clac {
	public abstract void findStrongNum(int num);
}

class Finder extends Clac {
	public void findStrongNum(int num) {
		int count = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				count += i;
			}
		}
		if (count == num) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}

public class ABS {
	public static void main(String args[]) {
		// Try out your code here
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Finder fn = new Finder();
		fn.findStrongNum(num);
	}
}