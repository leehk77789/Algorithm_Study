package baekjoon;

import java.util.Scanner;

public class b2527 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] sqr1 = new int[4];
		int[] sqr2 = new int[4];

		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 4; i++) {
				sqr1[i] = sc.nextInt();
			}
			for (int i = 0; i < 4; i++) {
				sqr2[i] = sc.nextInt();
			}

			if((sqr1[0]>sqr2[2]) || (sqr1[2]<sqr2[0]) || (sqr1[1]>sqr2[3]) || (sqr1[3]<sqr2[1])){
				System.out.println("d");
			} else if ((sqr1[0] == sqr2[2] && sqr1[1] == sqr2[3])
					|| (sqr1[2] == sqr2[0] && sqr1[3] == sqr2[1])
					|| (sqr1[0] == sqr2[2] && sqr1[3] == sqr2[1])
					|| (sqr1[2] == sqr2[0] && sqr1[1] == sqr2[3])) {
				System.out.println("c");
			} else if (sqr1[0] == sqr2[2] || sqr1[2] == sqr2[0] || sqr1[1] == sqr2[3] || sqr1[3] == sqr2[1]) {
				System.out.println("b");
			} else {
				System.out.println("a");
			}
		}
	}
}
