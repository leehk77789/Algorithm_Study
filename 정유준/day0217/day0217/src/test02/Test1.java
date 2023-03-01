package test02;

public class Test1 {

	public static void main(String[] args) {
		char[] t = "This iss a book".toCharArray();
		char[] p = "iss".toCharArray();

		int idx = BruteForceFor(p, t);
		System.out.println(idx)
		
		idx = BruteForceWhile(p, t);
	}

	private static int BruteForceWhile(char[] p, char[] t) {
		int n = t.length;
		int m = p.length;
		int i = 0;
		int j = 0;

		while (i < m && j < n) {
			if (t[i] != p[j]) {
				i -= j;
				j = -1;
			}
			i++;
			j++;
		}
		// while문이 끝났다는 건?
		// 1. j == m => 찾은 것
		// 2. j != n => 못 찾은 것
		if (j == m) {
			return i - m;
		} else {
			return -1;
		}
	}

	private static int BruteForceFor(char[] p, char[] t) {
		// pattern이 한 칸씩 shift가 최대 n-m+1번 수행
		int n = t.length;
		int m = p.length;
		// 각 shift에서 1:1 비교가 최대 m번 수행
		for (int i = 0; i < n - m + 1; i++) {
			boolean flag = true;
			for (int j = 0; j < m; j++) {
				if (p[j] != t[i + j]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				return i;
			}
		}
		return -1;
	}
}
