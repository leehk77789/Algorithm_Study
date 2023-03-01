package day0223;

public class Stack {
	int[] stack;
	// 기본 top은 -1에서 시작
	int top = -1;
	int stackSize;

	public Stack(int stackSize) {
		super();
		this.stackSize = stackSize;
		stack = new int[stackSize];
	}

	// 값 넣기
	void push(int num) {
		if (top == stack.length - 1) {
			System.out.println("이미 스택이 꽉 참");
		} else {
			stack[++top] = num;
		}
	}

	// 최상위 인덱스의 값을 리턴하고, top을 1빼줌
	int pop() {
		// top이 -1에 위치해있으면 아직 스택에 아무것도 들어있지 않음
		if (top == -1) {
			System.out.println("빈 스택");
			return -1;
		} else {
			// 해당 자리에 있는 값을 리턴한 이후에 top에서 1을 뺀다
			return stack[top--];
		}
	}

	// 비어있는지 확인
	boolean isEmpty() {
		return top == -1;
	}

	// 꽉 찼는지 확인
	boolean isFull() {
		return top == stack.length - 1;
	}

	// 스택에 있는 내용들을 출력
	void print() {
		for (int idx = 0; idx < stack.length; idx++) {
			if (stack[idx] == 0) {
				continue;
			} else {
				System.out.println("idx번째 스택 : " + stack[idx] + " ");
			}
		}
	}
}
