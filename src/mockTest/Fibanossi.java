package mockTest;

public class Fibanossi {
	
	public static void main(String[] args) {
		
		int n = 10;
		int start = 3;
		int next = 5;
		
		fibanossi(n, start, next);
		
	}
	
	public static void fibanossi(int n, int start, int next) {
		if(n <= 0) {
			return;
		} else {
			int c = start+next;
			start = next;
			next = c;
			System.out.println(c);
			fibanossi(n-1, start, next);
			
		}
		
	}

}
