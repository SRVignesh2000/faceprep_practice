package day11;

import java.util.Scanner;

public class SameOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);
	    int n1 = sc.nextInt();
	    int n2 = sc.nextInt();
	    
	    int[] arr1 = new int[n1];
	    int[] arr2 = new int[n2];
	    
	    int sum1 = 0;
	    int sum2 = 0;
	    
	    for(int i=0; i<n1; i++) {
	      arr1[i]= sc.nextInt();
	      sum1 += arr1[i];
	      
	    }
	    for(int i=0; i<n2; i++) {
	      arr2[i]= sc.nextInt();
	      sum2 += arr2[i];
	    }
	    
	  	if(sum1 == sum2) {
	      System.out.println("Same");
	    } else {
	      System.out.println("Not Same");
	    }

	}

}
