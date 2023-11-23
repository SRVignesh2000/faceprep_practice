package recursion;

public class ReverseArrayElements {

	public static void main(String[] args) {

		int n = 5;
		int[] arr = { 5, 4, 3, 2, 1 };
		String s = "";

		System.out.println(reverse(arr, n - 1, s));

	}

	public static String reverse(int[] arr, int n, String s) {

		if (n >= 0) {
			s += arr[n] + " ";
			return reverse(arr, n - 1, s);
		} else {
			return s;
		}
	}

}
