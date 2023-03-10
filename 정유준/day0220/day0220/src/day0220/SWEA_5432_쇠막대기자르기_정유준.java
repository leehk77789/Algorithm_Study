package day0220;

import java.util.Scanner;
import java.util.Stack;

public class SWEA_5432_쇠막대기자르기_정유준 {
	static int sum;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();

		for (int idx = 1; idx <= testCase; idx++) {
			Stack<Character> stack = new Stack<>();
			sum = 0;
			String input = sc.next();
			for (int i = 0; i < input.length(); i++) {
				// 열리는 괄호면 일단 스택에 넣는다.
				if (input.charAt(i) == '(') {
					stack.push('(');
					continue;
				}

				// 닫힌 괄호면 일단 스택에서 빼준다.
				if (input.charAt(i) == ')') {
					stack.pop();

					// 닫힌 괄호 이전의 괄호가 닫힌 괄호이면 ()이므로 레이저
					if (input.charAt(i - 1) == '(') {
						// 레이저이면 현재 스택의 사이즈만큼 더해준다.
						sum += stack.size();
					} else {
						// 이전의 괄호가 닫힌 괄호이면 레이저가 아니기때문에
						sum++; // 1을 더해 준다.
					}
				}
			}
			System.out.println("#" + idx + " " + sum);
		}
	}
}
