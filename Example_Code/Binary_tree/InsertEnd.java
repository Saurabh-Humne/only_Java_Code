
public class InsertEnd {

	class Node{
		int data;
		Node previous;
		Node next;
		public Node(int data) {
			this.data = data;
		}
	}
	
	Node head, tail = null;
	public void addAtEnd(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = tail = newNode;
			head.previous = null;
			tail.next = null;
		} else {
			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;
			tail.next = null;
		}
	}
	
	public void display() {
		Node current = head;
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Adding a node to the end of the list: ");
		while(current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		InsertEnd dList = new InsertEnd();
		dList.addAtEnd(1);
		dList.display();
		
		dList.addAtEnd(2);
		dList.display();
		
		dList.addAtEnd(3);
		dList.display();
		
		dList.addAtEnd(4);
		dList.display();
		
		dList.addAtEnd(5);
		dList.display();
		
		
	}
}
