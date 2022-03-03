package DataStructure;

public class Link8List {

	/**
	 * 1: Main method for manipulation linkedList
	 * 
	 * @param args - Default Java param (Not used)
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		/*
		 * PROCEDURE 1. Creating Lined list 2. Adding nodes to linkedList 3. Searching
		 * for given data and adding a node after that 4. Printing linedList after
		 * adding nodes
		 */

		/*
		 * 1. Creating Lined list
		 */
		List8Function list = new List8Function();

		/*
		 * 2. Adding nodes to linkedList
		 */
		list.addNode(56);
		list.addNode(30);
		list.addNode(70);
		list.printLinkedList();

		/*
		 * 3. Searching for given data in linked list and adding another node after that
		 */
		list.searchInsert(30, 40);

		/*
		 * 4. Printing
		 */
		list.printLinkedList();

	}

}
