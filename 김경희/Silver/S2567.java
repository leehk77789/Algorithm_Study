import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int papers = sc.nextInt();

		int[][] blankPaper = new int[100][100];

		for (int t = 0; t < papers; t++) { // 각 종이들

			// 색종이를 붙여줄 것이에요. 붙인 면적은 1이 됨.
			int smallerX = sc.nextInt(); // 입력받은 첫 수는 x축으로 치면 왼쪽, 작은 부분
			int smallerY = sc.nextInt(); // 입력받은 첫 수는 y축으로 치면 윗쪽, 작은 부분
			for (int i = smallerX; i < smallerX + 10; i++) { // 길이가 10이니깡
				for (int j = smallerY; j < smallerY + 10; j++) {

					blankPaper[i][j] = 1;
				}
			}
		}

		int[] dr = { -1, 1, 0, 0 }; // 상하좌우 델타.
		int[] dc = { 0, 0, -1, 1 };

		int count = 0; // 둘레 길이를 1씩 더해줄 것.

		// 탐색을 시작해봅시다.
		for (int r = 0; r < 100; r++) {
			for (int c = 0; c < 100; c++) {
				if (blankPaper[r][c] == 1) {

					// 1(사각형 부분)델타로 4방탐색
					// 주변에 0 있으면 count++ //0없으면 continue;(없어도..ㅎ되는 조건)

					for (int d = 0; d < 4; d++) {
						int nr = r + dr[d];
						int nc = c + dc[d];
						
						if(nr>=0 && nr<100 && nc>=0 && nc<100) {	// 델타 따라 움직일 때 인덱스를 벗어나지 않는 한에서
							if(blankPaper[nr][nc]==0) {	// 옆에 0이 있으면 하나 더 세준다.
								count++;
							}
						}
						if((nr==100 | nr== -1|nc==100| nc== -1)){
							count++;	//벽에 딱 달라붙어 있는 경우에도 더해준다.
						}
					}
				}
			}
		}

		System.out.println(count);

	}

}
