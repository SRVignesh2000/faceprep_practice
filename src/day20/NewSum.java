package day20;

import java.util.Scanner;

public class NewSum {

	public static void main(String[] args) {


		//method 1
//	      int[] a = {10,98,3,33,12,22,21,11};
//	      int n=8;
//	      int l = 0;
//	      int r = n-1;
//	      int temp = 0;
//	      
//	      while(l<r) {
//	          
//	          while(a[l] % 2 == 0) {
//	              l++;
//	          }
//	          while(a[r] % 2 !=0) {
//	              r--;
//	          }
//	          temp = a[l];
//	          a[l] = a[r];
//	          a[r] = temp;
//	          l++;
//	          r--;
//	          
//	      }
//	      
//	        for(int i =0; i<a.length; i++) {
//	            System.out.println(a[i]);
//	        
//	        }
		
		
		// method -2 
//		Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++)
//            arr[i] = sc.nextInt();
//
//        int val1 = 0, val2 = n - 1;
//
//        while (val1 < val2) {
//            while (arr[val1] % 2 == 0 && val1 < val2){
//                val1++;
//            }
//
//            while (arr[val2] % 2 != 0 && val1 < val2){
//                val2--;
//            }
//
//            if (val1 < val2) {
//                int num = arr[val1];
//                arr[val1] = arr[val2];
//                arr[val2] = num;
//                val1++;
//                val2--;
//            }
//        }
//
//        for (int i = 0; i < n; i++)
//            System.out.print(arr[i] + " ");
        
        
        
        // method - 3
        int[] a = {23, 11, 26, 75, 42, 15};
        int b = 0;
        int c = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = a.length-1; j > i; j--){
                if(a[i]%2==1){
                    if(a[j]%2 == 0){
                        b = a[i];
                        c = a[j];
                        a[i] = c;
                        a[j] = b;
                        break;
                    }
                }
            }
            System.out.println(a[i]);
        }

	}

}
