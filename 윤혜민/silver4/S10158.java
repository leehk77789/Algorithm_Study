package baekjoon;

import java.util.*;

public class S10158 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ㄱ ㅐ ㅁ ㅣ..,,
		
		// 사실 이 문제는 딱 보면 델타로 풀면 되겠ㄴ ㅐㅋ 라는 생각이 들어
		// 바로 델타로 풀고 제출했지만
		// 내눈앞에 나타난 시간초과 그리고 제한시간 0.15초
		// == 절대로 델타로 못푼다
		// 그러니 다른 방법으로 풀자!
		int width = sc.nextInt();
		int height = sc.nextInt();

		int originX = sc.nextInt();
		int originY = sc.nextInt();

		int time = sc.nextInt();

		int resultX = 0;
		int resultY = 0;

		// 대각선으로 이동하긴 하지만 결국 이 좌표라는건 가로세로 각자 가는거니까
		// 따로 봐도 된다
		// 여기서 time은 이동하는 칸 수 로 봐도 무방하다
		
		// X좌표의 이동을 보자
		// 큰 if문에서 저게 짝수인지 홀수인지 보는 이유는 
		// 마지막에 도착지점에 도착하는 순간이 
		// 아래에서 올라오는 방향인지 위에서 내려오는 방향인지 구분하기 위해서다
		// 이에 따라 0에서 나머지를 더할지 아니면 width에서 나머지를 뺼지를 결정한다
		if ((originX + time) / width % 2 == 1) {
			// 혹시 0이 나오게 된다면 0을 출력하는게 아닌 벽의 값인 width를 출력하자
			if ((originX + time) % width != 0) {
				resultX = width - (originX + time) % width;
			} else {
				resultX = width;
			}
		} else if ((originX + time) / width % 2 == 0) {
			resultX = (originX + time) % width;
		}

		// y좌표도 마찬가지지롱
		if ((originY + time) / height % 2 == 1) {
			if ((originY + time) % height != 0) {
				resultY = height - (originY + time) % height;
			} else {
				resultY = height;
			}
		} else if ((originY + time) / height % 2 == 0) {
			resultY = (originY + time) % height;
		}

		// 끝
		System.out.println(resultX + " " + resultY);

	}
}
