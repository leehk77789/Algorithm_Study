package day0221;

import java.util.Scanner;
import java.util.Stack;

public class SWEA_1222_계산기1_정유준 {
	static Scanner sc = new Scanner(System.in);
	static String cal;
	static Stack<Integer> calStack;

	static void makeWhowee() {
		cal = "";
		int length = sc.nextInt();
		Stack<Character> plus = new Stack<>();
		// String으로 받아서
		String arr = sc.next();
		// plus스택을 만들고, 숫자면 String에 바로 추가,
		// 숫자가 아니면 stack에 이미 +가 있는지 보고
		// 없으면 바로 넣어주고, 있으면 기존것을 String에 추가하고 stack에 새로운 +를 넣는다.
		for (int idx = 0; idx < arr.length(); idx++) {
			// 해당 인덱스가 +이면
			if (arr.charAt(idx) == '+') {
				// plus스택이 비었는지 확인하고
				if (plus.isEmpty()) {
					// 비었으면 +를 하나 넣어준다
					plus.push(arr.charAt(idx));
				} else {
					// plus스택이 비어있지 않으면, String에 붙여주고
					// 새로운 +를 넣는다.
					cal += String.valueOf(plus.pop());
					plus.push(arr.charAt(idx));
				}
			} else {
				// +가 아니면 숫자이므로 그냥 더해주면 된다.
				cal += arr.charAt(idx);
			}
		}

		// 남은 연산자들도 전부 넣는다.
		while (!plus.isEmpty()) {
			cal += String.valueOf(plus.pop());
		}
	}

	static void doCalc() {
		calStack = new Stack<>();
		for (int idx = 0; idx < cal.length(); idx++) {
			// 만약 cal의 idx가 숫자(아스키코드 이용)이면
			if (cal.charAt(idx) - '0' >= 0 && cal.charAt(idx) - '0' <= 9) {
				calStack.push(cal.charAt(idx) - '0');
			} else {
				int temp1 = calStack.pop();
				int temp2 = calStack.pop();
				calStack.push(temp1 + temp2);
			}
		}
	}

	static void solve() {
		for (int tc = 1; tc <= 10; tc++) {
			makeWhowee();
			doCalc();
			System.out.println("#" + tc + " " + calStack.pop());
		}
	}

	public static void main(String[] args) {
		solve();
	}
}
