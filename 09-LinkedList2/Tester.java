public class Tester{

	public static void main(String[] args){
		MyLinkedList L = new MyLinkedList();
		L.add("y");
		L.add("a");
		L.add("m");
		L.add("a");
		L.add("h");
		L.add("s");
		L.add(4,"lala");
		System.out.println(L.toString());
		System.out.println(L.get(4));
		L.set(4,"lalala");
		System.out.println(L.toString());
		L.remove(4);
		System.out.println(L.toString());
		System.out.println(L.find("m"));
		System.out.println(L.length());
	}
}
