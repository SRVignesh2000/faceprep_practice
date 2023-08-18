package sort;

import java.util.Scanner;

public class MergeSort {
	
	  public static void main(String args[])
	  {
	    //Try out your code here
//		  input
//		  6
//
//		  0 1 2 3 4 7
//
//		  3
//
//		  2 5 6
	    Scanner sc = new Scanner(System.in);
	    int n1 = sc.nextInt();
	    int[] arr = new int[n1];
	    for(int i=0; i<n1; i++) {
	      arr[i] = sc.nextInt();
	    }
	    
	    int n2 = sc.nextInt();
	    int[] arr2 = new int[n2];
	    for(int i=0; i<n2; i++) {
	      arr2[i] = sc.nextInt();
	    }
	    
	    
	    int[] arr3 = new int[n1 + n2];
	    
	    int i=0, j=0, k=0;
	    while(i < n1 && j < n2) {
	    	if(arr[i] <= arr2[j]) {
	          arr3[k++] = arr[i++];
	        }
	      	else {
	        	arr3[k++] = arr2[j++];
	        }
	    }
	    
	    while(i < n1) {
	          arr3[k++] = arr[i++];
	    }
	    while(j < n2) {
	        	arr3[k++] = arr2[j++];
	    }
	    
	    for(int l=0; l<arr3.length; l++) {
	    	System.out.print(arr3[l]+" ");
	    }  
	  }

}
