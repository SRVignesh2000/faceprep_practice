package mockTest;

import java.util.Stack;

public class FindMatchingBrackets {
	
    public static void main(String[] args) {

        char[] brackets1 = {'}', '}', '{', '}', '}', '}'};
        
        //char[] brackets2 = {'{', '}', '}', '{', '{', '}'};
        
        if(brackets1.length%2 == 1){
              System.out.println("Brackets : Not Matching");
              return;
        }
        
        boolean value = false;int count = 0;
        for(int i=0; i<brackets1.length; i++){
            if(brackets1[i] == '{'){
                count++;
            }
            else if(brackets1[i]== '}'){
                if(count > 0){
                    count--;
                }else{
                    value = true;
                    break;
                }
            }
        }
     if(value){
            System.out.println("Brackets : Not Matching");
     }else{
          System.out.println("Brackets : Matching");
     }
    }
    
    // By using stack
	
//    public static boolean isMatchingBrackets(char[] arr) {
//        Stack<Character> stack = new Stack<>();

//
//        for (char bracket : arr) {
//            if (bracket == '{') {
//                stack.push('{');
//            } else if (bracket == '}') {
//                if (stack.isEmpty()) {
//                    return false; // If there's nothing to match with, it's unbalanced
//                }
//                if (stack.peek() == '{') {
//                    stack.pop();
//                } else {
//                    return false; // Mismatched closing bracket
//                }
//            }
//        }
//
//        // If the stack is empty at the end, all brackets matched.
//        return stack.isEmpty();
//    }
//
//    public static void main(String[] args) {
//        char[] bracketArray = {'{', '}', '{', '}', '{', '}'};
//        boolean result = isMatchingBrackets(bracketArray);
//        System.out.println(result); // This will print true
//    }

}
