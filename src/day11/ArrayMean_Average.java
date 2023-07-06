package day11;

import java.util.Scanner;

public class ArrayMean_Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    float sum = 0.0f;

	    
	    for(int i=0; i<n; i++) {
	      arr[i] = sc.nextInt();
	      sum+= arr[i];
	    }

	    System.out.printf("The mean of the array is %.2f" , sum/n);

	}

}
