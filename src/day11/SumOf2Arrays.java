package day11;

import java.util.Scanner;

public class SumOf2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr1 = new int[n];
	    int[] arr2 = new int[n];
	    int sum =0;
	    
	    for(int i=0; i<n; i++) {
	    	arr1[i] = sc.nextInt();
	    }
	    for(int j =0; j<n; j++) {
	    	arr2[j] = sc.nextInt();
	    }
	    
	    for(int k=0; k<n; k++) {
	      sum = arr1[k] + arr2[k];
	      System.out.println(sum);
	    }

	}

}
