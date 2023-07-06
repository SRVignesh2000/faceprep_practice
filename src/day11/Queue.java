package day11;

import java.util.Scanner;

public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    int[] arr = new int[n];
	    int count = 0;
	    
	    for(int i=0; i<n; i++) {
	      arr[i] = sc.nextInt();
	    }
	        
	    for(int i=0; i<n; i++) {
	      if(m == arr[i]) { // 3 >=2
	        count++;
	      }
	    }
	    
	    System.out.println(arr.length-count);

	}

}
