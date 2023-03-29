package day0329;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 크루스칼 {
	static String input = "7 11\r\n +" + "0 1 32\r\n" + "0 2 31\r\n" + "0 5 60\r\n" + "0 6 51\r\n" + "1 2 21\r\n"
			+ "2 4 46\r\n" + "2 6 25\r\n" + "3 4 34\r\n" + "3 5 18\r\n" + "4 5 40\r\n" + "4 6 51\r\n";

	static int[] p; // 대표를 저장할 배열

	public static void main(String[] args) {
		Scanner sc = new Scanner(input);

		int V = sc.nextInt(); // 정점의 개수, 0부터 시작
		int E = sc.nextInt();// 간선의 수

		p = new int[V];

		// 간선을 저장하기 위해서 클래스를 사용할 수도 있지만
		// 배열을 이용해서 저장을 하겠다.
		// 0 : 시작정점 / 1: 끝정점 / 2: 가중치
		int[][] edges = new int[E][3];

		for (int i = 0; i < E; i++) {
			edges[i][0] = sc.nextInt();
			edges[i][1] = sc.nextInt();
			edges[i][2] = sc.nextInt();
		} // 입력 끝

		// 크루스칼 1단계 : 간성 정렬(오름차순)
		Arrays.sort(edges, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[2] - o2[2];
			}
		});

		// 크루스칼 2단계 : V-1개의 간선을 뽑는데, 사이클이 발생안하는 친구들로만 뽑기
		p = new int[V];
		// make-set하자.(나 자신을 대표로 초기화)
		for (int i = 0; i < V; i++) {
//			makeSet(i);
			p[i] = i;
		} // makeset 완료

		int ans = 0; // 최소비용을 저장
		int pick = 0; // 내가 뽑은 간선의 수

		// 모든 간선을 순회하면서 체크
		for (int i = 0; i < E; i++) {
			// i번째의 간선을 뽑아 두 정점의 대표를 확인하겠다.
//			int x = edges[i][0];
//			int y = edges[i][1];
			int px = findSet(edges[i][0]);
			int py = findSet(edges[i][1]);

			// x의 대표와 y의 대표가 다르다면 = 사이클이 아니다. 고를 수 있다!
//			if (findSet(x) != findSet(y)) {
			if (px != py) {
//				union(x, y);
				union(px, py);
				ans += edges[i][2];
				pick++;
			}

			// V-1개 초과로는 나올 수 없다.
			if (pick == (V - 1)) {
				break;
			}
		}

		// while로 사용해보기
//		int idx = 0;
//		while (pick != (V - 1)) {
//			int x = edges[idx][0];
//			int y = edges[idx][0];
//
//			if (findSet(x) != findSet(y)) {
//				union(x, y);
//				ans += edges[i][2];
//				pick++;
//			}
//
//			idx++;
//		}

		// 배열 확인
//		for (int[] arr : edges) {
//			System.out.println(Arrays.toString(arr));
//		}
		System.out.println(ans);
	}

	// 대표를 반환해야 하므로
	static int findSet(int x) {
		// 패쓰 컴프레숀 적용
		if (x != p[x]) {
			p[x] = findSet(p[x]);
		}
		return p[x];

//		if (x == p[x]) {
//			return x;
//		}
//		return findSet(p[x]);
	}

	static void union(int x, int y) {
		// y를 x밑으로 집어넣겠다( rank고려 x )
//		p[findSet(y)] = findSet(x);
		p[y] = x;
	}

	static void makeSet(int x) {
		p[x] = x;
		// 랭크는 따로하지 않는다.
	}
}
