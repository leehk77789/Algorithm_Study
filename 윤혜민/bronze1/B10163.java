package baekjoon;

import java.util.Scanner;

public class B10163 {
	public static void main(String[] args) {
		// 색종이
		// 주어진 색종이를 모두 올려놓았을 때
		// 각 색종이들이 얼마만큼 보이는가
		Scanner sc = new Scanner(System.in);
		
		int[][] flat = new int[1001][1001];
		
		int paperNum = sc.nextInt();
		// 색종이에게 번호를 매겨주자 !
		// 나중에 구분하기 편하게
		for(int p = 1; p <= paperNum; p++) {
			int[] paperInfo = new int[4];
			for(int idx = 0; idx < 4; idx++) {
				paperInfo[idx] = sc.nextInt();
			}
			// idx 0 과 1 : 색종이의 왼쪽 아래 좌표
			// idx 2 와 3 : 색종이의 너비와 높이
			int x = paperInfo[0];
			int y = paperInfo[1];
			int width = paperInfo[2];
			int height = paperInfo[3];
			
			// 색종이의 좌표를 모두 입력받았다면
			// 전체 도화지에 좌표에 따라 색칠해주자
			// 앞서 p 로 색종이에게 번호를 매겼으니 p로 덮어버리자
			for(int i = x; i < x + width; i++) {
				for(int j = y; j < y + height; j++) {
					flat[i][j] = p;
				}
			}
				
		}
		// 이제 색종이가 덮일 때 마다 각 색종이의 번호로 도화지가 칠해졌을거다
		// 색종이 번호에 따라서 합을 구하자
		for(int p = 1; p <= paperNum; p++) {
			int sum = 0;
			for(int i = 0; i < flat.length; i++) {
				for(int j = 0; j < flat.length; j++) {
					if(flat[i][j] == p) {
						sum++;
					}
				}
			}
			System.out.println(sum);
		}		
	}
}
