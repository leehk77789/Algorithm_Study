package day0221;

import java.util.Scanner;
import java.util.Stack;

public class BOJ_1918_후위표기식_정유준 {
	static Scanner sc = new Scanner(System.in);
	static String cal;
	static Stack<Integer> calStack;

	static void makeWhowee() {
		cal = "";
		Stack<Character> plus = new Stack<>();
		// String으로 받아서
		String arr = sc.next();
		// plus스택을 만들고, 숫자면 String에 바로 추가,
		// 숫자가 아니면 stack에 이미 +가 있는지 보고
		// 없으면 바로 넣어주고, 있으면 기존것을 String에 추가하고 stack에 새로운 +를 넣는다.
		for (int idx = 0; idx < arr.length(); idx++) {
			// 해당 인덱스가 +이면
			if (arr.charAt(idx) == '*' || arr.charAt(idx) == '/') {
				// plus스택이 비었는지 확인하고
				if (plus.isEmpty()) {
					// 비었으면 +를 하나 넣어준다
					plus.push(arr.charAt(idx));
				} else if (plus.peek() == '*' || plus.peek() == '/') {
					// plus스택이 비어있지 않으면, String에 붙여주고
					// 새로운 +를 넣는다.
					cal += String.valueOf(plus.pop());
					plus.push(arr.charAt(idx));
				} else {
					plus.push(arr.charAt(idx));
				}
			} else if (arr.charAt(idx) == '+' || arr.charAt(idx) == '-') {
				while (!plus.isEmpty() && plus.peek() != '(') {
					cal += String.valueOf(plus.pop());
				}
				plus.push(arr.charAt(idx));
			} else if (arr.charAt(idx) == '(') {
				plus.push(arr.charAt(idx));
			} else if (arr.charAt(idx) == ')') {
				while (plus.peek() != '(') {
					cal += String.valueOf(plus.pop());
				}
				plus.pop();
			}

			else {
				// +가 아니면 숫자이므로 그냥 더해주면 된다.
				cal += arr.charAt(idx);
			}
		}

		// 남은 연산자들도 전부 넣는다.
		while (!plus.isEmpty()) {
			cal += String.valueOf(plus.pop());
		}
	}

	static void solve() {
		makeWhowee();
		System.out.println(cal);
	}

	public static void main(String[] args) {
		solve();
	}
}