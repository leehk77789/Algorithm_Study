package test03;

public class Test1_전위 {
	static char[] arr;
	static int n;

	public static void main(String[] args) {
		arr = new char[] { '\u0000', 'A', 'B', 'C', 'D', 'E', 'F', 'G', '\u0000', '\u0000', 'H', 'I'
				// 0 1 2 3 4 5 6 7 8 9 10 11
		};
		n = arr.length;
		traverse(1);
	}

	private static void traverse(int i) { // i 번째 노드의 순회
		// 먼저 배열의 범위 안에 있는지 확인
		if (i <= n - 1) { // 마지막 인덱스보다 작거나 같다
			// 전위 순회 (출력, 왼쪽, 오른쪽)
			// 자기 자신을 방문처리(V)
			if (arr[i] != '\u0000') {
				System.out.print(arr[i] + " ");
			}

			// 왼쪽 트리로 탐색을 이어나감(L)
			traverse(i * 2);

			// 오른쪽 트리로 탐색을 이어나감(R)
			traverse(i * 2 + 1);
		}
	}
}
