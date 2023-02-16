package baekjoon;

import java.util.Scanner;

public class B2309 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 가짜 난쟁이를 찾아보아용
		
		// 먼저 모든 난쟁이들을 입력받습니다
		int[] kids = new int[9];
		for(int i = 0; i < 9; i++) {
			kids[i] = sc.nextInt();
		}
		// 난쟁이들의 키를 다 더해줄거에여
		int sum = 0;
		for(int i = 0; i < 9; i++) {
			sum += kids[i];
		}
		// 그리고 그 합에서 100을 뺍니다
		// 그 res값에 포함되는 난쟁이가 짭 난쟁이일거에여
		int res = sum - 100;
		x : for(int i = 0; i < 9; i++) {
			for(int j = i+1; j < 9; j++) {
				// 난쟁이 배열을 순회하면서
				// 두 난쟁이를 더했을 때 res가 되는 놈들을 찾습니당
				if(kids[i] + kids[j] == res) {
					kids[i] = 0;
					kids[j] = 0;	
					// 찾았으면 for문 다 뛰쳐나가ㅏㅏ!!!!!
					// 걔네들을 0으로 바꿔줍니다
					
					// 만약에 그냥 break를 쓰면 for문을 하나만 나가서
					// for문을 더 돌수도 있어요
					break x;
				}
			}
		}
		// 자 이제 난쟁이 배열을 오름차순으로 정렬해줍니다
		// 어레이소트를 쓰려다가 간지나게 수업시간에 배운 버블을 사용했어요
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 8; j++) {
				if(kids[j] > kids[j+1]) {
					int tmp = kids[j+1];
					kids[j+1] = kids[j];
					kids[j] = tmp;
				}
			}
		}
		// 그러면 인덱스 0과 1의 값은 짭 난쟁이인 0이 되겠지용
		// 인덱스 2부터 뽑아줍니다
		// 끝!
		for(int i = 2; i < 9; i++) {
			System.out.println(kids[i]);
		}
	}
}