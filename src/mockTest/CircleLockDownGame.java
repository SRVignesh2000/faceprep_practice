package mockTest;

import java.util.*;

public class CircleLockDownGame {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		String song = sc.next().toLowerCase();
//
//		List<Integer> people = new ArrayList<>();
//
//		for (int i = 1; i <= n; i++) {
//			people.add(i);
//		}
//
//		int j = 0;
//		int i = 0;
//		
//		while(true) {
//
//			if (people.size() == 1) {
//				System.out.println(people.get(0));
//				break;
//			}
//
//			if (i > song.length() - 1) {
//				i = 0;
//			}
//			
//			if (j > people.size() - 1) {
//				j = 0;
//			}
//
//			if (song.charAt(i) == 'x') {
//				j++;
//				i++;
//				
//			} else {
//				people.remove(j);
//				i++;
//			}
//
//		}
		
		
		int n = 6;
        String song = "xxyyxyx";
        
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(i+1);
        }
        
        int i=0;
        int j=song.length();
        
        while(arr.size() != 1){
        	
            if(song.charAt(j%song.length()) == 'x'){
                i++;
            }
            else{
                arr.remove(i);
            }
            j++;
            
            if(i == arr.size()){
                i=0;
            }
        }
         System.out.println(arr.get(0));

	}

}
