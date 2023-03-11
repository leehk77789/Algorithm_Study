package day0305;

import java.util.Scanner;
import java.util.Stack;

public class BOJ_4949_균형잡힌세상_정유준 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> arr = new Stack<>();
		char temp;
		while (true) {
			boolean flag = true;
			arr.clear();
			String str = sc.nextLine();
			if (str.equals(".")) {
				break;
			}
			for (int i = 0; i < str.length(); i++) {
				temp = str.charAt(i);
				if (temp == '(' || temp == '[') {
					arr.push(temp);
				} else if (temp == ')' || temp == ']') {
					if (arr.isEmpty() || (arr.peek() == '(' && temp == ']') || (arr.peek() == '[' && temp == ')')) {
						arr.push(temp);
						break;
					}
					arr.pop();
				}
			}

			if (arr.isEmpty()) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
}
