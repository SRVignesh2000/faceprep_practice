package day15;

public class LowerCaseConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "GOOD";
		String[] splitted = name.split("");

		String b = "";
		
		for(int i=0; i<splitted.length; i++) {
			
			char character = name.charAt(i);
			int ascii = (int)character;
			
			if(ascii > 64 && ascii < 91) {
				ascii += 32;
				
			}
			b += (char)ascii;
		}
		
		
		for(int i=0; i<splitted.length; i++) {
			System.out.print(splitted[splitted.length-i-1]);
		}
		System.out.println();
		
		
		System.out.println(b);

	}

}
