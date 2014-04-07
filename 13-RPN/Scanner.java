import java.util.*;
import java.io.*;

public class Scanner{

    public void scan(){
	Scanner in = new Scanner(System.in);  // System.in is an InputStream
	Scanner inFile = new Scanner(new FileReader("myFile"));
    }

    public static void main(String[] args){
	System.out.println("This is the RPN interface. Please start typing:");
	MyStack stack = new MyStack();
    }

}