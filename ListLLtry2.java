
public class ListLLtry2 {
	 final Node tail = new Node(-4, null);
	 Node current = tail;
	 Node prev = new Node(-2, current);
	 final Node head = new Node(-1, prev);
	 
	
	public void insertBefore(int x) {
		 prev.next = new Node (x, current);
			current = prev.next;
	}
	
	public void insertAfter(int x) {
		if (prev.next == tail) 
			insertBefore(x);
		else { 
			current.next = new Node(x, current.next);
			current = current.next;
			prev = prev.next;
		}
	}
		
	
}





