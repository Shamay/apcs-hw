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
	Node current = root;
	Node parent = null;

	while(current != null && current.getData() != p.getData()){
	    parent = current;
	    if(current.getData() > p.getData())
		current=current.getLeft();
	    else
		current=current.getRight();
	}
	// leaf case
	if(current.getLeft() == null && current.getRight() == null){
	    if(current.getData() < parent.getData())
		parent.setLeft(null);
	    else
		parent.setRight(null);

	// 1 child case
	}else if(current.getLeft() == null || current.getRight() == null){
	    if(current.getRight() == null){
		if(current.getData() < parent.getData())
		    parent.setLeft(current.getLeft());
		else
		    parent.setRight(current.getLeft());
	    }else{
		if(current.getData() < parent.getData())
		    parent.setLeft(current.getRight());
		else
		    parent.setRight(current.getRight());
	    }
	// 2 child case
	}else{
	    Node temp = current.getLeft();
            Node tempParent = null;
	    while(temp.getRight() != null){
		tempParent = temp;
		temp = temp.getRight();
	    }

	    if(temp.getLeft() == null){
		temp.setLeft(current.getLeft());
		temp.setRight(current.getRight());
		if(current.getData() < parent.getData())
		    parent.setLeft(temp);
		else
		    parent.setRight(temp);
	    }else{
		temp.setRight(current.getRight());
		if(current.getData() < parent.getData())
		    parent.setLeft(temp);
		else
		    parent.setRight(temp);
		while(temp.getLeft() != null){
		    tempParent = temp;
		    temp = temp.getLeft();
		}
		temp.setLeft(current.getLeft());
		if(tempParent.getData() > temp.getData()){
		   tempParent.setLeft(null);
		}else{
	           tempParent.setRight(null);
		}
	    }
	}
    }

    public void traverse(Node n){
	if(n == null)
	    return;
	else{
	    // depending on where the print line goes, it can be infix, prefix, or postfix
	    System.out.print(n + ", ");
	    traverse(n.getLeft());
	    traverse(n.getRight());
	}
    }
}
