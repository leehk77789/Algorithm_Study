package baekjoon;

import java.util.Scanner;

public class b2999 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String email = sc.next();

		int row = 0;
		int col = 0;
		int e = email.length();

		for (int c = 1; c <= e; c++) {
			for (int r = 1; r <= e; r++) {
				if (r <= c && r * c == e) {
					if (r > row) {
						row = r;
						col = c;
					}
				}
			}
		}

		char[][] emailArray = new char[row][col];

		int o = 0;
		for (int y = 0; y < col; y++) {
			for (int x = 0; x < row; x++) {
				emailArray[x][y] = email.charAt(o);
				o++;
			}
		}

		for (int x = 0; x < row; x++) {
			for (int y = 0; y < col; y++) {
				System.out.print(emailArray[x][y]);
			}
		}
	}
}
