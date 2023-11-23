package search;

public class BinarySearch {

	public static boolean binarySearch(int[] arr, int start, int end, int num) {

		if (start <= end) {

			int mid = (start + end) / 2;

			if (arr[mid] == num) {

				System.out.println("Num found");
				return true;

			}

			if (arr[mid] < num) {

				start = mid + 1;

				binarySearch(arr, start, end, num);

			} else {

				end = mid - 1;

				binarySearch(arr, start, end, num);
			}

		}

		return false;
	}

	public static void main(String args[]) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int num = 2;
		int start = 0;
		int end = arr.length - 1;

		binarySearch(arr, start, end, num);

	}
	
	
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Read the size of the array
//        int n = scanner.nextInt();
//
//        // Read the elements of the sorted array
//        int[] array = new int[n];
//        for (int i = 0; i < n; i++) {
//            array[i] = scanner.nextInt();
//        }
//
//        // Read the element to search
//        int searchElement = scanner.nextInt();
//
//        // Perform binary search and find the result
//        int result = binarySearch(array, searchElement);
//
//        // Print the result
//        System.out.println(result);
//
//        scanner.close();
//    }
//
//    public static int binarySearch(int[] array, int target) {
//        int left = 0;
//        int right = array.length - 1;
//
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//
//            if (array[mid] == target) {
//                return 1; // Element found
//            } else if (array[mid] < target) {
//                left = mid + 1; // Move search to the right half
//            } else {
//                right = mid - 1; // Move search to the left half
//            }
//        }
//
//        return 0; // Element not found
//    }

}
