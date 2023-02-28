package day0228;

import java.util.Scanner;

public class SWEA_1231_중위순회_정유준 {
	static int treeSize;
	static char[] tree;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			treeSize = sc.nextInt();
			tree = new char[treeSize + 1];

			for (int idx = 1; idx <= treeSize; idx++) {
				int num = sc.nextInt();
				tree[idx] = sc.nextLine().charAt(1);

			}
			System.out.print("#" + i + " ");
			traverse(1);
			System.out.println();
		}

	}

	static void traverse(int i) { // i 번째 노드의 순회
		// 먼저 배열의 범위 안에 있는지 확인
		if (i <= treeSize) { // 마지막 인덱스보다 작거나 같다
			// 중위 순회 (왼쪽, 출력, 오른쪽)
			// 왼쪽 트리로 탐색을 이어나감(L)
			traverse(i * 2);

			// 자기 자신을 방문처리(V)
			if (tree[i] != '\u0000') {
				System.out.print(tree[i]);
			}

			// 오른쪽 트리로 탐색을 이어나감(R)
			traverse(i * 2 + 1);
		}
	}
}
