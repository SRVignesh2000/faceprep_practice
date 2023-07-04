package day06;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// method 1
		Scanner sc = new Scanner(System.in);
	    int fact = sc.nextInt();
	    int factorial = 1;
	    for(int i=1;i<10;i++){
	    	factorial*=i;
	      if(factorial == fact){
	      	System.out.println("Yes");
	        return;
	      }
	     else if(factorial>fact)
	     {
	      	System.out.println("No");
	       return;
	     }
	    }
	      	System.out.println("No");
	      	
	      	
	    // method 2 chat GPT
//	        Scanner scanner = new Scanner(System.in);
//	        int n = scanner.nextInt();
//	        scanner.close();
//	        // Check if the number is a factorial number
//	        int factorial = 1;
//	        int i = 1;
//	        while (factorial <= n) {
//	            if (factorial == n) {
//	                System.out.println("Yes");
//	                return;
//	            }
//	            i++;
//	            factorial *= i;
//	        }
//	        System.out.println("No");
//	    }

	}

}
