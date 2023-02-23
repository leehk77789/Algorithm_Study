import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 더하는 마지막 수 인덱스 구하는 것이 포인트
		// 인덱스 0부터 시작하여 하나씩 더해가며 더할때마다!
		// 100과의 차이를 구하고 (int xx) >> 절대값(math.abs)
		// 그 차이가 작은 것으로 계속 갱신해간다.(math.mind이용x,조건문)
		// 갱신되면 그때의 마지막 인덱스값 또한 갱신한다.
		// 차이가 같은 값이 나온다면 더 큰 수를 저장하므로, 나중에 나온 것을 저장한다.
		// 그렇다면 >기 아닌 >= 조건식을 이용해야 한다.

		int[] mushrooms = new int[10];

		for (int i = 0; i < 10; i++) {
			mushrooms[i] = sc.nextInt(); // 버섯 점수 배열에 받아
		}

		int closest = 100; // 100과 여태 더한 값을 뺀 것을 비교해줄 것 초기화.
		int lastIdx = 0; // 마지막 인덱스 초기화

		int sum = 0; // 더할 값 초기화.
		for (int i = 0; i < 10; i++) { // 이제 더해줄게요!
			sum += mushrooms[i];
			
			int diff = Math.abs(100 - sum);	// 100과의 차이를 구해봅니다

			if (diff <= closest) {
				closest = diff; // 여태 중에 가장 가까울 때의 100과의 차이를 저장해주고
				lastIdx = i; // 그 때의 더한 수들 중 마지막 인덱스를 저장해준다.
			}

		}

		int finalScore = 0;	// 그래서 점수가 얼마냐구요?
		for (int i = 0; i <= lastIdx; i++) {
			finalScore += mushrooms[i]; // 구해진 마지막 인덱스까지 더해줍니다.
		}

		System.out.println(finalScore);

	}
}
