package day15;

public class LengthFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "awerqfa";
		String[] splitted = name.split("");
		
		
		
		int count = 0;
		for(String i: splitted) {
			count++;
		}

		System.out.println("The Length of the word "+name+" is "+ count);
	}

}
