package day0302;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SWEA_1873_상호의배틀필드_정유준 {
	static Scanner sc = new Scanner(System.in);
	static int H;
	static int W;
	static char[][] map;
	static Queue<Character> order;
	static int nowH;
	static int nowW;

	static void input() {
		H = sc.nextInt();
		W = sc.nextInt();

		// 새로운 맵 생성
		map = new char[H][W];

		// 맵 값들 입력받기
		for (int i = 0; i < H; i++) {
			String input = sc.next();
			for (int j = 0; j < W; j++) {
				map[i][j] = input.charAt(j);
			}
		}

		// orderAmount 만큼의 배열 생성
		int orderAmount = sc.nextInt();

		// 선입 선출 명령어이므로 Queue사용
		// 명령어 입력받아서 Queue에 넣어주기
		order = new LinkedList<Character>();
		String orderList = sc.next();
		for (int i = 0; i < orderAmount; i++) {
			order.add(orderList.charAt(i));
		}

		// 현재 전차가 어디있는지 찾기
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (map[i][j] == '^' || map[i][j] == '<' || map[i][j] == '>' || map[i][j] == 'v') {
					nowH = i;
					nowW = j;
				}
			}
		}
	}

	static void moveAround(char move) {
		// 명령어 U이면 방향 위쪽으로 바꾸고 위쪽이 평지이고 맵의 크기에서 벗어나지 않으면 이동
		if (move == 'U') {
			map[nowH][nowW] = '.';
			if ((nowH - 1) >= 0 && map[nowH - 1][nowW] == '.') {
				nowH--;
			}
			map[nowH][nowW] = '^';
		}
		// 명령어 D이면 방향 아래쪽으로 바꾸고 아래쪽이 평지이고 맵의 크기에서 벗어나지 않으면 이동
		else if (move == 'D') {
			map[nowH][nowW] = '.';
			if ((nowH + 1) < H && map[nowH + 1][nowW] == '.') {
				nowH++;
			}
			map[nowH][nowW] = 'v';
		}
		// 명령어 L이면 방향 왼쪽으로 바꾸고 왼쪽이 평지이고 맵의 크기에서 벗어나지 않으면 이동
		else if (move == 'L') {
			map[nowH][nowW] = '.';
			if ((nowW - 1) >= 0 && map[nowH][nowW - 1] == '.') {
				nowW--;
			}
			map[nowH][nowW] = '<';
		}
		// 위의 3개 케이스에 해당하지 않으면 오른쪽이므로 방향 오른쪽으로 바꾸고, 벗어나지 않으면 이동
		else {
			map[nowH][nowW] = '.';
			if ((nowW + 1) < W && map[nowH][nowW + 1] == '.') {
				nowW++;
			}
			map[nowH][nowW] = '>';
		}

		// 출력
//		for (int i = 0; i < H; i++) {
//			for (int j = 0; j < W; j++) {
//				System.out.print(map[i][j]);
//			}
//			System.out.println();
//		}
//		System.out.println("==========");
	}

	static void shoot() {
		// 전차가 바라보고 있는 방향이 위쪽일 때
		if (map[nowH][nowW] == '^') {
			int shootH = nowH;
			if (shootH == 0) {
				map[nowH][nowW] = '^';
			} else {
				while (true) {
					shootH--;
					if (shootH == -1) {
						break;
					} else if (map[shootH][nowW] == '*') {
						map[shootH][nowW] = '.';
						break;
					} else if (map[shootH][nowW] == '#') {
						map[shootH][nowW] = '#';
						break;
					}
				}
			}
		}

		// 전차가 바라보고 있는 방향이 아래쪽일 때
		if (map[nowH][nowW] == 'v') {
			int shootH = nowH;
			if (shootH == H - 1) {
				map[nowH][nowW] = 'v';
			} else {
				while (true) {
					shootH++;
					if (shootH == H) {
						break;
					} else if (map[shootH][nowW] == '*') {
						map[shootH][nowW] = '.';
						break;
					} else if (map[shootH][nowW] == '#') {
						map[shootH][nowW] = '#';
						break;
					}
				}
			}
		}

		// 전차가 바라보고 있는 방향이 왼쪽일 때
		if (map[nowH][nowW] == '<') {
			int shootW = nowW;
			if (shootW == 0) {
				map[nowH][nowW] = '<';
			} else {
				while (true) {
					shootW--;
					if (shootW == -1) {
						break;
					} else if (map[nowH][shootW] == '*') {
						map[nowH][shootW] = '.';
						break;
					} else if (map[nowH][shootW] == '#') {
						map[nowH][shootW] = '#';
						break;
					}
				}
			}
		}

		// 전차가 바라보고 있는 방향이 오른쪽일 때
		if (map[nowH][nowW] == '>') {
			int shootW = nowW;
			if (shootW == W - 1) {
				map[nowH][nowW] = '>';
			} else {
				while (true) {
					shootW++;
					if (shootW == W) {
						break;
					} else if (map[nowH][shootW] == '*') {
						map[nowH][shootW] = '.';
						break;
					} else if (map[nowH][shootW] == '#') {
						map[nowH][shootW] = '#';
						break;
					}
				}
			}
		}

		// 출력
//		for (int i = 0; i < H; i++) {
//			for (int j = 0; j < W; j++) {
//				System.out.print(map[i][j]);
//			}
//			System.out.println();
//		}
//		System.out.println("==========");
	}

	static void playGame() {
		while (!order.isEmpty()) {
			char nowOrder = order.remove();
			if (nowOrder == 'U' || nowOrder == 'D' || nowOrder == 'L' || nowOrder == 'R') {
				moveAround(nowOrder);
			} else if (nowOrder == 'S') {
				shoot();
			}
		}
	}

	static void solve() {
		int testCase = sc.nextInt();
		for (int idx = 1; idx <= testCase; idx++) {
			input();
			playGame();
			System.out.print("#" + idx + " ");
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					System.out.print(map[i][j]);
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		solve();
	}
}
