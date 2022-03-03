package DataStructure;

public class List7Function {
	
	/**PROCESS:-
	 *1. addNode - this method is created to add data to linedList
	 * 
	 * @param head - accepting head pointer of LinkedList to manipulate it
	 * @param data - accepting data to put it in linkedList
	 * @return head - it returns head of linkedList
	 * 
	 *2. search - this method is created to search data in given linkedList
	 *3. print LinkedList - this method is created to print linkedList
	 */
	Node7 head;
	
	/*
	 * 1. Method to add node
	 */
	public void addNode(int data) {
		Node7 newNode = new Node7();
		newNode.data = data;

		if (head == null) {
			head = newNode;
		} else {
			Node7 pointer = head;

			while (pointer.next != null) {
				pointer = pointer.next;
			}

			pointer.next = newNode;
		}
	}
	
	
	/*
	 * 2. Method to search LinkedList to find Node with value 30
	 */
	public void search(int searchKey) {
		Node7 current = head;
		int i=0;
		while(current != null)
		{
			
			if(current.data == searchKey)
			{
				System.out.println("Find whether "+searchKey+" is Present or not:-");
				System.out.println(searchKey +" is Present");
				break;
			}
			i++;
			current = current.next;
		}
		System.out.println("Index No: "+i);
	}
	/*
	 * 3. Method to print linkedList
	 */
	public void printLinkedList(){
		if (head == null) {
			System.out.println("LinkedList is empty");
		} else {
			Node7 pointer = head;
			while (pointer != null) {
				System.out.print(pointer.data + "->");
				pointer = pointer.next;
			}
			System.out.println();
		}
	}
}
