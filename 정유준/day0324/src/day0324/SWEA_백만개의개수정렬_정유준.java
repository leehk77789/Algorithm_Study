package day0324;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SWEA_백만개의개수정렬_정유준 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int[] num;
	static int[] tmp;

	static void input() throws IOException {
		String[] input = br.readLine().split(" ");
		num = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			num[i] = Integer.parseInt(input[i]);
		}

		// 임시로 옮긴 숫자들을 담아둘 곳이 있어야한다.
		tmp = new int[num.length];
	}

	static void merge(int left, int right) {
		// 끝나는 조건 : left와 right가 같아지는 경우(반씩 쪼개다가 1개가 되는 경우이다.)
		if (left == right) {
			return;
		}

		// 절반
		int mid = (left + right) / 2;

		// 왼쪽 절반 나누기
		merge(left, mid);
		// 오른쪽 절반 나누기
		merge(mid + 1, right);

		// 위의 절반씩 나눈 재귀가 끝나면 끝난 두개의 범위를 하나로 합친다.
		sort(left, mid, right);
	}

	static void sort(int left, int mid, int right) {
		// 왼쪽 시작점
		int l = left;

		// 오른쪽 시작점
		int r = mid + 1;

		// 정답 배열에 넣어줄 idx(왼쪽지점이랑 같다)
		int idx = left;

		// l이 미드까지 오거나 r이 오른쪽 끝에 닿으면 종료
		// 두개의 l자리와 r자리를 비교하여 더 작은수를 tmp배열에 넣어준다.
		while (l <= mid && r <= right) {
			if (num[l] <= num[r]) {
				tmp[idx++] = num[l++];
			} else {
				tmp[idx++] = num[r++];
			}
		}

		// 아직 안끝났을 경우(한쪽만 끝났을경우)
		// l이 먼저 끝났을 경우 남은 r배열들을 tmp배열에 넣는다.
		if (l > mid) {
			while (r <= right) {
				tmp[idx++] = num[r++];
			}
			// r이 먼저 끝났을 경우 남은 l배열들을 tmp배열에 넣는다.
		} else {
			while (l <= mid) {
				tmp[idx++] = num[l++];
			}
		}

		// 완성된 tmp를 num에 넣어주고 num은 완성된 배열이 되어 다시 올라간다.
		for (int i = left; i <= right; i++) {
			num[i] = tmp[i];
		}
	}

	static void solve() throws IOException {
		input();
		merge(0, num.length - 1);
		System.out.println(Arrays.toString(num));
	}

	public static void main(String[] args) throws IOException {
		solve();
	}
}
