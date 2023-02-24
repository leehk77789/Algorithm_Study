package test02;

public class Test {

	public static void main(String[] args) {
		SingltLinkedList list = new SingltLinkedList();
		list.addToEnd(13);
		list.addToEnd(88);
		list.addToEnd(99);
		list.addToStart(1);
		list.addToStart(2);
		list.printList();
	}
}
