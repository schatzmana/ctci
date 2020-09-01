package chapter2;

import java.util.HashMap;

public class RemoveDupes {

	public static void main(String[] args) {
		linkedNode head = new linkedNode();
		linkedNode current = head;
		
		// make a simple 10 node linkedList
		for (int i=0; i<10; i++) {
			if (i==2) {
				current.data = 1;
			}
			else {
				current.data = i;
			}
			current.next = new linkedNode();
			current = current.next;
		}	
	}

	public static linkedNode removeDupes(linkedNode node) {

		/*
		 * go through nodes (what data types are they??? - assuming int for now...)
		 * at each node, lookup value, 
		 * if null, it's new so store the value 
		 * if not, it's a dupe. Remove it
		 */

		HashMap<Integer, Integer> nodeValues = new HashMap<Integer, Integer>();
		linkedNode prev = node;
		linkedNode dupeNext;
		
		while (node.next != null) {
			if ( nodeValues.containsValue(node.data) ) { //duplicate Node value found
				// remove this node
				// point previous node.next to the currentnode.next in order to remove the duplicate node
				dupeNext = node.next;
				prev.next = dupeNext;
			}
			else { // note dupe, so add to hashmap
				nodeValues.put( (node.data *100) , node.data);
			}
			prev = node;	
		}
		
		return node;

		/*
		int totalNodes = l.size();
		
		//iterate through nodes
		for (int i=0; i<totalNodes; i++) {
			currentVal = l.get(i);
			if (  nodeValues.containsValue( currentVal ) ) {	// duplicate found
				l.remove(i);
			}
			else { 	// not a dupe, so add to hashmap
				nodeValues.put(i, currentVal); //using index of linkedlist for Key, since that is a unique characteristic
			}
		}
		return l;
		*/ 
		
		/* Iterate through LinkedList
				System.out.println("ListIterator Approach: ==========");
				ListIterator<String> listIterator = l.listIterator();
				while (listIterator.hasNext()) {
					System.out.println(listIterator.next());

				}
		 */
	}
}
