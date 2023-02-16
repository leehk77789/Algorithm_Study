package day0214;

import java.util.Scanner;

public class bj_2477 {

	public static void main(String[] args) {
		
		// 1 째 줄에는 1m제곱 참외 개수
		// 2-7 째줄 : 반시계방향으로 돌면서 지나는 변의 길이와 방향이 주어짐
		// 동 1 서 2 남 3 북 4

		Scanner sc = new Scanner(System.in);

		// 면적 당 참외 개수
		int num = sc.nextInt();
		
		int bigBox=0;
		
		int smallBox=0;
			
		int[] arr = new int[13];

		int[] dirc = new int[5];

		// 직사각형에서 그냥 작은 직사각형 빼면 되잖아 ?
		// 4랑 3중에 큰 거 선택
		// 1이랑 2중에 큰 거 선택
		// 만약에 1 3 1 3 이렇게 반복되면 얘네가 작은사각형임

		// 입력을 받아보자
		for (int idx = 1; idx < 13; idx++) {
			arr[idx] = sc.nextInt();
		}
		
		arr[0]=arr[12];

		// 방향인덱스인데
		for (int idx = 1; idx < 12; idx += 2) {
			// 어차피 방향인덱스가 0일수는 없으니까 범위 2 늘려주고
			// 일치하는게나오면
	
			if (arr[idx] == arr[(idx + 4) % 12]) {
				
	
				//큰 박스의 x,y 값 찾기
				if(arr[(idx+2)%12]==arr[(idx+6)%12]) {
				
					bigBox=arr[(idx+9)%12]*arr[(idx+11)%12];
					smallBox=arr[(idx+3)%12]*arr[(idx+5)%12];
				}
				
				else {
					bigBox=arr[(idx+7)%12]*arr[(idx+9)%12];
					smallBox=arr[(idx+1)%12]*arr[(idx+3)%12];
				
				}
				
				System.out.println((bigBox-smallBox)*num);
				System.exit(0);
			}

		}
	}
}