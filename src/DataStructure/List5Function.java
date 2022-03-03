package DataStructure;

public class List5Function {
	
	/**PROCESS:-
	 *1. addNode - this method is created to add data to linedList
	 * 
	 * @param head - accepting head pointer of LinkedList to manipulate it
	 * @param data - accepting data to put it in linkedList
	 * @return head - it returns head of linkedList
	 * 
	 *2. insertAt - this method is created to add data in between to linkedList
	 *3. deteleAt - this method is created to delete data
	 *4. print LinkedLisr - this method is created to print linkedList
	 */
	Node5 head;
	
	/*
	 * 1. Method to add node
	 */
	public void addNode(int data) {
		Node5 newNode = new Node5();
		newNode.data = data;

		if (head == null) {
			head = newNode;
		} else {
			Node5 pointer = head;

			while (pointer.next != null) {
				pointer = pointer.next;
			}

			pointer.next = newNode;
		}
	}
	
	/*
	 * 2. Method to insert in between
	 */
	public void insertAt(int index,int data)
	{
		Node5 newNode = new Node5();
		newNode.data = data;
		newNode.next = null;
		
		Node5 position = head;
		for(int i=0; i<index-1;i++)
		{
			position=position.next;
		}
		newNode.next = position.next;
		position.next = newNode;
		System.out.println("Element need to add in between: "+newNode.data);
	}
	
	/*
	 *3. Method to delete Node at first position
	 */
	public void deleteAt(int index)
	{
		if (index==0)
		{
			head = head.next;
			System.out.println("Delete: " +head.data);
		}
		else
		{
			Node5 position= head;
			Node5 position1=null;
			for(int i=0;i<index-1;i++)
			{
				position = position.next;
			}
			position1 = position.next;
			position.next=position1.next;
			System.out.println("Delete: " +position1.data);
		}
	}

	/*
	 * 4. Method to print linkedList
	 */
	public void printLinkedList(){
		if (head == null) {
			System.out.println("LinkedList is empty");
		} else {
			Node5 pointer = head;
			while (pointer != null) {
				System.out.print(pointer.data + "->");
				pointer = pointer.next;
			}
			System.out.println();
		}
	}
}
