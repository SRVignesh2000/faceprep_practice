package recursion;

public class SumOfnNaturalNumbers {
	
	public static void main(String[] args) {
		
		int n = 6;
		
		int ans = natural(n);
		System.out.println(ans);
		
	}
	
	public static int natural(int n) {
		if(n > 0) {
			return n + natural(n-1);
		} else {
			return 0;
		}
	}

}
