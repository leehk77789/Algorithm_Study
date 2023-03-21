package day0321;

public class 정유준_부분집합 {
	static String[] nums = { "1 ", "2 ", "3 ", "4 ", "5 " };
	static int count;
	static boolean check[];

	public static void main(String[] args) {
		count = nums.length;
		check = new boolean[count];

		subset(0);
	}

	static void subset(int idx) {
		// 끝내는 조건
		if (idx == count) {
			String tmp = "";
			for (int i = 0; i < count; i++) {
				if (check[i]) {
					tmp += nums[i];
				}
			}
			System.out.println(tmp);
			return;
		}

		// 함수를 다시 호출하는 조건
		check[idx] = true; // 이걸 사용할 때 한번
		subset(idx + 1);

		check[idx] = false; // 사용 안할 때 한번
		subset(idx + 1);
	}
}
