package day0329;

import java.util.Scanner;

public class UnionFindSet {
	// 노드들이 보통 1부터 주어지니깐 0번을 사용안하는게 편하다.
	// 0을 제외하고 한칸 더 크게 만든다.
	static int[] parentList;
	static int[] rankList;
	static int nodeCount = 3; // 1, 2, 3에 들어간다.

	// 각 노드들이 자신을 부모로 갖도록 만든다.
	static void make() {
		// 0 -> 0 / 1 -> 1 ...
		parentList = new int[nodeCount + 1];
		rankList = new int[nodeCount + 1];

		for (int idx = 0; idx < nodeCount + 1; i++) {
			parentList[idx] = idx;
			rankList[idx] = 0;
		}
	}

	// 무리를 합친다.
	static void union(int x, int y) {
		// x와 y의 무리를 합친다.

		// 부모끼리 합쳐야하므로 합치기전 부모를 찾아야한다.
		int xParent = find(x);
		int yParent = find(y);

		// x의 부모와 y의 부모가 같다면? 같은 집합이다. / 합칠 수 없다(사이클이 만들어진다)
		// 똑같으면 합칠 이유가 없다.
		if (xParent == yParent) {
			return;
		}

		// 여기까지 왔다는건 서로 다른 부모를 가지고 있다는 것
		// 이제 묶어 주어야한다.
		// 묶어 줄 때 rank를 사용한다.(어떤 집단이 더 큰지 확인)
		if (rankList[xParent] > rankList[yParent]) {
			// y가 x를 가리킨다
			// 합친다는 것은 부모를 바꿔준다는 것
			parentList[yParent] = x;
		} else {
			parentList[xParent] = y;

			// 합쳐주려면 한명이 더 커야한다.
			if (rankList[xParent] == rankList[yParent]) {
				rankList[yParent]++;
			}
		}
	}

	// 가장 최상단에 있는 부모 찾기
	static int find(int element) {
		// 누군가가 들어왔을 때 부모를 찾아줘야한다.

		// 만약에 내가 그대로 부모라면? -> 그대로 리턴
		if (parentList[element] == element) {
			return element;
		}

		// 여기까지 왔다는건 내가 부모가 따로 있다는 것
		// 내 부모를 찾아야한다.
		return parentList[element] = find(parentList[element]);
	}

	public static void main(String[] args) {
		String input = "1\n3 2\n1 2\n1 3\n";

		Scanner sc = new Scanner(input);

		int testCase = sc.nextInt();
		for (int tc = 1; tc <= testCase; tc++) {
			// 노드의 개수
			// 간선의 개수
		}
	}
}
