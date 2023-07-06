package day11;

import java.util.Scanner;

public class OneDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);
	    int size = sc.nextInt();
	    
	    int[] arr = new int[size];
	    
	    for(int i=0; i<arr.length; i++) {
	      arr[i] = sc.nextInt();
	      System.out.println(arr[i]);
	    }

	}

}
