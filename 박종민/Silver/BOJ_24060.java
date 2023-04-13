import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static boolean flag;
	static int n, k, cnt;
	static int[] arr, tmp;

	static void mergeSort(int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(start, mid);
			mergeSort(mid + 1, end);

			int p = start;
			int q = mid + 1;
			int idx = p;

			while (p <= mid || q <= end) {

				if (q > end || p <= mid && arr[p] < arr[q]) {
					tmp[idx++] = arr[p++];
				} else {
					tmp[idx++] = arr[q++];
				}
			}

			for (int i = start; i <= end; i++) {
				arr[i] = tmp[i];
				cnt++;
				if (cnt == k) {
					flag = true;
					System.out.println(arr[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		k = sc.nextInt();
		flag = false;
		arr = new int[n];
		tmp = new int[n];
		cnt = 0;
		for (int idx = 0; idx < n; idx++) {
			arr[idx] = sc.nextInt();
		}

		mergeSort(0, arr.length - 1);
		if (!flag) {
			System.out.println(-1);
		}
	}
}
