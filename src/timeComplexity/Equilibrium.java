package timeComplexity;

public class Equilibrium {

//	public static void main(String[] args) {
//		int n = 6;
//		int[] a = { 5, 3, 2, 2, 6, 0 };
//		int max = 0;
//
//		for (int i = 0; i < n; i++) {
//
//			int sum_l = 0;
//			int sum_r = 0;
//			
//
//			int center = i;
//
//			for (int j = 0; j <= i; j++) {
//
//				sum_l += a[j];
//
//			}
//			for (int k = i; k <= n - 1; k++) {
//
//				sum_r += a[k];
//			}
//
//			if (sum_l == sum_r) {
//				max = sum_l;
//			}
//			
//		}
//
//		System.out.println(max);
//		
//	}
	
	
	public static void main(String[] args) {
		int n = 6;
		int[] a = { 5, 3, 2, 2, 6, 0 };
		int max = 0;
		int s = 0;
		int p = 0;
		
		for(int i=0; i<n; i++) {
			s+= a[i];
		}
		
		for(int i=0; i<n; i++) {
			p += a[i];
			if(p ==s) {
				max = p;
			}
			s -= a[i];
		}
		
		System.out.println(max);
		
	}
	
	
	
	
	

}
