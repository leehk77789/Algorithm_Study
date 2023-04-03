package day0330;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 프림_우선순위큐 {

	static String input = "7 11\r\n +" + "0 1 32\r\n" + "0 2 31\r\n" + "0 5 60\r\n" + "0 6 51\r\n" + "1 2 21\r\n"
			+ "2 4 46\r\n" + "2 6 25\r\n" + "3 4 34\r\n" + "3 5 18\r\n" + "4 5 40\r\n" + "4 6 51\r\n";

	static final int INF = Integer.MAX_VALUE;

	static class Edge implements Comparable<Edge> {
		int st, ed, w;

		public Edge(int st, int ed, int w) {
			super();
			this.st = st;
			this.ed = ed;
			this.w = w;
		}

		// 컴페어러블 : 나와 쟤를 비교
		// 컴퍼레이터 : 쟤와 얘를 비교
		@Override
		public int compareTo(Edge o) {
//			return this.w - o.w;
			return Integer.compare(this.w, o.w);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(input);

		int V = sc.nextInt(); // V : 정점의 개수, 0부터 시작 한다!
		int E = sc.nextInt(); // E : 간선의 수

		// 인접리스트
		List<Edge>[] adjList = new ArrayList[V];

		// 실제 담을 수 있는 바구니 준비
		for (int i = 0; i < V; i++) {
			adjList[i] = new ArrayList<>();
		}

		for (int i = 0; i < E; i++) {
			int A = sc.nextInt(); // 시작정점
			int B = sc.nextInt(); // 도착정점
			int W = sc.nextInt(); // 가중치

			adjList[A].add(new Edge(A, B, W));
			adjList[B].add(new Edge(B, A, W));
		} // 입력끝

		// 방문처리를 하기 위해서
		boolean[] visited = new boolean[V];

		PriorityQueue<Edge> pq = new PriorityQueue<>();

		// 시작정점을 하나 뽑고 할래
		visited[0] = true;

		pq.addAll(adjList[0]);
//		for (int i = 0; i < adjList[0].size(); i++) {
//			pq.add(adjList[0].get(i));
//		}
//
//		for (Edge e : adjList[0]) {
//			pq.add(e);
//		}

		// 확보한 정점의 개수
		int pick = 1;
		int ans = 0;

		// pick <V일때만 돌아
		while (pick < V) {
			// 지금 우선순위 큐 안에 들어있는 최고의 값
			Edge e = pq.poll();
			if (visited[e.ed]) {
				continue;
			}
			ans += e.w;
			pq.addAll(adjList[e.ed]);
			visited[e.ed] = true;
			pick++;
		}
		System.out.println(ans);
	}
}
