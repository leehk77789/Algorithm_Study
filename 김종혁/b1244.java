package baekjoon;

import java.util.Scanner;

public class b1244 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int switchNum = sc.nextInt() + 1;
		int[] switchStatus = new int[switchNum];

		for (int i = 1; i < switchNum; i++) {
			switchStatus[i] = sc.nextInt();
		}

		int people = sc.nextInt();
		for (int i = 1; i <= people; i++) {
			int gender = sc.nextInt();
			int num = sc.nextInt();

			if (gender == 1) {
				for (int j = 1; j < switchNum; j++) {
					if ((j) % num == 0) {
						if (switchStatus[j] == 0) {
							switchStatus[j]++;
						} else {
							switchStatus[j]--;
						}
					}
				}
			} else if (gender == 2) {
				int cnt = 1;
				if (switchStatus[num] == 0) {
					switchStatus[num]++;
				} else {
					switchStatus[num]--;
				}
				while ((num - cnt) > 0 && (num + cnt) < switchNum) {
					if (switchStatus[num - cnt] == switchStatus[num + cnt]) {
						if (switchStatus[num + cnt] == 0) {
							switchStatus[num + cnt]++;
							switchStatus[num - cnt]++;
						} else if (switchStatus[num + cnt] == 1) {
							switchStatus[num + cnt]--;
							switchStatus[num - cnt]--;
						}
						cnt++;
					} else {
						break;
					}
				}
			}
		}

		for (int i = 1; i < switchNum; i++) {
			System.out.print(switchStatus[i] + " ");
			if (i % 20 == 0) {
				System.out.println();
			}
		}
	}
}
