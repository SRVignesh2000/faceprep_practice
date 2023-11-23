package mockTest;

import java.util.Scanner;

//Implement the following function:
//int NearestInteger(int num, int m);
//The function accepts two positive integers ‘num’ and ‘m’ as its argument. Implement the function
//to find and return a number which satisfies the following the condition
//1. Number is divisible by ‘m’
//2.Number is nearest to ‘num’(have the least distance from num)
//Distance between two numbers is the number of integers between them
//Note:If there are two numbers with the least distance from ‘num’ which is divisible by ‘m’ then
//return the larger number
//Input:
//Num:67
//m:8
//Output:
//64
//Explanation:
//The nearest number greater than 67 which is divisible by 8 is 72.
//Nearest number less than 67 which is divisible by 64
//Since ,64 is nearest to 67.Thus,output is 64
//The custom input format for the above case :
//67
//8
//(The first line represent ‘num’,the second line represent ‘m’

public class NeartestWithNumDividedBym {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // 8
		int m = sc.nextInt(); // 3
				
		
		
		// Boobalan method
//		int upper = num + (num % m);
//		
//		System.out.println("Up "+upper);
//		
//		int lower = upper - m;
//		
//		if(upper - num > num - lower) {
//			
//			System.out.println(upper);
//			
//		} else if(upper == num) {
//			System.out.println(upper + m);
//		} else {
//			System.out.println(lower);
//		}
		
		
		
		int lower = num - (num % m);
		int upper = lower + m;
		
		if(upper - num == num - lower) {
			System.out.println(upper);
		} else if (upper-num > num - lower) {
			System.out.println(lower);
		} else {
			System.out.println(upper);
		}
//		
//		
//		if(upper - num > num - lower) {
//			System.out.println(lower);
//		} else if(num == upper) {
//			System.out.println(upper);
//		} else {
//			System.out.println(upper);
//		}
		
		
	}

}
