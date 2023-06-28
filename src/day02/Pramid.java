package day02;

public class Pramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 6;
			
		for(int i=num; i>=1; i--) {
		
			// for space
			for(int j=i; j>1; j--) {
				System.out.print(" "+" ");
			}
		
			// number
			for(int k=i; k<num; k++) {
				System.out.print(k+" ");
			}
		
			// zero
			System.out.print(0+" ");
		
			// next number
			for(int l=num-1; l>=i; l--) {
				System.out.print(l+" ");
			}
//			
//			// next space
//			for(int m=i; m>1; m--) {
//				System.out.print("."+" ");
//			}
//			
			System.out.print("\n");
	
		}
	}

}
