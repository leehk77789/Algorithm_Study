package day0222;

import java.util.Scanner;

public class SWEA_3499_퍼펙트셔플_정유준 {
	static Scanner sc = new Scanner(System.in);
	static String[] card, frontCard, backCard;
	static int cardCount;
	static int front, rear;

	static void input() {
		// front, rear 초기화
		front = -1;
		rear = -1;
		// 카드 개수 입력받고
		cardCount = sc.nextInt();
		// 카드 개수만큼의 String 배열 생성
		card = new String[cardCount];
		// 카드 개수 반만큼의 String 배열 생성
		if (cardCount % 2 == 1) {
			frontCard = new String[(cardCount / 2) + 1];
		} else {
			frontCard = new String[cardCount / 2];
		}
		backCard = new String[cardCount / 2];
		int i = 0;
		// 카드값 입력받기
		for (int idx = 0; idx < card.length; idx++) {
			card[idx] = sc.next();
		}

		// 절반으로 나눈 전반부, 후반부 카드팩 생성
		if (cardCount % 2 == 0) {
			for (int idx = 0; idx < (card.length / 2); idx++) {
				frontCard[idx] = card[idx];
			}
		} else {
			for (int idx = 0; idx < (card.length / 2) + 1; idx++) {
				frontCard[idx] = card[idx];
			}
		}
		if (cardCount % 2 == 0) {
			for (int idx = (card.length / 2); idx < card.length; idx++) {
				backCard[i] = card[idx];
				i++;
			}
		} else {
			for (int idx = (card.length / 2) + 1; idx < card.length; idx++) {
				backCard[i] = card[idx];
				i++;
			}
		}
	}

	// 가득 찼는지 여부 파악
	// Queue는 들어갈수록 rear가 증가하기 때문에
	// rear가 최대 인덱스(cardCount - 1)과 같으면 꽉 찬 것
	static boolean isFull() {
		return rear == cardCount - 1;
	}

	// 비었는지 여부 파악
	// Queue는 맨앞(front)와 증가위치(rear)가 -1에서 같이시작
	// front == rear라면, 입력(rear++)이 이루어지지 않았다는 의미
	static boolean isEmpty() {
		return front == rear;
	}

	// 원소 출력
	static void print() {
		if (isEmpty()) {
			System.out.println("큐가 비어있어서 출력이 불가능합니다.");
		} else {
			// front는 초기값이 -1이라서 +1해줘도 0부터 시작
			// rear의 최대값은 전체사이즈-1이라서 rear까지 가도 오류 안뜸
			for (int idx = front + 1; idx <= rear; idx++) {
				System.out.printf("%s ", card[idx]);
			}
		}
	}

	// Q에 집어넣기
	static void enQueue(String cardInput) {
		if (isFull()) {
			System.out.println("큐가 가득 차 더 이상 넣을 수 없습니다.");
		} else {
			card[++rear] = cardInput;
		}
	}

	// Q에서 삭제하고 리턴하기
	static String deQueue() {
		if (isEmpty()) {
			return "큐가 비어있어 deQueue를 실행할 수 없습니다";
		} else {
			return card[++front];
		}
	}

	// 현재 첫번째 원소(front+1)자리의 값 확인하기
	static String peek() {
		if (isEmpty()) {
			return "큐가 비어있어 peek를 실행할 수 없습니다.";
		} else {
			// 값을 빼내는 것이 아닌 확인만 하는 것이기 때문에
			// front의 값은 건들지 않고, +1로써 값만 확인
			return card[front + 1];
		}
	}

	static void shuffle() {
		card = new String[cardCount];
		int i = 0;
		int j = 0;
		if (cardCount % 2 == 0) {
			while (!isFull()) {
				enQueue(frontCard[i]);
				enQueue(backCard[i]);
				i++;
			}
		} else {
			while (!isFull()) {
				enQueue(frontCard[i]);
				if (i != frontCard.length - 1) {
					enQueue(backCard[i]);
				}
				i++;
			}
		}
	}

	static void solve() {
		int testCase = sc.nextInt();
		for (int tc = 1; tc <= testCase; tc++) {
			input();
			shuffle();
			System.out.print("#" + tc + " ");
			print();
			System.out.println();
		}
	}

	public static void main(String[] args) {
		solve();
	}
}
