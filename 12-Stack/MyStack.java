public class MyStack {

    // private Node top;
    private int numElts;
    private int size;
    private Node[] elements;


    // contructor
    public MyStack(){
	// top = null;
	elements = new Node[10];
	numElts = 0;
    }

    public void grow(){
	if (numElts >= size){
	    Node[] temp = new Node[size*2];
	    for(int x = 0; x < size ; x++){
		temp[x] = elements[x];
	    }
	    elements = temp;
	    size = size * 2;
	}
    }

    // push
    public void push(String s){
	Node n = new Node(s);
	grow();
	elements[numElts] = n;
	numElts++;
    }
    
    // pop
    public String pop(){
	String temp = elements[numElts - 1].getData();
	elements[numElts - 1] = null;
	numElts--;
	return temp;
    }

    // peek
    public String peek(){
	return elements[numElts - 1].getData();
    }


    // isEmpty
    public Boolean isEmpty(){
	return elements[numElts - 1] == null;
    }
    
    public int getSize(){
	return numElts;
    }
	
    // toString
    public String toString(){
	String tmp = "";
	for(int x = 0; x<numElts; x++){
	    tmp += elements[x].getData() + ", ";
	}
	return tmp;
    }
}
