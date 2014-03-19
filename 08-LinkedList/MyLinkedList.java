public class MyLinkedList{

	private Node head;


	public MyLinkedList(){
		head = null;
	}

	public void add(String s){
		Node temp = new Node(s);
		tmp.setNext(head);		
		head = tmp;
	}

	public String toString(){
		String s;
		s = ""+head;
		return s; 
		// tmp = temp.getNext() will go through the list	
	}
}
