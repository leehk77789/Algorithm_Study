package day0213;

import java.util.Scanner;

/*
테스트 케이스 10개로 고정
각 테스트 케이스마다 빌딩의 개수를 입력받는다
빌딩의 개수만큼 배열을 생성 -> 빌딩 높이 입력받기
빌딩의 높이를 입력받아서 배열에 저장
배열을 하나씩 확인하면서 좌, 우 2칸까지 확인 
	- 나보다 더 큰 빌딩이 있다면, 조망권 확보 불가능
	- 나보다 더 큰 빌딩이 없다면, 조망권 확보 할 수 있는 층이 존재
조망권을 확보할 수 있는 층을 모두 더해 출력한다
*/
public class ViewAnswer {
	static int[] checkBuildingIdx = { -1, 1, -2, 2 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1. 테스트 케이스의 개수는 10개로 고정
		for (int tc = 1; tc <= 10; tc++) {
			// 2. 빌딩의 개수를 입력받는다.
			int buildingCount = sc.nextInt();
			int[] buildingList = new int[buildingCount];

			// 3. 빌딩의 높이를 입력받아서 배열에 저장하자
			for (int idx = 0; idx < buildingCount; idx++) {
				buildingList[idx] = sc.nextInt();
			}

			// 조망권을 확보할 수 있는 층을 모두 더할 수 있는 변수
			int sumViewCount = 0;

			// 4. 배열을 순회 -> 빌딩들의 높이를 확인하는 과정
			// 양 옆 2칸은 0이므로 해당 idx는 제외
			for (int idx = 2; idx < buildingCount - 2; idx++) {
				int maxBuildingHeight = -1;
				// 5. 현재 나보다 더 큰 빌딩이 존재하는지 확인
				// 델타배열 사용
				for (int checkIdx = 0; checkIdx < 4; checkIdx++) {
					// 현재 내 위치 > 양옆 2칸의 빌딩 높이
					if (buildingList[idx] <= buildingList[idx + checkBuildingIdx[checkIdx]]) {
						maxBuildingHeight = -1;
						break;
					}
					maxBuildingHeight = Math.max(maxBuildingHeight, buildingList[idx + checkBuildingIdx[checkIdx]]);
				}

				// 조망권을 확보할 수 있는 층
				if (maxBuildingHeight != -1) {
					sumViewCount += (buildingList[idx] - maxBuildingHeight);
				}
			}
			System.out.println("#" + tc + " " + sumViewCount);
		}

	}
}
