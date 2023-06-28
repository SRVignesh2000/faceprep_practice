package day04;

public class abcMaxCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12;
		int b = 7;
		int c = 78;

		// method 1
//		if (a > b) {
//			if (a > c) {
//				System.out.println(a);
//			} else {
//				System.out.println(c);
//			}
//		} else if (a < b) {
//			if (b > c) {
//				System.out.println(b);
//			} else {
//				System.out.println(c);
//			}
//		}
		
		
		
		// method 2
		if(a >= b && a >= c) {
			System.out.println(a);
		} else if (b >= c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}

	}

}
