package day22;

public class NotFiveAndAboveNumbers {

	public static void main(String[] args) {

		int start = 1;
		int end = 4300;
		int count = 0;

		for (int i = start; i <= end; i++) {
			String number = i + "";
			if (number.contains("5") || number.contains("6") || number.contains("7") || number.contains("8")
					|| number.contains("9")) {
				continue;
			} else {
				count++;
			}
		}

		System.out.println(count);

	}

}
