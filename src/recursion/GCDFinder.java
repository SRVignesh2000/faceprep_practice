package recursion;

import java.util.Scanner;

public class GCDFinder {

	public static int gcd(int a, int b){// 56, 23
	    if(b == 0) {
	      return a;
	    }
	  
	    return gcd(b, a%b);
	  }
	  
	  
	  
	    public static void main(String args[])
	    {
	        //fill your code;
	      Scanner sc = new Scanner(System.in);
	      int a = sc.nextInt();
	      int b = sc.nextInt();
	      
	      if(a < b){
	        int temp = a;
	        a = b;
	        b = temp;
	        System.out.println("G.C.D of "+b+" and "+a+" is "+gcd(a,b));
	      } else {
	        System.out.println("G.C.D of "+a+" and "+b+" is "+gcd(a,b));
	      }
	      
	    }

}
