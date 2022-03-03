package DataStructure;

public class List8Function {

	/**
	 * PROCESS:- 1. addNode - this method is created to add data to linedList
	 * 
	 * @param head - accepting head pointer of LinkedList to manipulate it
	 * @param data - accepting data to put it in linkedList
	 * @return head - it returns head of linkedList
	 * 
	 *         2. searchInsert - this method is created to search data and add a
	 *         node after that 3. print LinkedList - this method is created to print
	 *         linkedList
	 */
	Node8 head;

	/*
	 * 1. Method to add node
	 */
	public void addNode(int data) {
		Node8 newNode = new Node8();
		newNode.data = data;

		if (head == null) {
			head = newNode;
		} else {
			Node8 pointer = head;

			while (pointer.next != null) {
				pointer = pointer.next;
			}

			pointer.next = newNode;
		}
	}

	/*
	 * 2. Method to search LinkedList and insert a node after 30
	 */
	public void searchInsert(int searchKey, int data) {
		Node8 current = head;
		Node8 newNode = new Node8();
		newNode.data = data;
		int i = 0;
		while (current != null) {

			if (current.data == searchKey) {
				System.out.println("Need to add 40 after 30");
				newNode.next = current.next;
				current.next = newNode;
			}
			i++;
			current = current.next;
		}
	}

	/*
	 * 3. Method to print linkedList
	 */
	public void printLinkedList() {
		if (head == null) {
			System.out.println("LinkedList is empty");
		} else {
			Node8 pointer = head;
			while (pointer != null) {
				System.out.print(pointer.data + "->");
				pointer = pointer.next;
			}
			System.out.println();
		}
	}
}
