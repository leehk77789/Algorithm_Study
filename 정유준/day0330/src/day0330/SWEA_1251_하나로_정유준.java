package day0330;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SWEA_1251_하나로_정유준 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static int sumAmount;
	static long[][] map;
	static double charge;
	static double[] min;
	static boolean[] check;
	static long INF = Long.MAX_VALUE;
	static double sum;

	static void input() throws NumberFormatException, IOException {
		sumAmount = Integer.parseInt(br.readLine());
		// 섬들의 row값 col값
		map = new long[sumAmount][2];

		// 섬좌표입력
		String[] input = br.readLine().split(" ");
		for (int i = 0; i < input.length; i++) {
			map[i][0] = Long.parseLong(input[i]);
		}
		input = br.readLine().split(" ");
		for (int i = 0; i < input.length; i++) {
			map[i][1] = Long.parseLong(input[i]);
		}
//		for (int i = 0; i < map.length; i++) {
//			for (int j = 0; j < map[0].length; j++) {
//				System.out.print(map[i][j] + " ");
//			}
//			System.out.println();
//		}

		// 세율 입력
		charge = Double.parseDouble(br.readLine());

		// 최소 비용 저장할 배열
		min = new double[sumAmount];

		// 방문 체크할 배열
		check = new boolean[sumAmount];

		// 최소값 배열 최대값으로 초기화하기
		Arrays.fill(min, INF);
	}

	static void find() {
		// 0번 섬부터 시작
		int start = 0;
		min[start] = 0;

		int node = 0;
		// 최소 비용 갱신하기
		for (int i = 0; i < sumAmount; i++) {
			// 최소 가중치 찾기
			node = -1;
			// 아직 방문하지 않았고, 이미 연결된 값보다 작은 값을 발견하면 최신화
			for (int j = 0; j < sumAmount; j++) {
				if (!check[j] && (node == -1 || min[j] < min[node])) {
					node = j;
				}
			}
			check[node] = true;
			double pay = 0;
			// 비용갱신
			for (int j = 0; j < sumAmount; j++) {
				// 미방문
				if (!check[j]) {
					// 거리계산
					pay = cal(node, j);
					if (pay < min[j]) {
						min[j] = pay;
					}
				}
			}
		}
		sum = 0;
		// 총비용
		for (int idx = 0; idx < sumAmount; idx++) {
			sum += min[idx];
		}
	}

	static double cal(int x, int y) {
		// 거리
		double far = Math.pow(Math.abs(map[x][0] - map[y][0]), 2) + Math.pow(Math.abs(map[x][1] - map[y][1]), 2);
		return far;
	}

	static void solve() throws NumberFormatException, IOException {
		int testCase = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= testCase; tc++) {
			input();
			find();
			sum *= charge;
			sb.append("#" + tc + " " + Math.round(sum) + "\n");
		}
		System.out.println(sb);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
