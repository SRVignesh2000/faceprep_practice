package day05;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner sc = new Scanner(System.in);
	      int birth = sc.nextInt();
	      int current = sc.nextInt();
	      
	      if(current < birth) {
	        int age1 = 100 - birth;
	        int age2 = age1 + current;
	        System.out.println(age2);
	      } else {
	        int age = current - birth;
	      	System.out.println(age);
	      }

	}

}
