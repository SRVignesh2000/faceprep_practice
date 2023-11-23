package mockTest;

import java.util.Arrays;

public class MultiplyTwoStrings {

	public static void main(String[] args) {

		String str1 = "12";
		String str2 = "12";

		String product = multiply(str1, str2);
		System.out.println(product);

	}

	public static String multiply(String str1, String str2) {

		int len1 = str1.length();
		int len2 = str2.length();

		int[] result = new int[len1 + len2];

		for (int i = len2 - 1; i >= 0; i--) {

			int n = str2.charAt(i) - '0';

			for (int j = len1 - 1; j >= 0; j--) {

				int m = str1.charAt(j) - '0';

				int mul = n * m;
				int sum = mul + result[i + j + 1];

				result[i + j + 1] = sum % 10;
				result[i + j] += sum / 10;
			}
		}
		
		System.out.println(Arrays.toString(result));

		StringBuilder sb = new StringBuilder();
		for (int digit : result) {
			if (!(sb.length() == 0 && digit == 0)) {
				sb.append(digit);
			}
		}
		
		return sb.length() == 0 ? "0" : sb.toString();

	}

}
