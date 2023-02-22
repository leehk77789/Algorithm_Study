package day0222;

import java.util.Scanner;
import java.util.Stack;

public class SWEA_1218_괄호짝짓기_정유준 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int idx = 1; idx <= 10; idx++) {
			Stack<Character> small = new Stack<>();
			Stack<Character> middle = new Stack<>();
			Stack<Character> big = new Stack<>();
			Stack<Character> arrow = new Stack<>();
			int charLong = sc.nextInt();
			char[] gwalho = sc.next().toCharArray();
			for (int i = 0; i < gwalho.length; i++) {
				if (gwalho[i] == '(') {
					small.push(gwalho[i]);
				} else if (gwalho[i] == '{') {
					middle.push(gwalho[i]);
				} else if (gwalho[i] == '[') {
					big.push(gwalho[i]);
				} else if (gwalho[i] == '<') {
					arrow.push(gwalho[i]);
				} else if (gwalho[i] == ')') {
					if (!small.isEmpty() && small.peek() == '(') {
						small.pop();
					} else {
						small.push(gwalho[i]);
					}
				} else if (gwalho[i] == '}') {
					if (!middle.isEmpty() && middle.peek() == '{') {
						middle.pop();
					} else {
						middle.push(gwalho[i]);
					}
				} else if (gwalho[i] == ']') {
					if (!big.isEmpty() && big.peek() == '[') {
						big.pop();
					} else {
						big.push(gwalho[i]);
					}
				} else if (gwalho[i] == '>') {
					if (!arrow.isEmpty() && arrow.peek() == '<') {
						arrow.pop();
					} else {
						arrow.pop();
					}
				}
			}
			if (small.isEmpty() && middle.isEmpty() && big.isEmpty() && arrow.isEmpty()) {
				System.out.println("#" + idx + " " + 1);
			} else {
				System.out.println("#" + idx + " " + 0);
			}
		}
	}
}
