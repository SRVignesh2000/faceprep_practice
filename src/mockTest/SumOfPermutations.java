package mockTest;

import java.util.Scanner;

public class SumOfPermutations {
	
	// faceprep answer
	
//	//Sum of all possible permutations O(logn)
//    static long fac(int n)
//    {
//        long f = 1 ;
//        for(int i = n ; i>1 ; i--)
//            f *= i ;
//        
//        return f ;
//    }
//    
//    public static void main (String[] args) 
//	{
//        int n , temp ;
//        Scanner sc = new Scanner(System.in) ;
//        n = sc.nextInt() ;
//        temp = n ;
//            
//        long p = 1 ;
//        int a , i , sum = 0 ;
//            
//        for(i=0 ; i<n ; i++)
//        {
//            a = sc.nextInt() ;
//            sum += a ;
//        }
//        while(--n!=0)
//            p = p*10 + 1 ;
//            
//        System.out.print(sum*fac(temp-1)*p);
//	}
	
	
	
	// answer from muthuselvan
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 3
		int[] arr = new int[n]; // 1,2,3
		
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i]; // 6
		}
		
		int fact = 1;
		
		for(int i =1; i<=n; i++) {
			fact *= i; // 6
		}
		
		int count = fact / n; // 6/3 = 2;
		
		int finded = sum * count; // 6 * 2 = 12
		
		int totalSum = 0;
		int multiplier = 1;
		
		for(int i=0; i<n; i++) {
			totalSum += finded * multiplier;
			multiplier *= 10;
		}
		
		
//		System.out.println(sum);
//		System.out.println(fact);
//		System.out.println(count);
//		
//		System.out.println(finded);
		System.out.println(totalSum);

	}

}



	

