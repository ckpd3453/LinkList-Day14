package DataStructure;

public class Link1List {
	public int i;
	public int j;
	public int k;
	public Link1List next;
	

	//Constructor
	public Link1List(int i, int j, int k, Link1List next) {
		super();
		this.i = i;
		this.j = j;
		this.k = k;
		this.next = next;
	}

	
	public String toString() {
		return i+"->"+j+"->"+k+"->";
	}
	public static void main(String[] args) {
		Link1List front = new Link1List(56,30,70,null); //creating object and passing arguments to constructor
		System.out.println(front); // to print
	}
}
