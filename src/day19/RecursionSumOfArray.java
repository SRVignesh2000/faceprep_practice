package day19;

import java.util.Scanner;

public class RecursionSumOfArray {

    
   public static int sumFinder(int[] arr,int n, int sum) {
       
       if(n >= 0) {
          sum += arr[n];
           return sumFinder(arr, n-1, sum);  
       }
       return sum;
   }
 
 
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      int n = 6;
      int[] arr = {2,5,1,7,4,2};
      
      int sum =  0;
      int result = sumFinder(arr, n-1, sum);
      System.out.println(result);
   }

}
