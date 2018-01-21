package SingleLinkedList;

public class SingleLinkedTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LinkedList ls = new LinkedList();
		ListNode node = new ListNode(20);
		ls.inserAtBegining(node);
		node = new ListNode(30);
		ls.insertAtEnd(node);
		node = new ListNode(40);
		ls.insertAtEnd(node);
		node = new ListNode(50);
		ls.insertAtEnd(node);
		node = new ListNode(60);
		ls.insertAtEnd(node);
		node = new ListNode(10);
		ls.inserAtBegining(node);
		System.out.println(ls.toString());
		ls.deleteAtbegining();
		System.out.println(ls.toString());
		ls.deleteAtbegining();
		System.out.println(ls.toString());
		ls.deleteAtEnd();
		System.out.println(ls.toString());
		ls.deleteAtEnd();
		System.out.println(ls.toString());
		ls.deleteAtEnd();
		System.out.println(ls.toString());
		ls.insert(20, 0);
		System.out.println(ls.toString());
		ls.insert(5, 0);
		System.out.println(ls.toString());
		ls.insert(25, 2);
		System.out.println(ls.toString());
		ls.insert(35, 4);
		System.out.println(ls.toString());
		ls.remove(0);
		System.out.println(ls.toString());
		ls.remove(2);
		System.out.println(ls.toString());
		ls.remove(2);
		System.out.println(ls.toString());
		ls.removeMached(25);
		System.out.println(ls.toString());
		System.out.println("Position :" + ls.getPosition(30));
		System.out.println("length :" + ls.lenght());

	}

}
