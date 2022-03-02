package DataStructure;

public class Link2List {
	
	public int data;
	public Link2List next;
	public static Link2List head;
	
	
	public Link2List(int data, Link2List next) {
		super();
		this.data = data;
		this.next = head;
	}

	public Link2List(int data) {
		super();
		this.data = data;
		
	}

	public String toString() {
		return data+"" ;
		
	}
	
	public static void main(String[] args) {
		Link2List el = new Link2List(70, null);
		System.out.println(el);
		head = el;
		el.push(30);
		el.push(56);
		el.printList();
		
		
	}
	//Method to Push the data
	public void push(int new_data)
	{
	    /* 1 & 2: Allocate the Node &
	              Put in the data*/
	    Link2List new_node = new Link2List(new_data);
	 
	    /* 3. Make next of new Node as head */
	    new_node.next = head;
	 
	    /* 4. Move the head to point to new Node */
	    head = new_node;
	}
	//Method to print
	public void printList() {
		/* 1. Store head to current node to print from starting*/
		Link2List currNode = head;
		/*Print current node till null*/
		while(currNode != null) {
			System.out.print(currNode + "->");
			currNode = currNode.next;
		}
		System.out.println("Null");
	}
}
