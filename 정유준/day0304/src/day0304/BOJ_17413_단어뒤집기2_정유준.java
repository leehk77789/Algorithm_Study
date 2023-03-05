package day0304;

import java.util.Scanner;
import java.util.Stack;

public class BOJ_17413_단어뒤집기2_정유준 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> reverse = new Stack<>();
		String input = sc.nextLine();
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '<') {
				while (!reverse.isEmpty()) {
					System.out.print(reverse.pop());
				}

				while (true) {
					System.out.print(input.charAt(i));
					i++;
					if (input.charAt(i) == '>') {
						System.out.print(input.charAt(i));
						break;
					}
				}
			} else if (input.charAt(i) == ' ') {
				while (!reverse.empty()) {
					System.out.print(reverse.pop());
				}
				System.out.print(input.charAt(i));
			} else {
				reverse.push(input.charAt(i));
			}
		}
		while (!reverse.isEmpty()) {
			System.out.print(reverse.pop());
		}
	}
}
