package node;

class Node {

	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		next = null;
	}

}

public class CurrentList {

	private static Node head = null, temp = null;

	/**
	 * Insert a new data
	 * @param data
	 */
	void insert(int data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			temp = newNode;
		} else {
			temp.next = newNode;
			temp = newNode;
		}

	}
	
	/**
	 * 
	 */
	void print() {
		
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		
	}
	
	/**
	 * 
	 * @param data
	 */
	void front(int data) {
		
		Node newNode = new Node(data);
		
		newNode.next = head;
		head = newNode;
		
	}
	
//	void insert(int index,int data) {
//		if(index < 0) {
//			System.out.println("Invalid index");
//		} else {
//			
//		}
//	}
	
	
	

	public static void main(String[] args) {

		
		CurrentList list = new CurrentList();
		
		list.insert(5);
		list.insert(9);
		list.insert(4);
		
		list.print();
		list.front(6);
		list.print();
		
	}

}
