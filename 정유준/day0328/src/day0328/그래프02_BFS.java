package day0328;

import java.util.LinkedList;
import java.util.Queue;

public class 그래프02_BFS {
	static int N = 7;

	// 인접행렬
	static int[][] adj = { { 0, 1, 1, 0, 0, 1, 0 }, { 1, 0, 0, 1, 0, 0, 1 }, { 1, 0, 0, 1, 0, 0, 0 },
			{ 0, 1, 1, 0, 0, 0, 1 }, { 0, 0, 0, 0, 0, 1, 1, }, { 1, 0, 0, 0, 1, 0, 0, }, { 0, 1, 0, 1, 1, 0, 0, } };

	static boolean[] visited = new boolean[N];// 방문처리할 배열

	static Queue<Integer> queue = new LinkedList<Integer>();

	public static void main(String[] args) {
		BFS(0);
	}

	static void BFS(int v) {
		// 시작 정점을 큐에 넣는다.
		queue.add(v);
		visited[v] = true;

		// 큐가 공백이 될때까지 반복문 수행
		while (!queue.isEmpty()) {
			// 정점을 하나 꺼내
			int now = queue.poll();
			System.out.print(now + " -> ");

			// 나와 연결되어 있으면서 방문하지 않은 친구들을 Q에 넣는다.
			for (int i = 0; i < adj.length; i++) {
				if (!visited[i] && adj[now][i] == 1) {
					queue.add(i);
					visited[i] = true;
				}
			}
		}
	}
}
