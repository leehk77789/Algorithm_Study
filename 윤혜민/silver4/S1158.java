package baekjoon;

import java.util.*;

public class S1158 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 요세푸스... 를 큐를 모르던 시절 겨우겨우 풀었던
		int N = sc.nextInt();
		int K = sc.nextInt();

		ArrayList<Integer> numList = new ArrayList<>();
		ArrayList<Integer> resultList = new ArrayList<>();

		// 일단 수를 어레이리스트에 다 집어넣고
		for (int i = 0; i < N; i++) {
			numList.add(i + 1);
		}
		// numList에서 원소가 제거될떄마다 tmp가 움직일거다
		// 약간 마우스 커서 같은 느낌?
		// 제거될 위치를 알려주는거지
		int tmp = 0;
		for (int i = 0; i < N; i++) {
			// tmp + (K - 1) 이게 이제 뽑아야 할 numList의 인덱스인거다
			// 원의 형태로 돌아야 하니까 numList.size로 나눠주고
			// 그걸 더하자
			resultList.add(numList.get((tmp + (K - 1)) % numList.size()));
			// tmp의 인덱스를 바꿔주자
			tmp += (K - 1) % numList.size();
			// 이거 자체로 원 한바퀴를 넘길 수 있으니 또 나눠주고
			tmp %= numList.size();
			// tmp 업데이트가 끝났으면 원소를 numList에서 제거하자 히히
			numList.remove(tmp);

		}
		System.out.print("<");
		for (int idx = 0; idx < N - 1; idx++) {
			System.out.print(resultList.get(idx) + ", ");
		}
		System.out.print(resultList.get(N - 1) + ">");
	}
}
