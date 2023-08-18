package day30;

import java.util.*;

public class UniqueSymbolsSetofCards {

	public static void main(String args[]) {
		// type your code here
		Scanner sc = new Scanner(System.in);
		TreeMap<Character, Character> mapArr = new TreeMap<>();
		ArrayList<Character> numArr = new ArrayList<Character>();
		HashSet<Character> distinctArr = new HashSet<Character>();

		while (sc.hasNext()) {
			char ch = sc.next().charAt(0);
			numArr.add(ch);
		}

		for (Character ch : numArr) {
			if (Character.isLetter(ch)) {
				distinctArr.add(ch);
			}
		}

		ArrayList<Character> distinctArr2 = new ArrayList<Character>(distinctArr);
		ArrayList<Character> newArr = new ArrayList<Character>(distinctArr);

		int length = distinctArr2.size();
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < numArr.size(); j++) {
				if (distinctArr2.get(i) == numArr.get(j)) {
					mapArr.put(distinctArr2.get(i), numArr.get(j + 1));
					break;
				}
			}
		}

		System.out.println("Four symbols gathered in " + numArr.size() / 2 + " cards.");
		System.out.println("Cards in Set are :");
		for (Map.Entry<Character, Character> entry : mapArr.entrySet()) {
			Character key = entry.getKey();
			Character value = entry.getValue();
			System.out.println(key + " " + value);
		}

	}

//	public static void main(String args[]) {
//		Scanner scan = new Scanner(System.in);
//		HashMap<String, Integer> ans = new HashMap<>();
//		HashSet<String> uniqueKeys = new HashSet<>();
//		int count = 0;
//		while (scan.hasNext()) {
//			String key = scan.next();
//			int value = scan.nextInt();
//			count++;
//			if (!uniqueKeys.contains(key)) {
//				ans.put(key, value);
//				uniqueKeys.add(key);
//			}
//		}
//		System.out.println("Four symbols gathered in " + (count) + " cards.\nCards in Set are :");
//		Map<String, Integer> sortedMap = new TreeMap<>(ans);
//		for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}
//	}
}
