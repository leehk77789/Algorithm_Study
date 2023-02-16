package baekjoon;

import java.util.Scanner;

public class S2477 {
	// 참외서리 ㄱㄱ
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int K = sc.nextInt();
		// 참외밭 배열 받기
		// 어차피 사이즈는 저거 고정임
		int[][] melon = new int[6][2];

		// 입력받기
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 2; j++) {
				melon[i][j] = sc.nextInt();
			}
		}
		// 참외밭은 어쨌든 ㄱ자 모양일거고
		// 큰 사각형에서 작은 사각형을 뺴 주는 방식으로 구할고애여
		
		// 그럼 먼저 큰 사각형을 구해봅시다
		
		// 참외밭이 동서남북 4방향으로 전진할텐데
		// 동서방향과 남북방향에서 가장 큰 값이 큰 사각형의 가로세로가 되겠지용
		// 동서남북이니까 크기 4짜리 배열을 만듭니당
		int[] melonList = new int[4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 6; j++) {
				// 우리는 멜론의 0번 인덱스 정보(방향정보)를 받아서
				// 멜론의 1번 인덱스 정보(길이정보)를 멜론리스트에 저장할거랍니다
				if (melon[j][0] == i + 1) {
					// 동서남북은 1234이고 인덱스는 0123이니까 1을 더해줘여
					// 맞으면 멜론리스트에 길이정보를 집어넣습니당
					melonList[i] += melon[j][1];
					// 그러면 멜론리스트의 0123 인덱스에 동서남북 최대길이가 들어갑니당
				}
			}

		}
		// 이제 작은 사각형을 구해봅시다
		// 오또케?
		
		// 우리의 참외밭은 ㄱ자 모양이니
		// 우리가 받게될 배열은 무조건적으로 방향 두개가 반복되는 부분이 있을거야요
		// 지금 테케를 보면 4 2 3 1 3 1 이잖아여?
		// 3 1 3 1 이 구간이 ㄱ자에서 안쪽으로 꺾이는 구간이고
		// 그 사이의 1 3 일때 가로세로 이동거리가 작은 사각형의 가로세로가 댑니다.
		// 구하러 ㄱㄱ
		int resMelon1 = 0;
		int resMelon2 = 0;
		// 그럼 저 멜론배열의 인덱스를 다 돌면서 반복되는 구간을 찾아야겠져
		// 인덱스가 배열 밖으로 넘어가면 안되니까 6으로 나눈 나머지로 생각해봅시다
		for (int i = 0; i < 6; i++) {
			if (melon[i][0] == melon[(i + 2) % 6][0] && melon[(i + 1) % 6][0] == melon[(i + 3) % 6][0]) {
				// 그래서 같은 구간을 찾게 되면
				// 그때의 이동거리 값을 resMelon으로 저장합니당
				// 그게 작은 사각형의 가로세로가 댑니다
				resMelon1 = melon[(i + 1) % 6][1];
				resMelon2 = melon[(i + 2) % 6][1];
			}
		}
		// 그럼 머 계산만 하면 댐 끝
		int result = (melonList[0] * melonList[2] - resMelon1 * resMelon2) * K;
		System.out.println(result);
	}
}
