import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1018_체스판다시칠하기_정유준 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int sum;
	static String[][] map;
	static int[] dCol = { -1, 1, 0, 0 };
	static int[] dRow = { 0, 0, -1, 1 };

	static void input() throws IOException {
		sum = 0;
		String[] input = br.readLine().split(" ");
		int row = Integer.parseInt(input[0]);
		int col = Integer.parseInt(input[1]);
		map = new String[row][col];
		for (int i = 0; i < row; i++) {
			input = br.readLine().split(" ");
			for (int j = 0; j < col; j++) {
				map[i][j] = input[j];
			}
		}
	}

	static void bruteForce(int row, int col) {
		for (int i = col; i < col + 8; i++) {
			for (int j = row; j < row + 8; j++) {

			}
		}
	}

	static void checkFour(int i, int j) {
		int row = i;
		int col = j;
		int nRow = 0;
		int nCol = 0;

		for (int idx = 0; idx < 4; idx++) {
			nRow = row + dRow[idx];
			nCol = col + dCol[idx];
		}
	}

	static void solve() throws IOException {
		input();
	}

	public static void main(String[] args) throws IOException {
		solve();
	}
}
