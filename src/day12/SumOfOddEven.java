package day12;

import java.util.Scanner;

public class SumOfOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i=0; i<n; i++) {
	      arr[i] = sc.nextInt();
	    }
	    int sumEven =0; 
	    int sumOdd = 0;
	    
	    for(int j=0; j<arr.length; j++) {
	      if(arr[j]  % 2 == 0) {
	        sumEven += arr[j];
	      } else {
	      	sumOdd += arr[j];
	      }
	    }
	    
	    System.out.println("The sum of the even numbers in the array is " + sumEven);
	    System.out.println("The sum of the odd numbers in the array is " + sumOdd);

	}

}
