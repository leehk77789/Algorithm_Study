package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class S14889 {
	// 스타트와 링크
	static int N;
	static int[][] power;
	static boolean[] visited;
	static ArrayList<Integer> result;
	static ArrayList<Integer> opposite;
	static int minDiff;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		power = new int[N][N];
		visited = new boolean[N + 1];
		// 방문 여부를 확인할 boolean 배열
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				power[i][j] = sc.nextInt();
			}
		}
		minDiff = 101;
		// S의 값이 100보다는 작으므로 
		// 걍 대충 최소값을 101로 초기화하고 시작하기
		
		solve(0, N / 2);
		// 조합을 구할 메소드 실행!
		// 전체 인원을 절반으로 나누어야 하므로 N / 2
		
		System.out.println(minDiff);
	}

	static void solve(int K, int R) {
		// 1번부터 N번까지의 숫자를 두 그룹으로 나눌 수 있는
		// 모든 경우의 수를 구하는 메소드
		
		if (R == 0) {
			// R이 0이라는 것 => 조합을 채웠따!
			result = new ArrayList<>();
			opposite = new ArrayList<>();
			// ArrayList 배열 두개를 만들었다
			// 팀을 둘로 나눴으니까 각각 넣어주려고 두개 만든거양

			for (int i = 0; i < N; i++) {
				// boolean 배열을 돌면서
				// 만약 방문했으면 result배열에
				// 방문하지 않았으면 opposite배열에 채우자
				if (visited[i]) {
					result.add(i + 1);
				} else
					opposite.add(i + 1);
			}
			// 두 어레이리스트가 완성되었으니 계산돌리러가자
			calculate();

			return;

		}
		// R이 0이 아니면?
		// 즉 조합에 아직 인원이 다 차지 않았다면
		for (int i = K; i < N; i++) {
			// K부터 해서 방문하고
			visited[i] = true;
			// i + 1 :: 조합에 인원을 채우는 것이므로
			// R - 1 :: 앞으로 더 채워야 할 인원
			solve(i + 1, R - 1);
			// 메소드를 돌았다 왔으면?
			// 방문 체크를 해제하고 for문 다시 돌겠지
			visited[i] = false;

		}
	}

	static void calculate() {
		// 우리는 각 팀의 능력치의 차이를 최소로 하고싶은거니까
		// 일단 각 팀의 능력치를 구해야한다
		int sum1 = 0;
		int sum2 = 0;
		// 사람 번호는 어레이리스트로 구해놨고
		// 그 번호에 따라서 처음에 받아놓은 power배열에서 찾는다
		for (int i = 0; i < N / 2; i++) {
			for (int j = 0; j < N / 2; j++) {
				sum1 += power[result.get(i) - 1][result.get(j) - 1];
			}
		}
		for (int i = 0; i < N / 2; i++) {
			for (int j = 0; j < N / 2; j++) {
				sum2 += power[opposite.get(i) - 1][opposite.get(j) - 1];
			}
		}
		// 그런다음에 차이를 구하고
		// 차이끼리의 최소를 구해준당
		// 끝
		int diff = Math.abs(sum1 - sum2);
		minDiff = Math.min(diff, minDiff);
	}

}