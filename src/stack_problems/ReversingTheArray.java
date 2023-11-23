package stack_problems;

class Stack{
	
	int top;
	int size;
	int[] a;
	
	boolean isEmpty() {
		return (top < 0);
	}
	
	Stack(int n){
		top = -1;
		size = n;
		a = new int[size];
	}
	
	boolean push(int x) {
		
		if(top >= size) {
			System.out.println("Stack Overflow");
			return false;
		} else {
			a[++top] = x;
			return true;
		}
		
	}
	
	
	int pop() {
		
		if(isEmpty()) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			int x = a[top--];
			return x;
		}
	}
	
	
}

public class ReversingTheArray {
	
	public static void reverse(int[] a, int n) {
		
		Stack stack = new Stack(n);
		
		for(int i=0; i<n; i++) {
			stack.push(a[i]);
		}
		
		for(int j=0; j<n; j++) {
			a[j] = stack.pop();
			
		}
		
		for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
		
	}

	public static void main(String[] args) {
		
		int n = 4;
		 
        // Create a new array
        int[] a = new int[] { 100, 200, 300, 400 };
 
        // Call reverse method
        reverse(a, n);

	}

}
