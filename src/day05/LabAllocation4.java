package day05;

import java.util.Scanner;

public class LabAllocation4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      int y = sc.nextInt();
      int z = sc.nextInt();
       int student = sc.nextInt();
      int min1 = Math.abs(student - x);
        int min2 = Math.abs(student - y);
        int min3 = Math.abs(student - z);
      	String miniValue;
		if (min1 <= min2 && min1 <= min3) {
			miniValue = "L1";
		} else if (min2 <= min3) {
			miniValue = "L2";
		} else {
			miniValue = "L3";
		}
		System.out.println(miniValue);

	}

}
