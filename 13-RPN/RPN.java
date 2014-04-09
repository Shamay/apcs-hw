import java.util.*;
import java.io.*;

public class RPN{

    // Idea taken from Cardy to scan a String of input
    public void calculate(String input, MyStack stack){
	String[] inputList = input.split("\\s+");
	for(int x = 0; x < inputList.length; x++){
	    if(inputList[x].equals("+")){
		stack.push("" + (Integer.parseInt(stack.pop()) + Integer.parseInt(stack.pop()) ));
	    }else if(inputList[x].equals("*")){
		stack.push("" + (Integer.parseInt(stack.pop()) * Integer.parseInt(stack.pop()) ));
	    }else if(inputList[x].equals("-")){
		stack.push("" + (Integer.parseInt(stack.pop()) - Integer.parseInt(stack.pop()) ));
	    }else if(inputList[x].equals("/")){
		stack.push("" + (Integer.parseInt(stack.pop()) / Integer.parseInt(stack.pop()) ));
	    }else{
		stack.push(inputList[x]);
	    }
	}
	System.out.println("Result: " + stack.toString());
	System.out.println("Next series of commands:");
	Scanner sc = new Scanner(System.in);
	this.calculate(sc.nextLine(), stack);
    }

    public static void main(String[] args){
	RPN calc = new RPN();
	System.out.println("Please input a series of commands separated by spaces:");
	System.out.println("List of valid characters: 0 1 2 3 4 5 6 7 8 9 + - * /");
	Scanner sc = new Scanner(System.in);
	calc.calculate(sc.nextLine(), new MyStack());
    }

}