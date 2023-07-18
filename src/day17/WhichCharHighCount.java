package day17;

import java.util.Scanner;

public class WhichCharHighCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      Scanner sc = new Scanner(System.in);
	      String name = sc.nextLine();
	      String alpha = "abcdefghijklmnopqrstuvwxyz";
	      int max = 0;
	      char character = ' ';
	      for(int i=0; i<alpha.length(); i++) {
	        //System.out.println(i);
	        int count = 0;
	        for(int j=0; j<name.length(); j++) {
	        	if(alpha.charAt(i) == name.charAt(j)) {
	            	count++;
	            }
	          	if(max < count) {
	            	max = count;
	                //System.out.println(max);
	                character = name.charAt(j);
	            }
	        }
	        
	      }
	      System.out.println(character+ " "+ max);

	}

}
