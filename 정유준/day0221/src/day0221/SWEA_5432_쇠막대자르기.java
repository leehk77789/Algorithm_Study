package day0221;

import java.util.Scanner;

public class SWEA_5432_쇠막대자르기 {
	static char[] stack;
	static int stackIdx;

	public static boolean isEmpty() {
		return stackIdx == -1;
	}

	public static boolean isFull() {
		return stackIdx == stack.length - 1;
	}

	public static char pop() {

		if (!isEmpty()) {
			char top = stack[stackIdx];
			stack[stackIdx] = '\u0000';
			stackIdx--;

			return top;
		}

		return '-';
	}

	public static void push(char tmp) {
		if (!isFull()) {
			stackIdx++;
			stack[stackIdx] = tmp;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt();
		for (int tc = 1; tc <= testCase; tc++) {
			String line = sc.next();

			stack = new char[line.length()];
			stackIdx = -1;

			int stickCount = 0;

			for (int idx = 0; idx < line.length(); idx++) {
				char tmp = line.charAt(idx);

				if (tmp == '(') {
					push(tmp);
				}
				// 레이저 인지 확인해야한다.
				// ) 괄호가 나올때 (1개 떨어져 나올때)
				else if (tmp == ')' && line.charAt(idx - 1) == ')') {
					pop();
					stickCount++;
				} else if (tmp == ')') {
					pop();

					stickCount += (stackIdx + 1);
				}
			}

			System.out.println("#" + tc + " " + stickCount);
		}
	}
}
