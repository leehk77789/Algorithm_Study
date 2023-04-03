package day0403;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SWEA_5656_작업순서_정유준_Queue {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static String[] input;
	static int[] indegree;
	static List<List<Integer>> array;
	static Queue<Integer> q;
	static Queue<Integer> answer;

	static void input() throws NumberFormatException, IOException {
		input = br.readLine().split(" ");

		int V = Integer.parseInt(input[0]);
		indegree = new int[V + 1];
		array = new ArrayList<List<Integer>>();
		for (int i = 0; i < V + 1; i++) {
			array.add(new ArrayList<Integer>());
		}

		int E = Integer.parseInt(input[1]);

		input = br.readLine().split(" ");

		// 간선 목록 넣어주기
		int[] v1 = new int[E];
		int[] v2 = new int[E];
		int idx = 0;

		for (int i = 0; i < input.length; i++) {
			if (i % 2 == 0) {
				v1[idx] = Integer.parseInt(input[i]);
			} else {
				v2[idx] = Integer.parseInt(input[i]);
				idx++;
			}
		}

		// v1 -> v2인접리스트 생성과
		// v2를 가리키고 있는 노드 갯수 indegree증가
		for (int i = 0; i < E; i++) {
			int c1 = v1[i];
			int c2 = v2[i];

			array.get(c1).add(c2);
			indegree[c2]++;
		}
	}

	static void Topological_sort() {
		q = new LinkedList<Integer>();
		answer = new LinkedList<Integer>();

		// indegree가 0 인 node q에 추가
		for (int i = 1; i < indegree.length; i++) {
			if (indegree[i] == 0) {
				q.offer(i);
			}
		}

		// 큐에서 값을 꺼내면서 해당 node indegree 1감소
		// 만약 indegree가 0이라면 큐에 넣기
		while (!q.isEmpty()) {
			int node = q.poll();
			answer.offer(node);

			for (Integer i : array.get(node)) {
				indegree[i]--;

				if (indegree[i] == 0) {
					q.offer(i);
				}
			}
		}
	}

	static void solve() throws NumberFormatException, IOException {
		for (int tc = 1; tc <= 10; tc++) {
			input();
			Topological_sort();
			sb.append("#").append(tc).append(" ");
			while (!answer.isEmpty()) {
				sb.append(answer.poll()).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
