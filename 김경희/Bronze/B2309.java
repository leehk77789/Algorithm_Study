import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] heights = new int[9]; // 아홉녀석의 키를 배열에 받아보겠습니다.
		for (int i = 0; i < 9; i++) {
			heights[i] = sc.nextInt();
		}

		int sum = 0; // 우선 키의 합이 100이 넘는댔죠?? 100이 되는 조합을 찾기 위해 우선 페이크까지 더한 sum을 구합니다.
		for (int i = 0; i < 9; i++) {
			sum += heights[i];
		}
		
		int fake1 = 0; // 가짜들의 인덱스를 구할 것입니댜.
		int fake2 = 0;
		for (int i = 0; i < 8; i++) { // i랑 j랑 짝지어서 전체에서 빼면 100이 되나 보겠습니다.
			for (int j = i + 1; j < 9; j++) {
				if (sum - (heights[i] + heights[j]) == 100) {
					fake1 = i; // 100이 되면 i,j는 페이크 인덱스로 치겠습니다.
					fake2 = j;
				}
			}
		}
				
		int[] real = new int[7]; // 진짜를 구해보자. 페이크 빼고 진짜 7명의 배열에 넣어주기
		int idx = 0;
		for (int i = 0; i < 9; i++) {
			if(i==fake1 || i ==fake2)  // 인덱스가 페이크의 그것이면 넘어가고
				continue;		
			else		// 페이크가 아니라면 넣어준다.
				real[idx++] = heights[i]; // 리얼과 페이크가 섞인 배열은 인덱스가 일치하지 않으므로 따로 증가시켜준다.
		}
		
		
		for (int i = 6; i >= 0; i--) { // 진짜를 오름차순으로 정렬
			for (int j = 0; j < i; j++) {
				if (real[j] > real[j + 1]) {
					int tmp = real[j];
					real[j] = real[j + 1];
					real[j + 1] = tmp;
				}
			}
		}
		for (int r : real) {
			System.out.println(r);
		}

	}
}
