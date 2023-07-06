package day11;

import java.util.Scanner;

public class EvenCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    int sum = 0;
	    
	    for(int i=0; i<n; i++) {
	      arr[i] = sc.nextInt();
	    }
	    
	    for(int i=0; i<arr.length; i++) {
	      if(arr[i] % 2 == 0) {
	        sum += arr[i];
	      }
	    }
	    
	    System.out.println("The sum of the even numbers in the array is "+sum);

	}

}
