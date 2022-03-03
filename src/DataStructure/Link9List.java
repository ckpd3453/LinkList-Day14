package DataStructure;

public class Link9List {

	/**
	 * 1: Main method for manipulation linkedList
	 * 
	 * @param args - Default Java param (Not used)
	 * 
	 *             2: Adding Nodes 3: searchDelete - This method is to search and
	 *             delete a particular node 4: printLinkedList - This method is
	 *             printing the LinkedList
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
		List9Function list = new List9Function();

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
		 * 4. Printing
		 */
		list.printLinkedList();
	}

}
