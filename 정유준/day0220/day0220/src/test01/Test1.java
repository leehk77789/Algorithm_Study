package test01;

public class Test1 {
	static int[] arr = new int[10];
	static int top = -1;

	public static void main(String[] args) {
		push(1);
		push(2);
		push(3);

		while (!isEmpty()) {
			System.out.println(pop());
		}
	}

	// 스택이 비어있는지
	static boolean isEmpty() {
		return top == -1;
	}

	// 스택이 가득 차 있는지
	static boolean isFull() {
		return top == arr.length - 1;
	}

	static void push(int x) {
		if (top == arr.length - 1) { // 스택이 가득 차있다면
			System.out.println("stack overflow");
		} else {
			arr[++top] = x; // 먼저 top을 증가시킨 후 인덱스를 사용
		}
	}

	static int pop() {
		if (top == -1) { // 스택이 비어있다면
			System.out.println("stack is empty.");
			return -1;
		} else {
			return arr[top--]; // 먼저 인덱스를 사용한 다음 top을 감소
		}
	}

	static void print() {
		for (int i = 0; i <= top; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}
