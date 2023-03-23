package 알고리즘스레기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10798_세로읽기_정유준 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[][] input = new char[5][15];
		int maxLength = 0;
		for (int i = 0; i < 5; i++) {
			String str = br.readLine();
			if (str.length() > maxLength) {
				maxLength = str.length();
			}

			for (int j = 0; j < str.length(); j++) {
				input[i][j] = str.charAt(j);
			}
		}
		String answer = "";
		for (int i = 0; i < maxLength; i++) {
			for (int j = 0; j < 5; j++) {
				if (input[j][i] == '\0') {
					continue;
				}
				answer += input[j][i];
			}
		}
		System.out.println(answer);
	}
}
