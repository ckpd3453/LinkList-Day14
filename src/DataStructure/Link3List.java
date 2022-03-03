package DataStructure;

public class Link3List {
	
	public int data;
	public Link3List next;
	public static Link3List head;

	public Link3List(int data, Link3List next) {
		super();
		this.data = data;
		this.next = head;
	}

	public Link3List(int data) {
		super();
		this.data = data;

	}

	public String toString() {
		return data + "";

	}
	
	/**
	 *1: Main method for manipulation linkedList 
	 * @param args - Default Java param (Not used)
	 */
	public static void main(String[] args) {
		
		/*
		 * 1.Creating Linked List for adding nodes
		 */
		Link3List el = new Link3List(56, null);
		System.out.println(el);
		head = el;
		el.push(30);
		el.push(70);
		el.printList();

	}

	/**
	 *2: addNode - this method is created to add data to linedList
	 * 
	 * @param head - accepting head pointer of LinkedList to manipulate it
	 * @param data - accepting data to put it in linkedList
	 * @return head - it returns head of linkedList
	 * 
	 */
	public Link3List push(int new_data) {
		
		/*
		 * 1: Created a new Node 
		 */
		Link3List newNode = new Link3List(new_data);
		
		/*
		 * 2: Checking whether any list is available before or not and 
		 * 		Initializing new node to head.
		 * 3: If node exist then Initializing head to pointer for reference
		 */
		if (head == null) {
			head = newNode;
		} else {
			Link3List pointer = head;

			while (pointer.next != null) {
				pointer = pointer.next;
			}

			pointer.next = newNode;
		}

		return head;

	}

	/**
	 * 4: Method to print
	 */
	public void printList() {
		
		/*
		 * 1: printing the Linked List by verifying conditions 
		 */
		if (head == null) {
			System.out.println("LinkedList is empty");
		} else {
			Link3List pointer = head;
			System.out.print("Linked List: ");
			while (pointer != null) {
				System.out.print(pointer.data + "->");
				pointer = pointer.next;
			}
		}
	}
}
