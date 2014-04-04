public class MyStack {

    private Node top;
    private int numElts;

    // contructor
    public MyStack(){
	top = null;
	numElts = 0;
    }

    // push
    public void push(String s){
	Node n = new Node(s);
	n.setNext(top);
	top = n;
	numElts++;
    }
    
    // pop
    public String pop(){
	String temp = top.getData();
	top = top.getNext();
	numElts--;
	return temp;
    }

    // peek
    public String peek(){
	return top.getData();
    }


    // isEmpty
    public Boolean isEmpty(){
	return top == null;
    }
    
    public getSize(){
	return numElts;
    }
	
    // toString
    public String toString(){
	String tmp = "";
	Node currentNode = top;
	while (currentNode != null){
	    tmp += currentNode.getData() + ", ";
	    currentNode = currentNode.getNext();
	}
	return tmp;
    }
}
