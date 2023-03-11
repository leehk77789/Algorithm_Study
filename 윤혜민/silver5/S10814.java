package baekjoon;

import java.util.Scanner;

public class S10814 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 카운팅 정렬 사용함
		int nums = sc.nextInt();
		int[] ages = new int[nums];
		String[] names = new String[nums];

		for (int i = 0; i < nums; i++) {
			ages[i] = sc.nextInt();
			names[i] = sc.next();
		}
		int k = -1;
		for (int i = 0; i < nums; i++) {
			if (k < ages[i])
				k = ages[i];
		}
		int[] count = new int[k + 1];
		for (int i = 0; i < nums; i++) {
			count[ages[i]]++;
		}
		int[] prefix = new int[k + 1];
		for (int i = 1; i <= k; i++) {
			prefix[i] = count[i] + prefix[i - 1];
		}
		int[] newAges = new int[nums];
		for (int i = nums - 1; i >= 0; i--) {
			newAges[prefix[ages[i]] - 1] = ages[i];
			prefix[ages[i]]--;
		}
		for (int i = 0; i < nums; i++) {
			int j = 0;
			while (j < nums) {
				if (newAges[i] == ages[j]) {
					System.out.println(newAges[i] + " " + names[j]);
				}
				j++;
			}
			i += count[newAges[i]] - 1;
		}
	}
}
