public class Tester{

    public static void main(String[] args){
	MyStack stack = new MyStack();
	System.out.println(stack.getSize());	
	stack.push("Brah");
	stack.push("Bra");
	stack.push("Br");
	
	System.out.println(stack.toString());

	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
    }

}