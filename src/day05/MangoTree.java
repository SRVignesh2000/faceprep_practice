package day05;

import java.util.Scanner;

public class MangoTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      Scanner sc = new Scanner(System.in);
	      int rows = sc.nextInt();
	      int columns = sc.nextInt();
	      int treeNo = sc.nextInt();
	      
	      if (treeNo == 1 || treeNo <= columns || treeNo%rows == 0 || treeNo%rows ==1){ 
	      	System.out.println("Yes");
	      }  
	      else{
	        System.out.println("No");
	      }

	}

}
