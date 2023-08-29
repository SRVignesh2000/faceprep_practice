package timeComplexity;

public class LeaderFinder {

	public static void main(String[] args) {
		int[] arr = { 7, 5, 4, 9, 3, 2, 1 };

		for (int i = 0; i < arr.length - 1; i++) {
			int current = arr[i];

			boolean leader = true;

			for (int j = i + 1; j < arr.length; j++) {

				if (current > arr[j]) {
					continue;
				} else {
					leader = false;
					break;
				}
			}

			if (leader) {
				System.out.println(arr[i]);
			}
		}

		System.out.println(arr[arr.length - 1]);
	}
	
	
	
//    public static void main (String[] args) {
//        int[] arr = {7,5,4,9,3,2,1};
//        int n = arr.length;
//        int min = arr[n-1];
//        
//        System.out.println(arr[n-1]);
//        
//        for(int i=n-2; i>=0; i--){
//            
//            if(min < arr[i]){
//                min= arr[i];
//                System.out.println(min);
//            }
//            
//        }
//        
//    }
	
	
}
