
public class MinMax {

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
	
	public void minNode() {
		Node current = head;
		
		int min = head.data;
		if(head == null) {
			System.out.println("List is empty");
		} else {
			do {
				if(min > current.data) {
					min = current.data;
				}
				current = current.next;
			}while (current != head);
			System.out.println("Minimum value node in the list: "+ min);
		}
	}
	
	public void maxNode() {
		Node current = head;
		int max = head.data;
		if(head == null) {
			System.out.println("list is empty");
		} else {
			do {
				if(max < current.data) {
					max = current.data;
				}
				current = current.next;
			} while (current != head);
			System.out.println("Maximun value node in the list: "+ max);
		}
	}
	
	public static void main(String[] args) {
		MinMax cl = new MinMax();
		cl.add(5);
		cl.add(20);
		cl.add(10);
		cl.add(1);
		
		cl.minNode();
		cl.maxNode();
		
	}
}
