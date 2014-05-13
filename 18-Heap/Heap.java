import java.util.*;

public class Heap{

    private Node root; // min

    public Heap(){
	root = null;
    }

    public void insert(Node p){
	Node current = root;
	if(p.getData() >= current.getData()){
	    if(pickSide(p)){
		Node temp = current.getLeft();
		current.setLeft(p);
		p.setLeft(temp);
		siftDown(p);
	    }else{
		Node temp = current.getRight();
		current.setRight(p);
		p.setRight(temp);
		siftDown(p);
	    }
	}else{
	    if(Math.random() > 0.5){
		p.setLeft(current);
		root = p;
	    }else{
		p.setRight(current);
		root = p;
	    }
	}
	
    }

    public int findMin(){
	return root.getData();
    }

    public void removeMin(){

    }

    public void siftDown(Node p){
	if(pickSide(p)){
	    if(p.getRight() != null && p.getRight().getData() < p.getData()){
		Node temp = p.getRight();
		p.getRight().setLeft(p.getLeft());
		p.getRight().setRight(p.getRight());
		p.setLeft(temp.getLeft());
		p.setRight(temp.getRight());
		siftDown(p);
	    } 
	}else{
	    if(p.getLeft() != null && p.getLeft().getData() < p.getData()){
		Node temp = p.getLeft();
		p.getLeft().setLeft(p.getLeft());
		p.getLeft().setRight(p.getRight());
		p.setLeft(temp.getLeft());
		p.setRight(temp.getRight());
		siftDown(p);
	    } 
	}

    }

    public int length(Node p){
	if(p == null)
	    return 0;
	return 1 + length(p.getLeft()) + length(p.getRight());
    }
    public boolean pickSide(Node p){ // left is true, right is false
	return length(p.getLeft()) < length(p.getRight());
    }

}