package baekjoon;

import java.util.Scanner;

public class S2563 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 색종이
		
		// 흰 도화지에 색종이를 올릴거에여
		// 도화지를 100*100 배열로 놓아여
		int[][] square = new int[100][100];
		// 근데 어차피 초기값 0이라서 이 이중for문 돌 필요 업음
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < 100; j++) {
				square[i][j] = 0;
			}
		}		
		// 종이의 수를 입력받아여
		int paperNum = sc.nextInt();
		for(int i = 0; i < paperNum; i++) {
			// 자자 종이를 받았어요
			// 종이의 좌표를 배열로 받아봅시다
			int[] colorPaper = new int[2];
			for(int idx = 0; idx < 2; idx++) {
				colorPaper[idx] = sc.nextInt();
			}
			// 그리고 색종이의 크기는 10*10이니까
			// 색종이의 좌표를 저 큰 도화지에서 찾아서
			// 도화지의 값을 1로 바꿔버려여!
			// 이전 색종이에 의해 이미 1로 바뀌어 있다면 그냥 쓰루하겠져
			for(int n = colorPaper[0]; n < colorPaper[0] + 10; n++) {
				for(int m = colorPaper[1]; m < colorPaper[1] + 10; m++) {
					if(square[n][m] == 0) {
						square[n][m] = 1;
					}
				}
			}
		}
		
		// 자자 이제 색종이가 쌓인 부분은 1일 것이고 아니면 0이겠져
		// 도화지 싸악 돌면서 합을 구해주면 끝
		int sum = 0;
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < 100; j++) {
				sum += square[i][j];
			}
		}		
		System.out.println(sum);
	}
}
