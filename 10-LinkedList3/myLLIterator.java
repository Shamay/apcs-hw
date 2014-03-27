import java.io.*;
import java.util.*;


public class myLLIterator<E> implements Iterator<E> {
    private Node<E> currentNode;
    public myLLIterator(Node<E> n) {
	currentNode = n;
    }
    public boolean hasNext() {
	return currentNode!=null;
    }
    public E next() {
	E r = currentNode.getData();
	currentNode=currentNode.getNext();
	return r;
    }
    public void remove() {
    }
    
}
