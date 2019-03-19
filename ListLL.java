
public class ListLL {
	
	 final Node tail = new Node(-2, null);
	 final Node head = new Node(-1, tail);
	 Node current = tail;
	Node prev = head;
	
	
	public void insertBefore(int x) {
		if (head.next == tail) {
			head.next = new Node(x, current);
			current = head.next;
		}
		else
		{ prev.next = new Node (x, prev.next);
			current = prev.next;
		}
	}
	
	public void insertAfter(int x) {
		if (head.next == tail) {
			head.next = new Node(x, current);
			current = head.next;
		} 
		else {
			current.next = new Node(x, current.next);
			current = current.next;
			prev = prev.next;
		}
	
	}
		
	
}


