
public class TestListLL {
public static void main(String[] args) {
		ListLL listint = new ListLL();
		
		listint.insertAfter(5);
		listint.insertBefore(6);
		listint.insertAfter(4);
		
		listint.insertBefore(7);
		
		
		
		
		
		System.out.println(listint.head.next.x);
		System.out.println(listint.head.next.next.x);
		System.out.println(listint.head.next.next.next.x);
		System.out.println(listint.head.next.next.next.next.x);
		
		
	}

}
