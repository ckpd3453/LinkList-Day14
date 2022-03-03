package DataStructure;

public class LinkLastList10 {

	/**
	 * 1: Main method for manipulation linkedList
	 * 
	 * @param args - Default Java param (Not used)
	 * 
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		/*
		 * PROCEDURE 1. Creating Lined list 
		 * 2. Adding nodes to linkedList 
		 * 3. Sorting given linkedList in Asscending Order
		 *  4. Printing LinkedList
		 */

		/*
		 * 1. Creating Lined list
		 */
		ListLastFunction10 list = new ListLastFunction10();

		/*
		 * 2. Adding nodes to linkedList
		 */
		list.addNode(56);
		list.addNode(30);
		list.addNode(40);
		list.addNode(70);
		list.printLinkedList();

		/*
		 * 3. Sorting linked list in Asscending Order.
		 */
		list.sorting();

		/*
		 * 4. Printing
		 */
		list.printLinkedList();
	}

}
