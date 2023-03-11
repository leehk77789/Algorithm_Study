package day0304;

import java.util.Scanner;

public class BOJ_7568_덩치_정유준 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int humanNum = sc.nextInt();

		int[][] arr = new int[humanNum][2];

		for (int i = 0; i < humanNum; i++) {
			int weight = sc.nextInt();
			int hight = sc.nextInt();

			arr[i][0] = weight;
			arr[i][1] = hight;
		}

		for (int i = 0; i < humanNum; i++) {
			int count = 1;
			for (int j = 0; j < humanNum; j++) {
				if (j == i) {
					continue;
				}
				if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					count++;
				}
			}
			System.out.print(count + " ");
		}
	}
}
