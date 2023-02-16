package baekjoon;

import java.util.Scanner;

public class S2527 {
	// 갓버1 직사각형
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 4; i++) {
			// 사각형 두개로 배열을 나눠 받아봅시다 4개씩
			int[] square1 = new int[4];
			int[] square2 = new int[4];
			for (int idx = 0; idx < 4; idx++) {
				square1[idx] = sc.nextInt();
			}
			for (int idx = 0; idx < 4; idx++) {
				square2[idx] = sc.nextInt();
			}
			
			// 우리에게는 4가지 경우의 수가 존재합니다
			// 1. 완전히 분리일 때
			//    이 두 직사각형의 x좌표 값이 혹은 y좌표 값이 전혀 겹치지 않는다면
			//    x좌표나 y좌표 둘 중 하나라도 완전 그 좌표 4개를 나열했을때 증가하는 방향이라면
			//    두 직사각형은 전혀 겹치지 않습니다
			//    이때, 어차피 한 직사각형의 첫번째 x좌표보다 두번쨰 x좌표가 더 크므로
			//    첫번째 직사각형의 두번쨰 x좌표보다 두번째 직사각형의 첫 x좌표가 크다면? 을 확인합니다
			//    뭐 앞뒤로도 바꿔보고 y로도 해보고 다 해봅니다 그럼 총 4가지 경우의 수가 존재하겠져
			//    그것이 첫번째 if문 결과 d
			// 2. 점이나 선분이 겹칠때
			//    자 일단 그럼 첫 if문을 통과했으니 조금이라도 겹치는 부분이 있다는 뜻이겠져
			//    점이나 선분이 겹치려면 두 직사각형의 좌표 중 일치하는 값이 있어야 합니다
			//    일치하는 부분이 있는지 확인하는 것이 else if문
			//    만약 일치하는 부분이 있다면 그게 점인지 선분인지 구분해봅시다
			// 2-1. 점일 떄
			//		와 나 이거 이렇게 보니까 나도 헷갈린다
			//		좌표 두 값이 같아야 한다는건 확실해여
			// 2-2. 선분일 때
			//		이건 이제 좌표가 하나만 같을 때
			// 3. 그리고 나머지는 그냥 얼레벌레 꼬인거 
			if ((square1[2] < square2[0] || square1[3] < square2[1]) ||(square1[0] > square2[2] || square1[1] > square2[3]) ) {	
				System.out.println("d");
			} else if ( square1[0]==square2[2] || square1[2]==square2[0] || square1[1]==square2[3] || square1[3]==square2[1]) {
				if(square1[0]==square2[2] && square1[1]==square2[3] || square1[0]==square2[2] && square1[3]==square2[1] || square1[2]==square2[0] && square1[1]==square2[3] || square1[2]==square2[0] && square1[3]==square2[1]  ) {
					System.out.println("c");
				}else{
					System.out.println("b");				
				}
			}else {
				System.out.println("a");
			}
		}
	}
}