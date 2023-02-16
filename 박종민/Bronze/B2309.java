import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 숫자 넣을 배열 만들기
		int[] arr = new int[9];
		// 총합
		int total = 0;

		// 배열에 숫자 넣기
		for (int idx = 0; idx < arr.length; idx++) {
			arr[idx] = sc.nextInt();
			total += arr[idx];
		}

		// 난쟁이인 척 하는 사람 찾기
		int heoSu = total - 100; // 100을 뺀 나머지를 찾고
		// 2중 for문으로 두 개의 합이 heoSu인 사람을 찾기
		int find = 0;
		int fNone = 0;
		int sNone = 0;
		for (int fIdx = 0; fIdx < arr.length-1; fIdx++) {
			if (find == 1) {
				break;
			}
			for (int sIdx = fIdx + 1; sIdx < arr.length; sIdx++) {
				if (arr[fIdx] + arr[sIdx] == heoSu) {
					fNone = fIdx;
					sNone = sIdx;
					find = 1;
					break;
				}
			}
		}

		// 난쟁이들만 있는 배열 만들기
		int realIdx = 0;
		int[] realSmall = new int[7];
		for (int idx = 0; idx < arr.length; idx++) {
			if (idx == fNone || idx == sNone) {
				continue;
			} else {
				realSmall[realIdx++] = arr[idx];
			}

		}

		// 배열 오름차순 정렬
		Arrays.sort(realSmall);

		// 배열 출력
		for (int idx = 0; idx < 7; idx++) {
			System.out.printf("%d\n", realSmall[idx]);
		}
	}
}