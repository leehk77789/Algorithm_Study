import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1018_체스판다시칠하기_정유준 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] input = br.readLine().split(" ");
		int[] N = new int[2];
		for (int i = 0; i < N.length; i++) {
			N[i] = Integer.parseInt(input[i]);
		}

		int[][] map = new int[N[0]][N[1]];
		for (int col = 0; col < map.length; col++) {
			String line = br.readLine();
			for (int row = 0; row < map[col].length; row++) {
				map[col][row] = line.charAt(row);
			}
		}

	}
}
