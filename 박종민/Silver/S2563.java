import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numPaper = sc.nextInt();

		int[][] paper = new int[100][100];

		for (int paint = 0; paint < numPaper; paint++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			for (int row = y; row < y + 10; row++) {
				for (int col = x; col < x + 10; col++) {
					paper[row][col] = 1;

				}
			}
		}

		int cnt = 0;
		for (int row = 0; row < 100; row++) {
			for (int col = 0; col < 100; col++) {
				if (paper[row][col] > 0) {
					cnt++;
				}
			}
		}

		System.out.println(cnt);

	}
}