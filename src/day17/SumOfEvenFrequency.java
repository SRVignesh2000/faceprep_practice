package day17;

public class SumOfEvenFrequency {

	public static void main(String[] args) {

		String input = "aaabbaccccdd";

		int sum = 0;

		for (int i = 0; i < input.length() - 1; i++) {
			int count = 0;
			for (int j = i; j < input.length(); j++) {
				if (input.charAt(i) == input.charAt(j)) {
					count++;
				} else {
					i = j - 1;
					break;

				}

			}
			// System.out.println(count);
			if (count % 2 == 0) {
				sum += count;
			}
		}

		System.out.print(sum);
		
		
		
		//method 2 but not correct answer

//		String name = "aaabbaccdddkkk";
//
//		int sum = 0;
//
//		char first = name.charAt(0);
//		int count = 1;
//
//		for (int i = 1; i < name.length()-1; i++) {
//
//			if (first == name.charAt(i)) {
//				count++;
//				System.out.println("count"+count+" "+name.charAt(i));
//				
//			} else {
//				first = name.charAt(i);
//				System.out.println("first"+first);
//				
//				if (count % 2 == 0) {
//					sum += count;
//					System.out.println("sum"+" "+sum);
//					count = 1;
//				} else {
//					count = 1;
//				}
//			}
//		}
//		System.out.println(sum);

	}

}
