package search;

public class TernarySearch {

	public static int c = 0;

	public static int search(int[] a, int t) {
		int start = 0;
		int end = a.length - 1;
		while (start <= end) {
			c++;
			int m1 = start + (end - start) / 3;
			int m2 = end - (end - start) / 3;
			if (a[m1] == t) {
				return m1;
			} else if (a[m2] == t) {
				return m2;
			} else if (a[m1] > t) {
				end = m1 - 1;
			} else if (a[m2] < t) {
				start = m2 + 1;
			} else {
				start = m1 + 1;
				end = m2 - 1;
			}
		}
		return -1;
	}

	public static void main(String args[]) {
		int[] x = new int[500000];
		for (int i = 0; i < x.length; i++) {
			x[i] = i + 1;
		}
		System.out.println(search(x, 493456) + " count : " + c);
	}

}
