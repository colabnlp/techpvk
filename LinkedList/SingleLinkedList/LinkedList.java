package SingleLinkedList;

public class LinkedList {

	ListNode head;
	private int length;

	public LinkedList() {
		length = 0;
	}

	public synchronized ListNode getHead() {

		return head;
	}

	public synchronized void inserAtBegining(ListNode node) {

		node.setNext(head);
		head = node;
		length++;

	}

	public synchronized void insertAtEnd(ListNode node) {
		ListNode tmp = head;
		do {
			if (tmp.getNext() == null) {
				tmp.setNext(node);
				node.setNext(null);
				length++;
				break;
			}
			tmp = tmp.getNext();
		} while (tmp != null);

	}

	public synchronized void deleteAtbegining() {

		if (head == null)
			return;
		if (head.getNext() == null) {
			head = null;
			return;
		}
		head = head.getNext();
		length--;

	}

	public synchronized void deleteAtEnd() {

		if (head == null)
			return;
		if (head.getNext() == null) {
			head = null;
			return;
		}

		ListNode tmp = head;
		ListNode prev = null;
		do {

			if (tmp.getNext() == null) {
				prev.setNext(null);
				length--;
			}
			prev = tmp;
			tmp = tmp.getNext();
		} while (tmp != null);

	}

	public synchronized void insert(int data, int position) {

		if (position < 0 || position > length)
			return;
		if (position == 0) {

			ListNode newNode = new ListNode(data);
			newNode.setNext(head);
			head = newNode;
			length++;
			return;

		}

		int i = 1;
		for (ListNode node = head; node != null; node = node.getNext()) {

			if (i == position) {
				ListNode tmp = node.getNext();
				ListNode newNode = new ListNode(data);
				node.setNext(newNode);
				newNode.setNext(tmp);
				i++;
				length++;
				break;
			} else {
				i++;
			}

		}

	}

	public synchronized void remove(int position) {

		if (position < 0 || position > length)
			return;

		if (position == 0) {
			head = head.getNext();
			length--;
			return;
		}

		int i = 1;
		for (ListNode node = head; node != null; node = node.getNext()) {

			if (i == position) {
				if (null == node.getNext()) {
					node.setNext(node.getNext());
				} else {
					node.setNext(node.getNext().getNext());
				}
				i++;
				length--;
				break;
			} else {
				i++;
			}

		}

	}

	public synchronized void removeMached(int data) {

		int i = 1;
		for (ListNode node = head; node != null; node = node.getNext()) {

			if (node.getNext().getData() == data) {
				if (null == node.getNext()) {
					node.setNext(node.getNext());
				} else {
					node.setNext(node.getNext().getNext());
				}
				i++;
				length--;
				break;
			} else {
				i++;
			}

		}

	}

	public synchronized int getPosition(int data) {

		int position = 0;
		for (ListNode node = head; node != null; node = node.getNext()) {

			if (node.getData() == data) {

				return position;
			}

			position++;
		}

		return -1;
	}

	public int lenght() {

		return length;
	}

	public String toString() {

		String result = "";
		ListNode node = head;
		do {
			result = result + node.getData() + "-->";
			node = node.getNext();
		} while (node != null);
		return result;
	}

}
