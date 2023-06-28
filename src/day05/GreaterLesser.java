package day05;

import java.util.Scanner;

public class GreaterLesser {
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int a = sc.nextInt();
	      int b = sc.nextInt();
	      
	      if(a>b){
	        System.out.println(a+" greater than "+b);
	      } else if(a == b) {
	        System.out.println(a + " and "+ b +" are equal");
	      } else {
	        System.out.println(a+" less than "+b);
	      }
	}

}
