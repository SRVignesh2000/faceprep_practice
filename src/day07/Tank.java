package day07;

import java.util.Scanner;

public class Tank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);
	    float radius = sc.nextFloat();
	    float height = sc.nextFloat();
	    float amountOfWaterPerHour = sc.nextFloat();
	    float totalHoursTankReceives = sc.nextFloat();
	    
	    float tankVolume = (float) (Math.PI * Math.pow(radius, 2) * height);
	    
	    float totalWaterReceived = amountOfWaterPerHour * totalHoursTankReceives;
	    
	    if(tankVolume <= totalWaterReceived){
	       System.out.println("The tank can be filled within " + totalHoursTankReceives + " hours");
	    } else {
	            System.out.println("The tank cannot be filled within " + totalHoursTankReceives + " hours");
	    }

	}

}
