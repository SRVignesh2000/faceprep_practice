package day20;

public class ShopSum {

	public static void main(String[] args) {

		int n = 4;
		int[] arr = { 30, 60, 30, 120 };
		int ru30 = 0;
		int ru60 = 0;
		int ru120 = 0;
		boolean transaction = true;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 30) {
				ru30++;
			} else if (arr[i] == 60) {
				ru60++;
				if (ru30 >= 1) {
					ru30--;
				} else {
					transaction = false;
				}
			} else if (arr[i] == 120) {
				ru120++;
				
				if (ru30 >= 1 && ru60 >= 1) {
					ru30--;
					ru60--;
					
				} else if (ru30 >= 3) {
					ru30--;
					ru30--;
					ru30--;
				} else {
					transaction = false;
				}
			}
		}
		System.out.println(ru30 + " " + ru60 + " "+ ru120);

		if (transaction) {
			System.out.println("Transaction Sucessfull");
		} else {
			System.out.println("Transaction Faliure");
		}

	}

}
