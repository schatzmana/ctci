package chapter2;

public class DeleteMiddleNode {

	public static void main(String[] args) {
		// Given access to any middle node in a linked list, delete it from the linked list

		// create 10 new nodes to form a simple linked list
		linkedNode head = new linkedNode();
		linkedNode current = head;

		for (int i=0; i<10; i++) {
			current.data = i;
			current.next = new linkedNode();
			current = current.next;
		}
		
		current = head;
		for (int i=0; i<5; i++) {
			current = current.next;
		}
		
		deleteNode(current);
	}
	
	public static void deleteNode(linkedNode middleNode) {
		// to maintain the list & delete the middleNode, we need the previous node pointing to the next node
		
		// Retrieving the data of the following node
		linkedNode next = middleNode.next;
		int nextData = next.data;
		linkedNode nextToNext = next.next;
		
		// setting the middleNode to the nextNode's data, thereby erasing the middleNode while actually deleting the next node
		middleNode.data = nextData;
		middleNode.next = nextToNext;	
	}

}
