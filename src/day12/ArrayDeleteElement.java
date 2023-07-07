package day12;

import java.util.Scanner;

public class ArrayDeleteElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i=0; i<n; i++) {
	      arr[i] = sc.nextInt();
	    }
	    int position = sc.nextInt();

			// System.out.println(postion//);

			if (position < 0 || position > n || arr.length >= 20) {
				System.out.println("Invalid Input");
				return;
			}
	    
	    	int[] newArr = new int[n-1];
	    
	    	for(int i=0; i<n; i++) {
	        	if(i < position - 1) {
	              newArr[i] =arr[i];
	            } else if(i == position -1) {
	              continue;
	            } else {
	              newArr[i-1] = arr[i];
	            }
	        }
	    	System.out.println("Array after deletion is:");
	    	for(int i =0; i<newArr.length; i++) {
	        	System.out.println(newArr[i]);
	        }

	}

}
