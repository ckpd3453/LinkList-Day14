package DataStructure;

public class ListLastFunction10 {

	/**
	 * PROCESS:- 1. addNode - this method is created to add data to linedList
	 * 
	 * @param head - accepting head pointer of LinkedList to manipulate it
	 * @param data - accepting data to put it in linkedList
	 * @return head - it returns head of linkedList
	 * 
	 *2. sorting - this method is created to sort LinkedList in Asscending Order. 
	 *3. print LinkedList - this method is created to print linkedList
	 */
	NodeLast10 head;

	/*
	 * 1. Method to add node
	 */
	public void addNode(int data) {
		NodeLast10 newNode = new NodeLast10();
		newNode.data = data;

		if (head == null) {
			head = newNode;
		} else {
			NodeLast10 pointer = head;

			while (pointer.next != null) {
				pointer = pointer.next;
			}

			pointer.next = newNode;
		}
	}

	/*
	 * 2. Method to sort LinkedList in Asscending Order.
	 */
	public void sorting() {
		NodeLast10 pointer = head;
		int temp;
		System.out.print("Sorting LinkedList in Asscending Order: ");
		while (pointer.next != null) {
			NodeLast10 currentpointer = pointer.next;
			while (currentpointer != null) {
				if (pointer.data > currentpointer.data) {
					temp = pointer.data;
					pointer.data = currentpointer.data;
					currentpointer.data = temp;
				}
				currentpointer = currentpointer.next;
			}
			pointer = pointer.next;
		}
	}

	/*
	 * 3. Method to print linkedList
	 */
	public void printLinkedList() {
		if (head == null) {
			System.out.println("LinkedList is empty");
		} else {
			NodeLast10 pointer = head;
			while (pointer != null) {
				System.out.print(pointer.data + "->");
				pointer = pointer.next;
			}
			System.out.println();
		}
	}
}
