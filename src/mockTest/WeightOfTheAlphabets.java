package mockTest;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class WeightOfTheAlphabets {
	
//	public static void main(String[] args) {
//		
//		int weight = 5;
//		List<BigInteger> arr = new ArrayList<>();
//		int prev = 1;
//		arr.add(BigInteger.valueOf(prev));
//		
//		for(int i=1; i<26; i++) {
//			int k =  (i+1)*prev+prev;
//			arr.add(BigInteger.valueOf(k));
//			prev = k;
//			
//		}
//		
//		int ans = 0;
//		char[] alpha = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
//		
//		List<Character> answer = new ArrayList<>();
//		
//		boolean flag = true;
//		int j = 25;
//		
//		while(flag) {
//			if(ans == weight) {
//				flag = false;
//			}else if(arr.get(j).intValue() <= weight) {
//				if((arr.get(j).intValue()+ans) <= weight) {
//					ans += arr.get(j).intValue();
//					answer.add(alpha[j]);
//				} else {
//					j--;
//				}
//			} else {
//				j--;
//			}
//			if (j < 0) {
//                flag = false; // Prevent infinite loop
//            }
//		}
//		
//		Collections.sort(answer);
//		for(int i=0; i<answer.size(); i++) {
//			System.out.print(answer.get(i));
//		}
//		
//	
//
//	}
	
	// perfect answer
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        Map<Character, Integer> lexi = new HashMap<>();
        int i = 1, k = 1;
        
        for (char wr = 'a'; wr <= 'z'; wr++) {
            int value = i;
            k++;
            lexi.put(wr, value);
            i = (k * value) + value;
        }
        
        System.out.println(lexi);
        
        List<Integer> values = new ArrayList<>(lexi.values());
        List<Character> keys = new ArrayList<>(lexi.keySet());
        
        String name = "";
        
        for (int o = keys.size() - 1; o >= 0; o--) {
        	
            if (values.get(o) <= weight) {
                int count = weight / values.get(o);
                for (int j = 0; j < count; j++) {
                    name += keys.get(o);
                }
                weight %= values.get(o);
            }
        }
        System.out.println(name);
    }

}
