package day07;

import java.util.Scanner;

public class TargetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);
	    
	    int targetScore = sc.nextInt();
	    
	    int turns = 0;
	    int currScore = 0;
	 	while (currScore <= targetScore){
	      int score = sc.nextInt();
	       if (score == 0) {
	                break;
		   }
	      currScore += score;
	      turns++;
	    }
	    System.out.println("The number of turns is "+turns);

	}

}
