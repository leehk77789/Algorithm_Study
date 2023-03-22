package day0322;

public class 분할정복04_이진검색_재귀 {
	static int[] arr;
	static int key;

	public static void main(String[] args) {
		// 정렬된 상태의 배열
		arr = new int[] { 2, 4, 6, 7, 8, 9, 17 };
		key = 6;

		System.out.println(binarySearch(0, arr.length - 1));
	}

	// 이진검색을 하는 이뉸
	// 내가 원하는 값이 안에 들어있나, 들어있다면 어디에 들어있나
	// 인자값으로 무엇을 들고가야하나 (경계의 시작점과 끝점)
	static boolean binarySearch(int st, int ed) {
		// 찾지 못했을경우
		if (st > ed) {
			return false;
		}

		int mid = (st + ed) / 2;// 정수값

		// 같다면(찾았음)
		if (arr[mid] == key) {
			return true;
		}

		else if (arr[mid] > key) {
			// 왼쪽구간 탐색
			return binarySearch(st, mid - 1);
		}

		else {
			// 오른쪽구간 탐색
			return binarySearch(mid + 1, ed);
		}
	}
}
