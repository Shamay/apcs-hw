import java.io.*;
import java.util.*;

public class MyLinkedList<E> implements Iterable<E>{
	private Node head, tail;

    public Iterator<E> iterator() {
	return new myLLIterator<E>(head);
    }

	public MyLinkedList(){
		head = new Node("Dummy");
		tail = head;
	}

	// Adds to the end of the list
	public void add(String s){
		Node temp = new Node(s);
		Node current = head;
		while(current.getNext() != null){
			current = current.getNext();
		}
		current.setNext(temp);
		tail = temp;	
		//System.out.println(tail.getData());
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
		if(temp.getNext() == null){
			tail = temp;
		}
		//System.out.println(tail.getData());
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
		if(current.getNext() != null){
			tail = current;
		}
		System.out.println(tail.getData());
	}

	public String remove(int i){
		Node current = head;		
		int count = 0;
		while(count < i - 1){
			current = current.getNext();
			count++;
		}
		String temp;
		if(current.getNext().getNext() == null){
			tail = current;
			temp = current.getNext().getData();
			current.setNext(null);
		} else {
			temp = current.getNext().getData();
			current.setNext(current.getNext().getNext());
		}
		System.out.println(tail.getData());
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
