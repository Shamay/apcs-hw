public class DoubleLL<E>{

    private class Node<E> {
	E data;
	Node<E> next,prev;
	public Node(E d){
	    this.data = d;
	}
	public String toString(){
	    return ""+data;
	}

	public void setData(E d) {data = d;}
	public E getData() { return data;}
	
	public void setNext (Node<E> n) { next = n;}
	public Node<E> getNext() {return next;}
	
	public void setPrev(Node<E> p) {prev = p;}
	public Node<E> getPrev() {return prev;}
    }

    private Node<E> current;
    private Node<E> head,tail;

    public void insert(E d){
	Node<E> n =  new Node<E>(d);
	if(current==null){
	    head=n;
	    tail=n;
	    head.next = tail;
	    head.prev = tail;
	    current=n;
	    tail.next = head;
	    tail.prev = head;
	}
	else if(current == head){
	    n.next = current;
	    current.prev = n;
	    current = n;
	    head = n;

	    tail.next = head;
	    head.prev = tail;
	}
	else if(current != head){
	       n.next = current;
	       n.prev = current.getPrev();
	       current.getPrev().next = n;
	       current.prev = n;
	       current = n;
	}

    }
    
    public E getCurrent() {
	return current.getData();
    }

    public E getHead() {
	return head.getData();
    }
    
    public E getTail(){
	return tail.getData();
    }

    public void forward(){
	    current = current.getNext();
    }

    public void back(){
	    current = current.getPrev(); 
    }

    public void delete(){
       	if(current==null){
	}
	else if(current == head){
	    tail.next = head.next;
	    head.getNext().setPrev(tail);
	    //String temp = head.getData();
	    head = head.getNext();
	    current = head;	    
	    // return "deleted: " + temp;
	}
	else if(current == tail){
	    tail.getPrev().setNext(head);
	    head.prev = tail.prev;
	    //String temp = tail.getData();
	    tail = tail.getPrev();
	    current = tail;
	    //return "deleted: " + temp;
	}
	else{
	    current.getPrev().setNext(current.getNext());
	    current.getNext().setPrev(current.getPrev());
	    //String temp = current.getData();
	    current = current.getNext();
	    //return "deleted: " + temp;
	}
    }

    public int find(String s){
	Node<E> temp = head;
	int count = 0;
	while(temp.getNext() != head){
	    if(temp.getData().equals(s))
		return count;
	    count++;
	}
	return -1;
    }

    public String toString() {
	if(current == null)
	    return "";
	while(current.getPrev() != tail)
	    current = current.getPrev();

	Node<E> tmp = current;
	String s = "";
	while (tmp != head){
	    s += tmp.getData() + "";
	    tmp = tmp.getNext();
	}
	return s;
    }

    public static void main(String[] args){
	DoubleLL<String> L = new DoubleLL<String>();
	System.out.println(L);
	L.insert("hello");
	System.out.println(L);
	L.insert("world");
	System.out.println(L);
	L.insert("three");
	System.out.println(L);
	System.out.println(L.getCurrent());
	L.forward();
	System.out.println(L.getCurrent());
	L.insert("inserted");
	System.out.println(L);
    }
}
