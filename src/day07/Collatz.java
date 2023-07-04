package day07;

import java.util.Scanner;

public class Collatz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    
	    System.out.println(num);
	    
	    int i=0;
	    while(num != 1){
	        if(num%2 == 0) {
	        num /= 2;
	      } else {
	        num = 3 * num + 1;
	      }
	      System.out.println(num);
	      i++;
	    }
	    System.out.println(i);

	}

}
