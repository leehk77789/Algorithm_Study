package class2;

import java.util.Scanner;

public class BOJ_10250_ACM호텔_정유준 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();

		for (int idx = 1; idx <= testCase; idx++) {
			int hight = sc.nextInt();
			int width = sc.nextInt();
			int human = sc.nextInt();

			if (human % hight == 0) {
				System.out.println((hight * 100) + (human / hight));
			} else {
				System.out.println(((human % hight) * 100) + ((human / hight) + 1));
			}
		}
	}
}
