package mockTest;

import java.util.Scanner;

public class ZigZag {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int upper = 0, lower = 0, diagonal = 0;
		
		for(int i=0; i<n; i++) {
			upper += arr[0][i];
			lower += arr[n-1][i];
			
			if(i != n-1 && i != 0) {
				diagonal += arr[i][n-1-i];
			}
			
		}
		
		
		System.out.println(upper + lower + diagonal);
		
		sc.close();
		
	}
	
//	public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int arr[][] = new int[n][n];
//        for(int i=0;i<n; i++){
//            for(int j=0; j<n; j++)
//            arr[i][j] = sc.nextInt();
//        }
//        int upper = 0, lower = 0, sum = 0, diagnol = 0;
//        
//        for(int i=0; i<n; i++){
//            
//            upper +=arr[0][i];
//            lower +=arr[n-1][i];
//            
//            if(i != 0 && i !=n-1){
//                diagnol +=arr[i][n-1-i];
//            }
//        }
//        sum = lower+upper+diagnol;
//        System.out.print("sum " + sum);
//    }

}
