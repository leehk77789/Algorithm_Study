package day0321;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_2817_부분순열의합_정유준_부분집합 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int givenNum;
	static int[] numArr;
	static int length;
	static int count;
	static int sum;

	static void input() throws IOException {
		String[] input = br.readLine().split(" ");
		// N값, K값 받기
		int[] num = new int[input.length];
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(input[i]);
		}

		int numLength = num[0];
		givenNum = num[1];

		// 자연수 수열 A만들기
		numArr = new int[numLength];
		input = br.readLine().split(" ");
		for (int i = 0; i < input.length; i++) {
			numArr[i] = Integer.parseInt(input[i]);
		}

		// 끝내는 조건을 위한 static변수 설정
		length = numArr.length;

		// input받을 시 다음 테케이므로 count초기화
		count = 0;
		sum = 0;
	}

	static void subset(int idx) {
		// idx(내가 이동하고 있는 현재 위치)가 끝이면 끝까지 서치를 다 한것이므로
		// boolean에서 몇번째 인덱스가 true인지 체크하여 해당 인덱스에 있는 숫자들을 sum에 더해준다.
		if (sum > givenNum) { // sum이 넘어가면 고려할 필요 x
			return;
		}
		if (idx == length) {
//			int sum = 0;
//			for (int i = 0; i < length; i++) {
//				if (check[i]) {
//					sum += numArr[i];
//				}
//			}
			if (sum == givenNum) {
				count++;
			}
			return;
		}
//나는 sum을 중간 중간 더해서 givenNum 넘으면 바로 리턴해버림
		// subset재호출
//		check[idx] = true; // 이게 이번 idx애를 넣는다는 얘기잖아 ==
		sum += numArr[idx]; // 더하면 넣는 거랑 똑같음
		subset(idx + 1); // 더했다고 가정하고 재귀 넘기고
		sum -= numArr[idx]; // 다시 되돌리고
//		check[idx] = false;
		subset(idx + 1); // 안넣었다고 가정하고 재귀
	}

	static void solve() throws IOException {
		int testCase = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= testCase; tc++) {
			input();
			subset(0);
			System.out.println("#" + tc + " " + count);
		}
	}

	public static void main(String[] args) throws IOException {
		solve();
	}
}
