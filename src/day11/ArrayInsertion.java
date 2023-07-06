package day11;

import java.util.Scanner;

public class ArrayInsertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i=0; i<n; i++) {
	    	arr[i] = sc.nextInt();
	    }
	    int position = sc.nextInt();
	    int number = sc.nextInt();
	    //System.out.println(postion//);
	    
	    int[] newArr = new int[arr.length+1];
	    
	    for(int i=0; i<newArr.length; i++) {
	      if(i < position-1) {// 1 < 2
	        newArr[i] = arr[i];
	      } else if(i == position-1){//2 == 2
	        newArr[i] = number;
	      } else {
	        newArr[i] = arr[i-1];
	      }
	      System.out.println(newArr[i]);
	    }

	}

}
