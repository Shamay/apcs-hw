public class MyLinkedList{

	private Node head;


	public MyLinkedList(){
		head = null;
	}

	public void add(String s){
		Node temp = new Node(s);
		temp.setNext(head);		
		head = temp;
	}
	public void add(int i, String s){
		Node temp = new Node(s);
		Node current = head;
		int count = 0;
		while(count < i-1){
			current = current.getNext();
			count++;
		}
		temp.setNext(current.getNext());
		current.setNext(temp);
	}

	public String toString(){
		String s = "[ ";
		Node tmp = head;
		while(tmp != null){
			s+=tmp.getData()+" ";
			tmp = tmp.getNext();
		}	
		return s + "]";
	}

	public String get(int i){
		Node current = head;		
		int count = 0;
		while(count < i){
			current = current.getNext();
			count++;
		}
		return current.getData();
	}

	public void set(int i, String s){
		Node current = head;		
		int count = 0;
		while(count < i){
			current = current.getNext();
			count++;
		}
		current.setData(s);
	}

	public String remove(int i){
		Node current = head;		
		int count = 0;
		while(count < i - 1){
			current = current.getNext();
			count++;
		}
		String temp = current.getNext().getData();
		current.setNext(current.getNext().getNext());
		return temp;
	}

	public int find(String s){
		Node current = head;	
		int count = 0;	
		while(current != null){
			if(current.getData().equals(s)){
				return count; 
			}
			current = current.getNext();
			count++;
		}
		return -1;
	}

	public int length(){
		Node current = head;	
		int count = 0;	
		while(current != null){
			current = current.getNext();
			count++;
		}
		return count;
	}
}
