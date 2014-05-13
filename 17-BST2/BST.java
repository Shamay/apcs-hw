public class BST{

    private Node root;
    
    public BST(){
	root = null;
    }

    public Node search(int x){
	Node p = root;

	while(p != null && p.getData() != x){
	    if(p.getData() > x)
		p=p.getLeft();
	    else
		p=p.getRight();
	}
	return p;
    }

    public void insert(Node p){
	Node current = root;

	while(current != null){
	    if(current.getData() > p.getData())
		current=current.getLeft();
	    else
		current=current.getRight();
	}
	current = p;
    }
    
    public void remove(Node p){
	
    }
}
  
