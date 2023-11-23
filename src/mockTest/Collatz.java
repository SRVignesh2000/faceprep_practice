package mockTest;

public class Collatz {

	public static void main(String[] args) {
		long longestSequenceNumber = 0;
		long maxLength = 0;

		for (long i = 1; i < 20000; i++) {
			long number = i;
			long sequenceLength = 0;

			while (number != 1) {
				if (number % 2 == 0) {
					number /= 2;
				} else {
					number = 3 * number + 1;
				}
				sequenceLength++;
			}

			if (sequenceLength > maxLength) {
				maxLength = sequenceLength;
				longestSequenceNumber = i;
			}
		}

		System.out.println("Number under 20000 with the longest Collatz sequence: " + longestSequenceNumber);
		System.out.println("Length of the longest sequence: " + maxLength);
	}

//	public static void main(String[] args) {
//		long longestSequenceNumber = 0;
//		long maxLength = 0;
//
//		for (long i = 1; i < 20000; i+2) {
//			long number = i;
//			long sequenceLength = 0;
	
	// we don't need to check the even number because odd number only give the maximum count and don't need to check the if condition
//
//			while (number != 1) {
//				
//					number = 3 * number + 1;
//				sequenceLength++;
//			}
//
//			if (sequenceLength > maxLength) {
//				maxLength = sequenceLength;
//				longestSequenceNumber = i;
//			}
//		}
//
//		System.out.println("Number under 20000 with the longest Collatz sequence: " + longestSequenceNumber);
//		System.out.println("Length of the longest sequence: " + maxLength);
//	}

}
