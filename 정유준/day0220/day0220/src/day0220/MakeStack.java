package day0220;

import java.util.Scanner;

public class MakeStack {
	static Scanner sc = new Scanner(System.in);
	static int[] stack;
	// 기본값은 -1에서 시작해서 ++을 선 증가해준다음에 넣어준다.
	static int top = -1;

	static void input() {
		System.out.println("스택의 크기를 입력해주세요 : ");
		int stackSize = sc.nextInt();
		stack = new int[stackSize];
	}

	static void push(int num) {
		if (top == stack.length - 1) { // 이미 top이 배열에 끝자리에 있으므로 꽉 찬 상태
			System.out.println("이미 꽉 찬 스택입니다.");
		} else {
			// top은 -1에서 시작하기 때문에 ++해서 넣어줘도 초기값이 0인덱스에 들어간다.
			stack[++top] = num;
		}
	}

	// 최상위 인덱스에 있는 값을 리턴하고, top의 값을 --
	static int pop() {
		// top이 -1이면 아무것도 없는값
		if (top == -1) {
			System.out.println("빼낼 값이 없습니다. 빈 배열입니다.");
			return -1;
		} else {
			// 해당 자리에 있는 값을 빼 주고 top의 값을 줄여준다.
			return stack[top--];
		}
	}

	// 배열이 비어있는지
	static boolean isEmpty() {
		// top이 -1이면 비어있는 배열이므로 top이 -1인지 여부에 대한 참/거짓 리턴
		return top == -1;
	}

	static boolean isFull() {
		// top이 전체개수-1에 위치해있으면, 이미 꽉 찬 배열이므로 꽉 찼는지 아닌지에 대한 참/거짓 리턴
		return top == stack.length - 1;
	}

	static void print() {
		for (int idx = 0; idx < stack.length; idx++) {
			System.out.print(stack[idx] + " ");
		}
	}

	public static void main(String[] args) {
		input();
		push(1);
		push(2);
		push(3);
		print();
		while (!isEmpty()) {
			pop();
		}
	}
}
