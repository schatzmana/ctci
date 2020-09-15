package chapter3;

public class StackNode {
	int data;
	StackNode next = null; //going from top of stack to bottom
	
	public static void main(String[] args) {
		// Last In, First Out
		StackNode plate = new StackNode();

		for (int i=0; i<10; i++) {
			plate.data = i;
			if ((i+1) <10) {
				plate.push(i+1);
			}
			System.out.println(plate.data + ", ");
		}
		System.out.println("top: " + top.peek() );
		top.pop();
		System.out.println("top: " + top.peek() );
		top.push(22);
		System.out.println("top: " + top.peek() );
		System.out.println(top.isEmpty() );

	}
	public StackNode() {
	}
	
	public StackNode(int datas) {
		this.data = datas;
	}

	private static StackNode top;

	public StackNode pop(){
		if (top == null) {
			System.out.println("ERROR: Top does not exist");
			// @TO-DO: throw error
		}
		// store current top, make Top.next the new top, return stored top
		StackNode poppedTop = top;
		top = top.next;
		return poppedTop;
	}

	public void push(int data){
		// create new StackNode & make its next the current Top
		StackNode newTop = new StackNode();
		newTop.data = data;
		newTop.next = top;

		// replace the old top with the new top
		top = newTop;
	}

	public int peek(){
		if (top == null) {
			System.out.println("ERROR: Top does not exist");
			// @TO-DO: throw error
		}
		return top.data;
	}

	public boolean isEmpty(){
		return (top == null);
	}
}
