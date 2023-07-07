package day12;

import java.util.Arrays;
import java.util.Scanner;

public class Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i=0; i<n; i++) {
	      arr[i] = sc.nextInt();
	    }
	    
	    Arrays.sort(arr);
	    int first = arr[0];
	    int last = arr[arr.length-1];
	    
	    int result = last - first;
	    System.out.println("Enter the number of elements in the array");
	    System.out.println("Enter the elements in the array");
	    System.out.println("The range of the array is " +result);

	}

}
