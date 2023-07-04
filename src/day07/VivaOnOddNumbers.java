package day07;

import java.util.Scanner;

public class VivaOnOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);
	    float score = 0.0f;
	    
	    for (int i=0; i<3; i++){
	      int num = sc.nextInt();
	    	if(num < 0){
	      		score -= 1.0f;
	    	} else if(num %2 ==0) {
	      		score -= 0.5f;
	    	} else {
	      		score++;
	    	}	
	    }
	     System.out.println(score);

	}

}
