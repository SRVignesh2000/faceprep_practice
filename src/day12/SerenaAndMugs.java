package day12;

import java.util.Scanner;

public class SerenaAndMugs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int s = sc.nextInt();
	    int sum=0;
	    
	    int[] arr = new int[n];
	    for(int i=0; i<n; i++) {
	      arr[i] = sc.nextInt();
	      //System.out.println(arr[i]);
	      sum+=arr[i];
	    }
	    
	    if(sum <= s) {
	      System.out.println("YES");
	    } else {
	      System.out.println("NO");
	    }

	}

}
