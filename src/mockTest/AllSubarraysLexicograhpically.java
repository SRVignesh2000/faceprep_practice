package mockTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AllSubarraysLexicograhpically {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		List<String> arr = new ArrayList<>();
		
		for(int i=0; i<str.length(); i++){
			for(int j=i+1; j<=str.length(); j++){
				arr.add(str.substring(i,j));
			}
		}
		
		Collections.sort(arr);
		
		for(String s : arr){
			System.out.println(s);
		}
		sc.close();
	}
	
	
	// use arraylist because set didn't allow duplicates. eg: banana
	//	b ba ban ..
	//	a an ana ..
	//	n na nan nana ..
	//	a an ana ..

}
