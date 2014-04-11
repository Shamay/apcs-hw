import java.io.*;
import java.util.*;

public class Queue{

    private int head, tail;
    private String[] list;

    public Queue(){
	list = new String[10];
	head = 0;
	tail = 0;	
    }

    public void enqueue(String s){
	if(isFull()){
	    list[tail % list.length] = s;
	    tail++;
	    if(tail >= list.length){
		tail = tail % list.length;
	    }
	}else{
	    System.exit(1);
	}
    }

    public String dequeue(){
	if(isFull()){
	    String temp = list[head];
	    list[head] = null;
	    head++;
	    if(head >= list.length){
	    head = head % list.length;
	    }
	    return temp;
	}else{
	    System.exit(1);
	    return "Error";
	}
    }

    public String toString(){
	String temp = "[";
	for(int x = 0; x < list.length - 1; x++){
	    temp += list[x] + ", ";
	}
	temp += list[list.length - 1] + "]";
	return temp;
    }

    public boolean isEmpty(){
	return head == tail;
    }
    
    public boolean isFull(){
	return tail == head - 1;
    }

}