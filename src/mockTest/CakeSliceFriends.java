package mockTest;

import java.util.Scanner;

public class CakeSliceFriends {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// first input given test cases, second number of friends, third no.of.slices in one cake.
		
		// so no cake slices should be left, you should distribute cake slice to friends as a same quantity
		
		int test = sc.nextInt();
		
		for(int i=0; i<test; i++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			findCake(n,k);
		}
		
		sc.close();
		
	}
	
	public static void findCake(int n, int k) {
		
		int s = (n*k)/2;// we can run the loop upto (n*k)/2 or upto n
		
		for(int i=1; i<s; i++) {
			int cake = i * k;
			
			if(cake % n == 0) {
				System.out.println(i);
				break;
			}
			
		}
		return;
	}

}
