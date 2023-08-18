package pattern;

public class Diamond {

	public static void main(String args[]) {
		int n = 4;

		String b = "";

		for (int i = 0; i <= n; i++) {

			for (int j = i; j < n; j++) {
				b += ".";
			}

			for (int k = 0; k <= i; k++) {
				b += k + "";
			}

			for (int l = i - 1; l >= 0; l--) {
				b += l + "";

			}

			for (int m = i; m < n; m++) {
				b += ".";
			}

			System.out.println(b);
			b = "";

		}

		for (int j = 0; j < n; j++) {

			for (int m = 0; m <= j; m++) {
				b += ".";
			}

			for (int k = 0; k < n - j; k++) {
				b += k + "";
			}

			for (int l = n - j - 2; l >= 0; l--) {
				b += l + "";
			}

			for (int u = 0; u <= j; u++) {

				b += ".";

			}

			System.out.println(b);
			b = "";

		}

		System.out.println();
		System.out.println();

		int m = 4;
		String s = "";
		int t = m;
		int g = 2;

		for (int i = 0; i < m * 2 - 1; i++) {

			if (i < m) {

				for (int k = 0; k < i; k++) {
					s += ".";
				}

				for (int j = m; j > i; j--) {
					s += t + ".";
				}
				t--;
				System.out.println(s);
				s = "";

			}

			else {

				for (int k = i; k < m * 2 - 2; k++) {
					s += ".";
				}

				for (int j = 2; j < i; j++) {
					s += g + ".";
				}

				System.out.println(s);
				g++;
				// System.out.println("x");
				s = "";
			}

		}

	}

}
