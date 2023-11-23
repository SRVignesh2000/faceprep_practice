package mockTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FindHouseNumbers {
	
	// They gave two arrays house numbers and house position.
	// First sort the house position and then change the numbers as per position
	// then find the position difference which have large difference
	
	public static void main(String args[]){
   	    Scanner sc = new Scanner(System.in);
		
        int n = sc.nextInt();
        int[] arrNum = new int[n];
        int[] arrPos = new int[n];
        
        for(int i=0; i<n; i++){
            arrNum[i] = sc.nextInt();
        }
        
        for(int i=0; i<n; i++){
            arrPos[i] = sc.nextInt();
        }
        
        Map<Integer, Integer> mapHouse = new TreeMap<>();
        
        for(int i=0; i<n; i++){
            mapHouse.put(arrNum[i], arrPos[i]);
        }
        
        int maxPos = 0;
        int x = 0;
        int y = 0;
        
        List<Integer> keys = new ArrayList<>(mapHouse.keySet());
        
        for(int i=0; i<n-1; i++){
            
            int ans = mapHouse.get(keys.get(i+1)) - mapHouse.get(keys.get(i));
            
            if(maxPos < ans){
                maxPos = ans;
                x = keys.get(i);
                y = keys.get(i+1);
            }
            
        }
        
        System.out.println(x);
        System.out.println(y);

	}

}
