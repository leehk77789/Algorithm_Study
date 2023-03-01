package day0223;

import java.util.Scanner;

public class StackTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack s1 = new Stack(10);
		s1.isEmpty();

		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		s1.push(5);
		s1.push(6);
		s1.push(7);
		s1.push(8);
		s1.push(9);
		s1.push(10);

		s1.isEmpty();
		s1.isFull();

		s1.print();

		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();

		s1.print();
		s1.isEmpty();
	}
}
