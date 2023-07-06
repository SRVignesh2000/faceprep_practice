package day11;

import java.util.Scanner;

public class ArrayMode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    int count = 0;
	    int mode = 0;
	    for(int i=0; i<n; i++) {
	      arr[i] = sc.nextInt();
	    }
	    
	    for(int i=0; i<n; i++) {
	        for(int j=i+1; j<n; j++) {
	     		if(arr[i] == arr[j]) {
	              count++;
	              //System.out.println(count);
	              mode = arr[i];
	              break;
	            }
	    	}
	    }
	    if(count == 0) {
	      System.out.println("The mode of the array is none");
	    } else {
	      System.out.println("The mode of the array is "+ count);
	    }

	}

}
