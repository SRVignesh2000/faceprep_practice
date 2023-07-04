package day06;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = {"Sivakarthikeyan", "Naani", "Ramcharan", "Sharukkhan"};
		
		// for loop
		for(int i=0; i<arr.length; i++) {
			System.out.println("forLoop" + " " + arr[i]);
		}
		
		
		// while loop
		int i = 0;
		while(i<arr.length) {
			System.out.println("while loop" + " " + arr[i]);
			i++;
		}
		
		
		// do while loop
		int s =0;
		do {
			System.out.println("do while" + " " + arr[s]);
			s++;
		} while (s<arr.length);
		
		
		//for each
		for(String m:arr) {
			System.out.println("forEach" + " " + m);
		}

	}

}
