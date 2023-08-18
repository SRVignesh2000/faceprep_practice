package day21;

public class HCF {

	public static int hcf(int x, int y, int d) {

		if (x % d == 0 && y % d == 0) {

			return d;

		} else {
			return hcf(x, y, d - 1);

		}


	}

	public static void main(String args[]) {
		int x = 28;
		int y = 92;

		System.out.println(hcf(x, y, x > y ? y : x));
	}

	
	
//	public static int HCF(int n, int m) {
//
//		if (m == 0) {
//			return n;
//		}
//		return HCF(m, n % m);
//
//	}
//
//	public static void main(String[] args) {
//		int n = 14;
//		int m = 18;
//
//		System.out.println(HCF(n, m));
//
//	}

}
