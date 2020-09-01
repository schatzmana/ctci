package chapter2;

public class KthToLast {

	public static void main(String[] args) {
		// create 10 new nodes to form a simple linked list
		linkedNode head = new linkedNode();
		linkedNode current = head;

		for (int i=0; i<10; i++) {
			current.data = i;
			current.next = new linkedNode();
			current = current.next;
		}

		int k = 3;
		kthToLast(head, k);
	}

	public static linkedNode kthToLast(linkedNode headNode, int num) {
		/* if size is known:
		int index = (LL.size() - kNum)-1;
		return (String) LL.get(index);
		 */

		// if size is unknown
		int size=0;
		while (headNode.next != null) {
			size++;
		}
		System.out.println("LinkedList size is: " + size);
		int nodeIndexToRetrieve = (size - num);
		
		linkedNode current = headNode;
		for (int i=0; i<=nodeIndexToRetrieve; i++) {
			current = current.next;
		}
		System.out.println( current.data );
		return current;
		
	}
}
