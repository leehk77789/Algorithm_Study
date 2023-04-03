package day0330;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 다익스트라_반복문 {
	static String input = "6 11\r\n" + "0 1 4\r\n" + "0 2 2\r\n" + "0 5 25\r\n" + "1 3 8\r\n" + "1 4 7\r\n"
			+ "2 1 1\r\n" + "2 4 4\r\n" + "3 0 3\r\n" + "3 5 6\r\n" + "4 3 5\r\n" + "4 5 12\r\n" + "";
	static final int INF = Integer.MAX_VALUE;
	static int V, E; // V :정점, E : 간선
	static List<Node>[] adjList; // 인접리스트
	static int[] dist; // 최단 길이를 저장할 배열

	static class Node {
		int v, w;

		public Node(int v, int w) {
			this.v = v;
			this.w = w;
		}
	}

	static void dijkstra(int start) {
		boolean[] check = new boolean[V];

		dist[start] = 0;

		for (int i = 0; i < V - 1; i++) {
			int min = INF;
			int idx = -1;

			// 선택하지 않은 정점 중 dist가 가장 짧은 것을 골라
			for (int j = 0; j < V; j++) {
				if (!check[j] && min > dist[j]) {
					min = dist[j];
					idx = j;
				}
			}

			if (idx == -1) {
				break;
			}

			check[idx] = true;

			// 갱신 가능하면 갱신
			for (int j = 0; j < adjList[idx].size(); j++) {
				Node curr = adjList[idx].get(j);

				// 방문하지 않았고, 연결도 되었고(인접행렬만 해당),
				// 이미 가지고 있는 값보다 나은 값이 있다면 갱신
				if (!check[curr.v] && dist[curr.v] > dist[idx] + curr.w) {
					dist[curr.v] = dist[idx] + curr.w;
				}
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(input);
		V = sc.nextInt();
		E = sc.nextInt();

		adjList = new ArrayList[V];
		for (int i = 0; i < V; i++) {
			adjList[i] = new ArrayList<>();
		}

		dist = new int[V];
		Arrays.fill(dist, INF);

		for (int i = 0; i < E; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int W = sc.nextInt();

			// 유향 그래프엿다.
			adjList[A].add(new Node(B, W));

			// 한줄로 줄이기
//			adjList[sc.nextInt()].add(new Node(sc.nextInt(), sc.nextInt()))
		}
		dijkstra(0);

		System.out.println(Arrays.toString(dist));
	}

}
