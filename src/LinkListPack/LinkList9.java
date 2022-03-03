package LinkListPack;

public class LinkList9 {
	/**
	 * 1: Main method for manipulation linkedList
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * PROCEDURE
		 * 1. Creating Lined list 
		 * 2. Adding nodes to linkedList 
		 * 3. Searching for given data and delete that data from linkedList 
		 * 4. Printing LinkedList
		 */

		/*
		 * 1. Creating Lined list
		 */
		LinkFunction9 list = new LinkFunction9();
		/*
		 * 2. Adding nodes to linkedList
		 */
		list.addNode(56);
		list.addNode(30);
		list.addNode(40);
		list.addNode(70);
		list.printLinkedList();

		/*
		 * 3. Searching for given data in linked list and deleting that node
		 */
		list.searchDelete(40);

		/*
		 * 4. To Print
		 */
		list.printLinkedList();

	}

}
