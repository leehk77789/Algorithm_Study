package day0321;

import java.util.Arrays;

public class 정유준_조합 {
	static String[] nums = { "1", "2", "3", "4", "5" };
	static int totalLength;
	static int pickAmount;
	static String[] answer;

	public static void main(String[] args) {
		totalLength = nums.length; // 1, 2, 3, 4, 5니깐 5개
		pickAmount = 3; // 나는 5개중에 3개를 고를거야
		answer = new String[pickAmount]; // 답을 넣을 배열
		combination(0, 0);
	}

	// idx는 12345중에 내가 지금 어디를 보고있는지, nowIdx는 고를 3개중 몇번째로 고를 부분인지
	static void combination(int idx, int nowIdx) {
		// 만약에 nowIdx가 3이면 이미 pickAmount인 3을 다채운것이므로 print해주고 종료
		if (nowIdx == pickAmount) {
			System.out.println(Arrays.toString(answer));
			return;
		}

		// 어떤 경우에 combination을 재실행할 것인가
		// 내 현재 위치부터(이전 위치는 이미 전부 탐색이 완료)
		for (int i = idx; i <= totalLength - pickAmount + nowIdx; i++) {
			answer[nowIdx] = nums[i];
			combination(i + 1, nowIdx + 1);
		}
	}
}
