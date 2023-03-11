package baekjoon;

import java.io.*;
import java.util.*;

public class S11650 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int[][] dimension = new int[N][2];

		for (int x = 0; x < N; x++) {
			st = new StringTokenizer(br.readLine());
			for (int y = 0; y < 2; y++) {
				dimension[x][y] = Integer.parseInt(st.nextToken());			
			}
		}

		Arrays.sort(dimension, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] == o2[0]) {
					return o1[1] - o2[1];
				} else {
					return o1[0] - o2[0];
				}
			}
		});

		for (int x = 0; x < N; x++) {
			for (int y = 0; y < 2; y++) {
				bw.write(dimension[x][y] + " ");
			}
			bw.write("\n");	
		}
		bw.flush();
		bw.close();
	}
}
