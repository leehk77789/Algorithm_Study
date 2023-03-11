package silver;

import java.util.Scanner;

public class 설탕배달2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sugar = sc.nextInt(); // 설탕 무게

		// 더 많이 나가는 5kg로 많이 채우고 나머지를 3kg로 채워야 가장 적은 수의 봉지를 배달할 수 있다.
		// 그러나 5kg으로 먼저 채우고 나머지가 3kg로 나누어떨어질 때 완료해버리면
		// 5kg으로 많이 못 채운 상황에서도 식을 빠져나가버릴 수 있음.
		// 3kg로 채우기 시작하면 3이 가장 적은 상황에서 식을 끝낼 수 있으니 3으로 시작.

		int three = 0; // 3kg 몇 봉지?
		int five = 0; // 5kg 몇 봉지?
		while (sugar > 0) {
			if (sugar > 0 && sugar % 5 == 0) { // 처음, 혹은 3 빼고 넘겨준 아이가 5로 나누어떨어지면
				five = sugar / 5; // 5kg 몇 봉지인지 세어보자.
				sugar = sugar - 5 * five; // 설탕을 탈탈 털어내자!!
				break;
			}
			sugar = sugar - 3 ; // 초기 값이 5로 안 나누어떨어지면 3kg봉지를 최소한으로 한봉지씩만 빼고 5에게 넘겨주자
			three++; // 3뺀만큼 3kg 봉지 수를 더해줄 것이다.
		}
		// 이제 남은 sugar가 0이하가 되어 빠져나왔다.
		if (sugar == 0) // 빠져나온 sugar이 0으로 딱 맞게 떨어졌다면?
			System.out.println(three + five); // 딱 맞게 배달 완료.각 봉지수 더해주기
		else
			System.out.println(-1); // 빠져나온 sugar이 5로도 3으로도 안 나누어떨어져서 빼다보니 0을 지나쳐 음수가 됐다면?

	}

}
