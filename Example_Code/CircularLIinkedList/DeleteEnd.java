
public class DeleteEnd {

	public class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
		}
	}
	
	public Node head = null;
	public Node tail = null;
	
	public void add(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
			newNode.next = head;
		} else {
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
	}
	
	public void deleteEnd() {
		if(head == null) {
			return;
		} else {
			if(head != tail) {
				Node current = head;
				while (current.next != tail) {
					current = current.next;
				}
				
				tail = current;
				tail.next = head;
			}
			else {
				head = tail = null;
			}
		}
	}
	
	public void display() {
		Node current = head;
		if(head == null) {
			System.out.println("List is empty");
		} else {
			do {
				System.out.print(" " + current.data);
				current = current.next;
			} while (current != head);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		DeleteEnd cl = new DeleteEnd();
		
		cl.add(1);
		cl.add(2);
		cl.add(3);
		cl.add(4);
		
		System.out.println("Original List");
		cl.display();
		
		while(cl.head != null) {
		cl.deleteEnd();
		System.out.println("Updeted List: ");
		cl.display();
		}
	}
}
