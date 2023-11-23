package mockTest;

public class FindIndexOfSumOfTwoValuesEqualToTheAns {
	
	/**
	 * one array and ans given
	 * find the index of two elements which gives the answer by adding them
	 * 
	 * input arr = { 10, 25, 34, 48, 50, 51, 60 }   ans=  85;
	 * 
	 * output = index 1 and 6
	 * explanation = by adding 25 and 60 we can get the ans 85. So we return the index of these elements
	 * 
	 * 
	 */

	public static void main(String args[]) {
		int[] arr = { 10, 25, 34, 48, 50, 51, 60 };
		int ans = 85;
		int i = 0;
		int j = arr.length - 1;

		int index1 = -1;
		int index2 = -1;
		
		while (i < j) {

			if (arr[i] + arr[j] == ans) {
				index1 = i;
				index2 = j;
				break;
			}

			if (arr[i] + arr[j] > ans) {
				j--;
			} else {
				i++;
			}

		}

		System.out.println(index1 + " " + index2);

	}

}
