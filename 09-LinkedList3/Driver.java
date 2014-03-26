import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){
	MyLinkedList<String> L = new MyLinkedList<String>();
	L.add("one");
	L.add("two");
	L.add("three");
	L.add("four");
	System.out.println(L);
	Iterator<String> it = L.iterator();
	while (it.hasNext())
	    System.out.println(it.next());
    }
}
