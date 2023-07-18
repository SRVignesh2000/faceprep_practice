package day14;

import java.util.Arrays;

public class ClassExercise {
	
	
	
	public boolean change(String[] part) {
		
		String[] checking = new String[part.length];
		
		for(int j=part.length - 1; j >= 0; j--) {
			
			checking[part.length-1-j] = part[j];
			
		}
		
		String delimiter = "";
		String joinedString = String.join(delimiter, checking);
		String partString = String.join(delimiter, part);
		
		if(joinedString.equals(partString)) {
			
			return true;
		}else {
			
			System.out.print(partString+" ");
			return false;
		}
		
	}

	public static void main(String[] args) {
		
		String name = "he knowns malayalam and tamil";
		
		String[] lowerCase = name.toLowerCase().split(" ");
		
		String[] newName = new String[lowerCase.length];
		
		
		
		for(int i=0; i<lowerCase.length; i++) {
			
			String[] part = lowerCase[i].split("");
			
			ClassExercise exercise = new ClassExercise();
			
			boolean status = exercise.change(part);
			
			if(status) {
				continue;
			} else {
				newName[i] = part.toString();
			}
		}
			
	}

}


