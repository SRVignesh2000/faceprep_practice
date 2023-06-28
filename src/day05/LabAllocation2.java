package day05;

import java.util.Scanner;

public class LabAllocation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      Scanner sc = new Scanner(System.in);
	      int L1 = sc.nextInt();
	      int L2 = sc.nextInt();
	      int L3 = sc.nextInt();
	      String allot = sc.next();
	      //System.out.println(allot);
	      
	      if(allot.equals("L1")) {
	        
	      	if(L2 < L3) {
		        System.out.println("L2");
		      } else {
		        System.out.println("L3");
		      }		
	      } else if(allot.equals("L2")) {
	        
	        if(L1 < L3) {
	          System.out.println("L1");
	        } else {
	          System.out.println("L3");
	        }
	      } else {
	        if(L1 < L2) {
		        System.out.println("L1");
		    } else {
	          System.out.println("L2");
	        }
	      }  

	}

}
