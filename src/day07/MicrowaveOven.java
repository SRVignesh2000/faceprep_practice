package day07;

import java.util.Scanner;

public class MicrowaveOven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      Scanner sc = new Scanner(System.in);
	      int items = sc.nextInt();
	      float heatingTime = sc.nextFloat();
	      
	      if(items == 1){
	        System.out.println(heatingTime);
	      } else if (items == 2) {
	        double time = heatingTime + (heatingTime * 50/100.0);
	        System.out.println(time);
	      } else if(items == 3 ){
	        double time = heatingTime * 2;
	        System.out.println(time);
	      } else {
	        System.out.println("Number of items is more");
	      }

	}

}
