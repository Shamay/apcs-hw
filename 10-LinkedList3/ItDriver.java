import java.util.*;
import java.io.*;

public class ItDriver {
    public static void main(String[] args){
	ArrayList<String> s = new ArrayList<String>();
	s.add("one");
	s.add("two");
	s.add("three");
	s.add("two");

	Iterator<String> i = s.iterator();
	while (i.hasNext()){
	    String x = i.next();
	    System.out.println(x);
	}
    }
}
