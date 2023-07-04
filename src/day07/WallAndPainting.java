package day07;

import java.util.Scanner;

public class WallAndPainting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);
	    
	    int lengthW = sc.nextInt();
	    int breadthW = sc.nextInt();
	    int lengthP1 = sc.nextInt();
	    int breadthP1 = sc.nextInt();
	    int lengthP2 = sc.nextInt();
	    int breadthP2 = sc.nextInt();
	    
	    int areaOfWall = lengthW * breadthW;
	    int areaOfP1 = lengthP1 * breadthP1;
	    int areaOfP2 = lengthP2 * breadthP2;
	    
	    int totalPaintingAre = areaOfP1 + areaOfP2;
	    
	    if(areaOfWall >= totalPaintingAre){
	      System.out.println("Raj can fix both painting");
	    } else {
	      System.out.println("Raj cannot fix both painting");
	    }

	}

}
