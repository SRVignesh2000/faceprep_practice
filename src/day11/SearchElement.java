package day11;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    int count = 0;
	    
	    for(int i=0; i<n; i++) {
	      arr[i] = sc.nextInt();
	    }
	    int search = sc.nextInt();
	    
	    for(int i=0; i<arr.length; i++) {
	      if(arr[i] == search) {
	        count++;
	        break;
	      } 
	    }
	    if(count == 1) {
	    	System.out.println(search +" is present in the array");
	    }
	    else {
	        System.out.println(search +" is not present in the array");
	      }

	}

}
