package LinkListPack;

public class LinkFunction9 {
	/**
	 * PROCESS:- 
	 * 1. addNode - this method is created to add data to linedList
	 * 
	 * @param head - accepting head pointer of LinkedList to manipulate it
	 * @param data - accepting data to put it in linkedList
	 * @return head - it returns head of linkedList
	 * 
	 *2. searchDelete - this method is created to search a node and delete that node 
	 *3. print LinkedList - this method is created to print linkedList
	 *4. Size - this method is created to get the size of linkedList
	 */
	NodeN head;

	/*
	 * 1. Method to add node
	 */
	public void addNode(int data) {
		NodeN newNode = new NodeN();
		newNode.data = data;

		if (head == null) {
			head = newNode;
		} else {
			NodeN pointer = head;

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
		NodeN previous = head;
		NodeN current = previous.next;
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
			NodeN pointer = head;
			while (pointer != null) {
				System.out.print(pointer.data + "->");
				pointer = pointer.next;
			}
			System.out.println();
		}
	}
	/*
	 * 4.created method to check the size of linked list
	 */

	public int getSize() {
		int count = 0;
		if (head == null)
			return count;
		else {
			NodeN temp = head;
			while (temp != null) {
				count++;
				temp = temp.next;
			}
			System.out.println("Size is " + count);
			return count;
		}
	}
}
