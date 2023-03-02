package day0228;

import java.util.LinkedList;
import java.util.Scanner;

public class BOJ_1158_요세푸스문제_정유준 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int humanAmount = sc.nextInt();
		int deleteNum = sc.nextInt();
		LinkedList<Integer> human = new LinkedList<>();

		for (int i = 0; i < humanAmount; i++) {
			human.add(i);
		}
		System.out.print("<");
		while (!human.isEmpty()) {
			for (int i = 0; i < deleteNum; i++) {
				if (i == deleteNum - 1) {
					int a = human.remove();

					if (human.size() == 0) {
						System.out.print(a);
					} else {
						System.out.print(a + ", ");
					}
				} else {
					human.add(human.remove());
				}
			}
		}
		System.out.print(">");
	}
}
