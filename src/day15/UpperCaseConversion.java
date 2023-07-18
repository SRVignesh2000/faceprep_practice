package day15;

public class UpperCaseConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "good";
		String[] splitted = name.split("");

		String b = "";
		
		for(int i=0; i<splitted.length; i++) {
			
			char character = name.charAt(i);
			int ascii = (int)character;
			
			if(ascii > 96 && ascii < 123) {
				ascii -= 32;
			}
			b += (char)ascii;
		}
		
		System.out.println(b);

	}


}
