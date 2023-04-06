package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class b10989_수정렬하기3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int[] counting = new int[10001];

		for (int i = 0; i < N; i++) {
			counting[Integer.parseInt(br.readLine())]++;
		}

		for (int i = 0; i < 10001; i++) {
			while (counting[i]-- > 0) {
				bw.write(i + "\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
