package DataStructure;

public class Link7List {

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
				 * 4. Searching for node having value 30
				 * 5.
				 */
				
				/*
				 * 1. Creating Lined list
				 */
				List7Function list = new List7Function();
				
				/*
				 * 2. Adding nodes to linkedList
				 */
				list.addNode(56);
				list.addNode(70);
				list.addNode(30);
				
				/*
				 * 3.Printing
				 */
				list.printLinkedList();
				
				/*
				 * 4. Searching for node 
				 */
				list.search(30);
				
				 
		}

		}

