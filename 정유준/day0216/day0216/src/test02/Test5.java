package test02;

public class Test5 {

	public static void main(String[] args) {
		int[] arr = { 5, 2, 4, 1, 2, 3, 3 };
		// 주어진 배열 arr에서 최댓값 찾기
		// 그 수를 이용해서 카운팅 배열을 만든다
		int k = -1;
		for (int i = 0; i < arr.length; i++) {
			if (k < arr[i]) {
				k = arr[i];
			}
		}

		// counting 배열
		// count[i] : i의 개수
		int[] count = new int[k + 1]; // 인덱스 5까지 쓸거이므로

		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}

		// 누적합 배열
		// prefix sum
		// prefix[i] = count[0] + count[1] + count[2] + ... + count[i];
		// suffix[i] = count[i] + count[i+1] + ... + count[n-2] + count[n-1];

//		

		// count 배열 -> prefix 배열
		for (int i = 1; i <= 5; i++) {
			count[i] += count[i - 1];
		}

		// 3단계
		// arr배열을 다시 돌면서
		// 새로운 배열의 새로운 좌표에 옮긴다.
		int[] arr2 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr2[count[arr[i]] - 1] = arr[i];
			count[arr[i]]--;
		}
	}
}
