package day04;

import java.util.Scanner;

public class MangoTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);
	    int row = sc.nextInt();
	    int column = sc.nextInt();
	    int treeNo = sc.nextInt();
	    
	    int firstCol = column * 1; // 5
	    int lastCol = column * row; //25
	    int secondCol = lastCol - firstCol; // 25 - 5 = 20
	    
	    if (treeNo > firstCol && treeNo <= firstCol + column  || treeNo > secondCol - column && treeNo <= lastCol - column) {
	      System.out.println("It is a mango tree");
	    } else {
	      System.out.println("It is not a mango tree");
	    }

	}

}
