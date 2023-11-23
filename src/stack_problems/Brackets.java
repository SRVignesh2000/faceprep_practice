package stack_problems;

public class Brackets {
	
	public static boolean areBracketsBalanced(String s) {
		
		java.util.Stack<Character> stack = new java.util.Stack<>();
		
		for(int i=0; i<s.length(); i++) {
			char x = s.charAt(i);
			
			if(x == '(' || x == '{' || x == '[') {
				stack.push(s.charAt(i));
				continue;
			}
			
			if(stack.isEmpty()) {
				return false;
			}
			
			char check;
			switch (x) {
			
			case ')':
				check = stack.pop();
				if(check == '{' || check == '[') {
					return false;
				}
				break;
				
			case '}':
				check  = stack.pop();
				if(check == '(' || check == '[') {
					return false;
				}
				break;
				
			case ']':
				check = stack.pop();
				if(check == '(' || check == '{') {
					return false;
				}
				break;
			
			}
		}
		return (stack.isEmpty());
		
	}

	public static void main(String[] args) {
	
		String expr = "([{}])";
		 
        // Function call
        if (areBracketsBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");

	}

}
