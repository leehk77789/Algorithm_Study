package Bronze;

import java.util.Scanner;

public class 색종이10163 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] floor = new int[1001][1001]; // 색종이가 놓일 곳

		int papers = sc.nextInt(); // 몇 장인가요

		for (int p = 1; p <= papers; p++) { // 번호 p에 맞는 숫자를 넓이에 맞게 뿌려줄 것.

			// x를 배열에서의 row처럼, y를 col처럼 사용한다. 평면을 우 90도 돌려서 생각하면 쉽다.
			int x = sc.nextInt();
			int y = sc.nextInt();
			int width = sc.nextInt();
			int height = sc.nextInt();

			spreadIt(floor, p, x, y, width, height);

		} // 깔아주기 끝
		
		
		// 세고 출력
		for (int p = 1; p <= papers; p++) {
			whereIsIt(floor, p);
		}
	}

	// 색종이를 깔아줄 메서드
	private static void spreadIt(int[][] arr, int p, int x, int y, int w, int h) {
		// 주어진 범위만큼 돌아다니며 덮어주겠어요
		for (int i = x; i < x + w; i++) {
			for (int j = y; j < y + h; j++) {
				arr[i][j] = p;
			}
		}
	}

	// 색종이의 보이는 면적을 세어주고 출력해줄 메서드. 모두 깔아주고 난 후 사용
	private static void whereIsIt(int[][] arr, int p) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] == p)
					count++;
			}
		}
		System.out.println(count);
	}
}
