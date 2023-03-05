gpackage day0302;

import java.util.Scanner;

/**
 * SWEA_1860_진기의최고급붕어빵_정유준
 */
public class SWEA_1860_진기의최고급붕어빵_정유준 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt();
		for (int idx = 1; idx <= testCase; idx++) {
			System.out.print("#" + idx + " ");
			int humanNum = sc.nextInt();
			int makeTime = sc.nextInt();
			int makeAmount = sc.nextInt();
			int[] customer = new int[11112];
			for (int i = 0; i < humanNum; i++) {
				int a = sc.nextInt();
				customer[a]++;
			}

			int makeCount = 0;
			int timeCount = 0;

			while (true) {
				if (customer[0] != 0) {
					System.out.print("Impossible");
					break;
				}
				if (timeCount % makeTime == 0 && timeCount != 0) {
					makeCount += makeAmount;
				}
				if (customer[timeCount] != 0) {
					makeCount -= customer[timeCount];
					humanNum -= customer[timeCount];

					if (makeCount < 0) {
						System.out.print("Impossible");
						break;
					}
				}

				timeCount++;

				if (humanNum == 0) {
					System.out.print("Possible");
					break;
				}
			}
			System.out.println();
		}
	}
}