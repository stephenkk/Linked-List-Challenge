
public class TestListLL {
public static void main(String[] args) {
		ListLLtry2 listint = new ListLLtry2();
		
		listint.insertAfter(5);
		listint.insertAfter(4);
		listint.insertBefore(6);
		listint.insertAfter(7);
		
		
		
		
		
		
		
		
		System.out.println(listint.head.next.next.x);
		System.out.println(listint.head.next.next.next.x);
		System.out.println(listint.head.next.next.next.next.x);
		System.out.println(listint.head.next.next.next.next.next.x);
		
		
	}

}
