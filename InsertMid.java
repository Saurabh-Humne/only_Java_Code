
public class InsertMid {

	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public int size;
	
	public Node head = null;
	public Node tail = null;
	
	public void addNode(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}
	
	public void addInMid(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
		} else {
			Node temp, current;
			int count = (size%  2 == 0)? (size/2):((size+1)/2);
			temp = head;
			current = null;
			
			for(int i = 0; i < count; i++) {
				current = temp;
				temp = temp.next;
			}
			
			current.next = newNode;
			newNode.next = temp;
		}
		size++;
	}
	
	public void display() {
		Node current = head;
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		
		while(current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();

	}
	
	public static void main(String[] args) {
		InsertMid sList = new InsertMid();
		
		sList.addInMid(1);
		sList.addInMid(2);
		
		System.out.println("Original list: ");
		sList.display();
		
		sList.addInMid(3);
		System.out.println("Updated List: ");
		sList.display();
		
		sList.addInMid(4);
		System.out.println("Updated List: ");
		sList.display();
	}
}
