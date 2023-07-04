package day07;

import java.util.Scanner;

public class TrendyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	   
	    if(num >=100 && num <= 999) {
	      int mid = num / 10 ; 
	      int middle = mid % 10;
	      if(middle % 3 == 0){
	        System.out.println("Trendy Number");
	      } else {
	        System.out.println("Not a Trendy Number");
	      }
	    } else {
	      System.out.println("Invalid Number");
	    }   

	}

}
