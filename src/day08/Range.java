package day08;

import java.util.Scanner;

public class Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);
	    int min = sc.nextInt();
	    int max = sc.nextInt();
	    
	    int i = min;
	    int sum = 0;
	    while(i <= max) {
	      sum += i;
	      i++;
	    }
	    System.out.println(sum);

	}

}
