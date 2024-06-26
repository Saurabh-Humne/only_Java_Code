
public class RemoveDuplicate {

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
		if(head == null){
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
	}
	
	public void removeDuplicate() {
		Node current = head, index = null, temp = null;
		if(head == null) {
			System.out.println("List is empty");
		} else {
			do {
				temp = current;
				index = current.next;
				
			while(index != head) {
				if(current.data == index.data) {
					temp.next = index.next;
				}else {
					temp = index;
				}
				index = index.next;
			}
			current = current.next;
			} while(current.next != head);
		}
	}
	
	public void display() {
		Node current = head;
		if(head == null) {
			System.out.println("List is empty");
		}else {
			do {
				System.out.print(" "+ current.data);
				current = current.next;
			} while(current != head);
			System.out.println();
		}

		}
	
	public static void main(String[] args) {
		RemoveDuplicate cl = new RemoveDuplicate();
		
		cl.add(1);
		cl.add(2);
		cl.add(3);
		cl.add(2);
		cl.add(2);
		cl.add(4);
		
		System.out.println("Original list: ");
		cl.display();
		
		cl.removeDuplicate();
		System.out.println("List after removind duplicates: ");
		cl.display();
	}
	
}
