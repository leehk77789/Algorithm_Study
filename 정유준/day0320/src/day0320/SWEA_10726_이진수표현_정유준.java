package day0320;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_10726_이진수표현_정유준 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		for (int idx = 1; idx <= testCase; idx++) {
			String[] input = br.readLine().split(" ");
			int N = Integer.parseInt(input[0]);
			int M = Integer.parseInt(input[1]);
			int answer = (1 << N) - 1;
			if ((M & answer) == answer) {
				System.out.println("#" + idx + " ON");
			} else {
				System.out.println("#" + idx + " OFF");
			}
		}
	}
}
