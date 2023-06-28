package day05;

import java.util.Scanner;

public class TrafficSignal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      Scanner sc = new Scanner(System.in);
	      float speed = sc.nextFloat();
	      float distance = sc.nextFloat();
	      float time = sc.nextFloat();
	      
	      double forOneSecond = speed/3600;
	      double forTime = forOneSecond * time;
	      //double forDistance = forTime *distance;
	      
	      //System.out.println(forDistance);
	      
	      if(forTime >= distance) {
	        System.out.println("Yes");
	      } else {
	        System.out.println("No");
	      }

	}

}
