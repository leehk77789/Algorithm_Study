package day0213;

import java.util.Scanner;

public class View {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			//빌딩 개수 입력
			int N = sc.nextInt();
			//빌딩 개수만큼의 배열 생성
			int[] buildingHeight = new int[N];
			for(int j = 0; j < N; j++) {
				//빌딩 높이 입력
				buildingHeight[j] = sc.nextInt();
			}
			
			//총 세대수
			int sum = 0;
			//조망권 확보 조회
			for(int j = 2; j < N-2; j++) {
				int left1 = buildingHeight[j] - buildingHeight[j-1];
				int right1 = buildingHeight[j] - buildingHeight[j+1];
				int left2 = buildingHeight[j] - buildingHeight[j-2];
				int right2 = buildingHeight[j] - buildingHeight[j+2];
				
				//일단 4개 다 가운데 값보다 작아야함
				if (left1 > 0 && right1 > 0 && left2 > 0 && right2 > 0) {
					//4개를 가운데랑 비교해서 차이의 최소값을 더해주기(조망권 확보된 세대)
					if((left1 >= left2) && (right1 >= right2)) {
						sum += Math.min(left2, right2);
					} else if((left1 <=  left2) && (right1 >= right2)) {
						sum += Math.min(left1, right2);
					} else if ((left1 >= left2) && (right1 <= right2)) {
						sum += Math.min(left2, right1);
					} else if((left1 <= left2) && (right1 <= right2)){
						sum += Math.min(left1, right1);
					} else {
						//오류 탐색
						System.out.printf("left2:%d left1:%d right1:%d right2:%d j=%d ", left1, left2, right1, right2, j);
					}
				}
			}
			System.out.print("#" + (i+1) + " " + sum);
			System.out.println();
		}
		sc.close();
	}
}
