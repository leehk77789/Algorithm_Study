package day0304;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_11866_요세푸스문제0_정유준 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int humanNum = sc.nextInt();
		int[] arr = new int[humanNum];
		int countNum = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		int count = 1;
		int nowIdx = 0;
		int answerIdx = 0;
		ArrayList<Integer> answer = new ArrayList<>();
		while (true) {
			if (count == countNum + 1) {
				count = 1;
			}

			if (nowIdx == humanNum) {
				nowIdx = 0;
			}

			if (arr[nowIdx] == 0) {
				nowIdx++;
				continue;
			}

			if (count == countNum) {
				answer.add(arr[nowIdx]);
				arr[nowIdx] = 0;
			}

			int zeroCount = 0;

			for (int idx = 0; idx < arr.length; idx++) {
				if (arr[idx] == 0) {
					zeroCount++;
				}
			}
			if (zeroCount == humanNum) {
				break;
			}

			count++;
			nowIdx++;
		}
		System.out.print("<");
		for (int i = 0; i < answer.size(); i++) {
			if (i == answer.size() - 1) {
				System.out.print(answer.get(i));
			} else {
				System.out.print(answer.get(i) + ", ");
			}
		}
		System.out.print(">");
	}
}
