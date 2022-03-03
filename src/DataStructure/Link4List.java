package DataStructure;

public class Link4List {

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
				 * 6. Deleting node from end of the linkedlist
				 * 7. Printing linedList after deleting node from end of the linkedlist
				 */
				
				/*
				 * 1. Creating Lined list
				 */
				ListFunction list = new ListFunction();
				
				/*
				 * 2. Adding nodes to linkedList
				 */
				list.addNode(56);
				list.addNode(70);
				list.printLinkedList();
				list.insertAt(1,30);
				list.printLinkedList();
				 
		}

		}

