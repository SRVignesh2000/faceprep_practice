package day11;

import java.util.Arrays;
import java.util.Scanner;

public class MedianCenterValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner sc = new Scanner(System.in);
	    int total = sc.nextInt();
	    int[] num = new int[total];
	    for(int i = 0;i<total;i++){
	    		num[i] = sc.nextInt();
	    }
	    Arrays.sort(num);
	       System.out.printf("The median of the array is %.2f",(double)num[total/2]);
	    
		// method for sorting
//	    for (int i = 0; i < n - 1; i++) {
//	            for (int j = 0; j < n - i - 1; j++) {
//	                if (array[j] > array[j + 1]) {
//	                    // Swap array[j] and array[j + 1]
//	                    int temp = array[j];
//	                    array[j] = array[j + 1];
//	                    array[j + 1] = temp;
//	                }
//	            }
//	        }

	    
	    

	}

}
