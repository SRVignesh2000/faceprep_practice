package day07;

import java.util.Scanner;

public class SalaryAndExpenses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
	    
	    int salary = sc.nextInt();
	    int bankLoan = sc.nextInt();
	    int hostelFees = sc.nextInt();
	    int foodExpense = sc.nextInt();
	    int sendToParents = sc.nextInt();
	    
	    int totalExpenses = bankLoan + hostelFees + foodExpense + sendToParents;
	    
	    if(salary < totalExpenses) {
	      System.out.println("He has to work hard");
	    } else if (salary > totalExpenses) {
	      System.out.println("He can save the money");
	    }

	}

}
