package day0223;

import java.util.Scanner;

public class SWEA_1225_암호생성기_정유준 {

	static Scanner sc = new Scanner(System.in);
	static Queue q;

	public static class Queue {
		int front = 0;
		int rear = 0;
		int count = 1;
		int[] password = new int[9];

		public int enQueue(int item) {
			if (isFull()) {
				System.out.println("더 이상 넣을 수 없습니다.");
				return -1;
			} else {
				rear = (rear + 1) % password.length;
				password[rear] = item;
				return password[rear];
			}
		}

		public int deQueue() {
			if (isEmpty()) {
				System.out.println("이미 큐가 비어있습니다.");
				return -1;
			} else {
				front = (front + 1) % password.length;
				return password[front];
			}
		}

		public int peek() {
			if (isEmpty()) {
				System.out.println("큐가 비어있습니다");
				return -1;
			} else {
				return password[front + 1];
			}
		}

		public boolean isFull() {
			return (rear + 1) % password.length == front;
		}

		public boolean isEmpty() {
			return rear == front;
		}

		public void print() {
//			if (isEmpty()) {
//				System.out.println("큐가 비어있습니다.");
//			} else {
//				for (int idx = front + 1; idx < password.length + front; idx++) {
//					System.out.print(password[idx % 9] + " ");
//				}
//				System.out.println();
//			}

			while (!isEmpty()) {
				System.out.printf("%d ", deQueue());
			}
			System.out.println();
		}

		public void makePassword() {
			while (true) {
				int check = deQueue() - count;
				if (check > 0) {
					enQueue(check);
				} else {
					enQueue(0);
					break;
				}
				count++;
				if (count == 6) {
					count = 1;
				}
			}
		}
	}

	static void input() {
		q = new Queue();
		for (int i = 0; i < 8; i++) {
			q.enQueue(sc.nextInt());
		}
	}

	public static void main(String[] args) {
		for (int idx = 1; idx <= 10; idx++) {
			sc.nextInt();
			input();
			q.makePassword();
			System.out.print("#" + idx + " ");
			q.print();
		}
	}

}
