package mockTest;

import java.util.Scanner;

public class TimeSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputTime = scanner.next();
		
		int hh = Integer.parseInt(inputTime.split(":")[0]);
		int mm = Integer.parseInt(inputTime.split(":")[1]);
		
		int totalMinutes = hh * 60 + mm;
		int requiredTime = 0;
		
		while (true) {
			
			totalMinutes = (totalMinutes + 1) % (24 * 60);
			
			int hours = totalMinutes / 60;
			int minutes = totalMinutes % 60;
			
			int reverseMinutes = (hours % 10) * 10 + (hours / 10); // (2 % 10) * 10 + (2/10) = 20
			
//			System.out.println(reverseMinutes);
			
			if (reverseMinutes == minutes) {
//				requiredTime++;
				break;
			}
			
			requiredTime++;
		}
		System.out.println(requiredTime+1);
	}
	
	

//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		String str = s.next();
//		int hh, mm;
//		hh = (str.charAt(0) - 48) * 10 + (str.charAt(1) - 48);
//		mm = (str.charAt(3) - 48) * 10 + (str.charAt(4) - 48);
//		
//		System.out.println(hh);
//		System.out.println(mm);
//		
//		int requiredTime = 0;
//		while (hh % 10 != mm / 10 || hh / 10 != mm % 10) {
//			++mm;
//			if (mm == 60) {
//				mm = 0;
//				++hh;
//			}
//			if (hh == 24)
//				hh = 0;
//			++requiredTime;
//		}
//		System.out.print(requiredTime);
//	}

}
