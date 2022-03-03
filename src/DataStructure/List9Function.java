package DataStructure;

public class List9Function {

	/**
	 * PROCESS:- 1. addNode - this method is created to add data to linedList
	 * 
	 * @param head - accepting head pointer of LinkedList to manipulate it
	 * @param data - accepting data to put it in linkedList
	 * @return head - it returns head of linkedList
	 * 
	 *         2. searchDelete - this method is created to search a node and delete
	 *         that node 3. print LinkedList - this method is created to print
	 *         linkedList
	 */
	Node9 head;

	/*
	 * 1. Method to add node
	 */
	public void addNode(int data) {
		Node9 newNode = new Node9();
		newNode.data = data;

		if (head == null) {
			head = newNode;
		} else {
			Node9 pointer = head;

			while (pointer.next != null) {
				pointer = pointer.next;
			}

			pointer.next = newNode;
		}
	}

	/*
	 * 2. Method to search a node in LinkedList and delete.
	 */
	public void searchDelete(int searchKey) {
		Node9 previous = head;
		Node9 current = previous.next;
		while (current != null) {

			if (current.data == searchKey) {
				System.out.println("Need to search 40 and delete it");
				previous = previous.next;
			}
			previous.next = current;
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
			Node9 pointer = head;
			while (pointer != null) {
				System.out.print(pointer.data + "->");
				pointer = pointer.next;
			}
			System.out.println();
		}
	}
}
