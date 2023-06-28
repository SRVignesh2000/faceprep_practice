package day03;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;// binary code = 101
		int b = 6;// binary code = 110
		
		System.out.println(a^b); // binary code for 3 is 011
		
		//shift operator
		System.out.println(a<<b);// answer 320
		
		System.out.println(a>>b);// answer 0
		
		// ternary operator
		System.out.println(a>b?a:b);
		
		//unary operator
		int c = (a++)*1;
		int d = ++a;
		System.out.println(c);
		System.out.println(d);

	}

}
