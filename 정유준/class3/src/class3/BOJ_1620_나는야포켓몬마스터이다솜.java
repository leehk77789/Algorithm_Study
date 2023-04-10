package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BOJ_1620_나는야포켓몬마스터이다솜 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static String[] input;
	static int num;
	static int answer;
	static HashMap<Integer, String> pokStr;
	static HashMap<String, Integer> pokInt;

	static void input() throws NumberFormatException, IOException {
		pokStr = new HashMap<>();
		pokInt = new HashMap<>();

		input = br.readLine().split(" ");
		num = Integer.parseInt(input[0]);
		answer = Integer.parseInt(input[1]);

		for (int i = 0; i < num; i++) {
			String str = br.readLine();
			pokStr.put(i + 1, str);
			pokInt.put(str, i + 1);
		}
	}

	static void findAnswer() throws IOException {
		for (int i = 0; i < answer; i++) {
			String str = br.readLine();
			if (str.charAt(0) - '9' <= 0) {
				sb.append(pokStr.get(Integer.parseInt(str))).append("\n");
			} else {
				sb.append(pokInt.get(str)).append("\n");
			}
		}
	}

	static void solve() throws NumberFormatException, IOException {
		input();
		findAnswer();
		System.out.println(sb);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
