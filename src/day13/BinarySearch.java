package day13;

public class BinarySearch {

public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//	   int n = sc.nextInt();
//	 
//	   int[] a = new int[n];
//	   for(int i=0; i<n; i++) {
//		   a[i]=sc.nextInt();
// 	   }
		int [] arr = {1,3,5,7,8,15};
		
		int start=0;
		int end=arr.length-1;
		int mid;
		
		int search=15;
		
		while(start<=end)//0<5
		{
			mid=(start+end)/2;
			
			if(arr[mid]==search)
			{
				System.out.print("Found");
				return;
			}
			
			else if(arr[mid]>search)
			{
				end=mid-1;
			}
			
			else
			{
				start=mid+1;
			}

		}
		
		System.out.print("Not Found");
	}

}
