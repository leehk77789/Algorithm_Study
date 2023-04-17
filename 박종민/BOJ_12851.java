import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	// bfs 메서드
	private static void bfs(int N, int K) {
		// 카운트를 위한 
		int count = 0;
		Queue<Integer> q = new LinkedList<>();
		int[] dist = new int[100001];
		Arrays.fill(dist, -1);
		
		q.offer(N);
		dist[N] = 0;

		while (!q.isEmpty()) {
			int curNode = q.poll();

			if (dist[K] != -1 && dist[K] < dist[curNode]) {
				break;
			}

			int[] nextPos = new int[] { curNode - 1, curNode + 1, curNode * 2 };
			for (int i = 0; i < nextPos.length; i++) {
				Integer nextNode = nextPos[i];

				if (nextNode < 0 || nextNode > 100000)
					continue;

				if (dist[nextNode] == -1 || dist[nextNode] == dist[curNode] + 1) {
					q.offer(nextNode);
					dist[nextNode] = dist[curNode] + 1;

					if (nextNode.equals(K)) {
						count++;
					}
				}
			}
		}

		System.out.println(dist[K]);
		System.out.println(count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력받기
		int n = sc.nextInt();
		int k = sc.nextInt();
		// 수빈이가 더 크다면
		if (n >= k) {
			System.out.println(n - k);
			System.out.println(1);
			return;
		}
		// 메서드 실행
		bfs(n, k);
	}

}
