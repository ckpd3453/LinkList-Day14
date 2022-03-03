package DataStructure;

public class Link5List {

	/**
	 * 1: Main method for manipulation linkedList
	 * 
	 * @param args - Default Java param (Not used)
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
				/*
				 * PROCEDURE
				 * 1. Creating Lined list
				 * 2. Adding nodes to linkedList
				 * 3. Printing linedList after adding nodes
				 * 4. Deleting node from start of the linkedlist
				 * 5. Printing linedList after deleting node from start of the linkedlist
				 */
				
				/*
				 * 1. Creating Lined list
				 */
				List5Function list = new List5Function();
				
				/*
				 * 2. Adding nodes to linkedList
				 */
				list.addNode(56);
				list.addNode(70);
				list.printLinkedList();
				
				/*
				 *3. Inserting node in between of linkedList 
				 */
				list.insertAt(1,30);
				list.printLinkedList();

				/*
				 *4. Deleting node from start of the linkedList
				 */
				list.deleteAt(0);
				
				/*
				 * 5. Printing
				 */
				list.printLinkedList();
				 
		}

		}

