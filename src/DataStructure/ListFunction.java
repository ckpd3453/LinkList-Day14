package DataStructure;

public class ListFunction {
	/**
	 * addNode - this method is created to add data to linedList
	 * 
	 * @param head - accepting head pointer of LinkedList to manipulate it
	 * @param data - accepting data to put it in linkedList
	 * @return head - it returns head of linkedList
	 * 
	 */
	Node head;
	public void addNode(int data) {
		Node newNode = new Node();
		newNode.data = data;

		if (head == null) {
			head = newNode;
		} else {
			Node pointer = head;

			while (pointer.next != null) {
				pointer = pointer.next;
			}

			pointer.next = newNode;
		}
	}
	public void insertAt(int index,int data)
	{
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		
		Node position = head;
		for(int i=0; i<index-1;i++)
		{
			position=position.next;
		}
		newNode.next = position.next;
		position.next = newNode;
		System.out.println("Element need to add in between: "+newNode.data);
	}

	public void printLinkedList(){
		if (head == null) {
			System.out.println("LinkedList is empty");
		} else {
			Node pointer = head;
			while (pointer != null) {
				System.out.print(pointer.data + "->");
				pointer = pointer.next;
			}
			System.out.println();
		}
	}
}
