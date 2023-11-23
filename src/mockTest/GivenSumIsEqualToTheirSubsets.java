package mockTest;

import java.util.Scanner;

public class GivenSumIsEqualToTheirSubsets {

	// they give array and one integer like 10. we want to find that the subsets of
	// the array is equal to that integer or not
	// eg:n=5 find = 5
	// 1 2 3 4 5

	  public static void main(String args[])
	  {
	    //Try out your code here
		  Scanner sc = new Scanner(System.in);
		  int n = sc.nextInt();
		  int find = sc.nextInt();
		  int[] arr = new int[n];
		  
		  for(int i=0; i<n; i++){
		  	arr[i] = sc.nextInt();
		  }
		  int sum = 0;
		  
		  for(int i=n-1; i>=0; i--){
			  
			  if(sum == find){
				  System.out.println("yes");
				  break;
			  }
			  
			  if(sum + arr[i] <= find){
				sum += arr[i];
			  }
		  }
		  if(sum != find){
			  System.out.println("no");
		  }
	  }

}
