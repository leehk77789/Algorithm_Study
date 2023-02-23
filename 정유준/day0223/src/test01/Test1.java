package test01;

public class Test1 {
	static int n = 5;
	static int[] arr = new int[5];
	static int front = 0, rear = 0;

	public static void main(String[] args) {
		enQueue(1);
		enQueue(2);
		enQueue(3);
		enQueue(4);
		enQueue(5);
	}

	static boolean isEmpty() {
		return front == rear;
	}

	static boolean isFull() {
		return (rear + 1) % n == front;
	}

	static void enQueue(int item) {
		if (isFull()) {
			System.out.println("큐가 가득찼습니다.");
		} else {
			rear = (rear + 1) % n;
			arr[rear] = item;
		}
	}

	static int deQueue() {
		if (isEmpty()) {
			return -1;
		} else {
			front = (front + 1) % n;
			return arr[front];
		}
	}

}
