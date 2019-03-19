

	
	public class Node{
		public int x;
		Node next;
		
		public Node(int x, Node next) {
			this.x = x;
			this.next = next;				
	}
/*		
		public static class QueueInt{
			Node front = null;
			Node back = null;
		
		
		public boolean isEmpty() {
			return front == null;
		}
		
		
		public Node front() {
			return front;
		}
		
		public void enqueue(int x) {
			
			if (back != null)
				back = null;
		
			back.next = new Node(x, null);
	
			back = back.next;
			
		}
		
		public void dequeue() {
			front = front.next;
		}
		
		
		}
		public static void main(String[] args) {
			QueueInt queue = new QueueInt();
			
			queue.enqueue(7);
			//queue.enqueue(5);
			//queue.enqueue(11);
			
			System.out.println(queue.front.x);
		}
	/*	
		public static class StackIntLL{
			Node top = null;
			
			public boolean isEmpty() {
				if (top == null)
				return true;
				else return false;	
			}
			
			public Node top() {
				return top;
			}
			
			public void push(int x) {
				top = new Node (x, top);
			}
			
			public void pop() {
				
				 top = top.next;
				
			}
			
			
		}
		
		public static void main(String[] args) {
			
			StackIntLL stack = new StackIntLL();
			stack.push(18);
			stack.push(3);
			stack.push(9);
			
			
			
			while (!stack.isEmpty())
			{System.out.println(stack.top.x);
			stack.pop();
			}
			
		}*/
		
}
	