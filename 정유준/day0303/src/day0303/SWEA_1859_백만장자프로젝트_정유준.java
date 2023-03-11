package day0303;

import java.io.IOException;
import java.util.Scanner;

//가격 배열 입력 받고
//배열 뒤쪽부터 순회하면서
//가격이 최대인 가격 찾고
//최대가격과 현재가격의 차익을 저장
public class SWEA_1859_백만장자프로젝트_정유준 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int testCase = Integer.parseInt(sc.nextLine());
		String[] read;

		for (int idx = 1; idx <= testCase; idx++) {
			int N = Integer.parseInt(sc.nextLine());

			int[] price = new int[N]; // 가격 배열
			int maxPrice = 0;
			long profit = 0; // 총이익

			read = sc.nextLine().split(" ");
			for (int i = 0; i < N; i++) {
				price[i] = Integer.parseInt(read[i]);
			}

			// 마지막날부터 순회하면서
			for (int j = N - 1; j >= 0; j--) {
				// 현재까지의 최대 가격
				maxPrice = Math.max(maxPrice, price[j]);

				// (최대가격 - 현재 가격) 총이익 추가
				profit += maxPrice - price[j];
			}
			System.out.println("#" + idx + " " + profit);
		}
	}
}