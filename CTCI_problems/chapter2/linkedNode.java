package chapter2;

public class linkedNode {
	int data;
	linkedNode next = null;
	//linkedNode prev;

	public static void main(String[] args) {
		// create 10 new nodes to form a simple linked list
		linkedNode head = new linkedNode();
		linkedNode current = head;
		
		for (int i=0; i<10; i++) {
			current.data = i;
			current.next = new linkedNode();
			current = current.next;
		}
		
		/*
		 * for (int i=0; i<10; i++) {
		 * System.out.println();
		 * }
		 */
			

	}

}
