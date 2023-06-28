package day05;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner sc = new Scanner(System.in);
	      int L1 = sc.nextInt();
		  int L2 = sc.nextInt();
		  int L3 = sc.nextInt();
	      int stu = sc.nextInt();
	      int count = 0;
	      if(stu <= L1 && stu <= L2 && stu <= L3){
	        count = 3;
	      } else if(stu <= L1 && stu <= L2 || stu <= L3 ) {
	        count = 2;
	      } else if (stu <= L1 || stu <= L2 || stu <= L3) {
	        count = 1;
	      } else {
	        count = 0;
	      }
	      
	      System.out.println(count);
	      
	      //method 2
//	        int count = 0;
//	        if (L1 >= stu) {
//	            count++;
//	        }
//	        if (L2 >= stu) {
//	            count++;
//	        }
//	        if (L3 >= stu) {
//	            count++;
//	        }
//	        System.out.println(count);
	    
	      
	      

	}

}
