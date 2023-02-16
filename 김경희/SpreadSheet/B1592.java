import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 자리 개수
		int M = sc.nextInt(); // M번 받으면 끝납니다.
		int L = sc.nextInt(); // L번째 옆으로 보냅니다.

		int[] arr = new int[N]; // 자리는 배열로 나타낸다. 그 요소값은 공을 받은 횟수로 한다.
		arr[0] = 1; // 첫번째 자리는 1번 받은 것으로 한다. 
		for (int i = 1; i < N; i++) {
			arr[i] = 0; // 모든 요소값을 0으로 초기화한다.
		}

		int i = 0; // 처음 시작하는 자리 #.
		int count = 0; // 공을 몇 번이나 던질까요? 
			
		// 자리 번호는 인덱스+1임을 유념하자.
		while (arr[i] != M) { // 요소값(=횟수) M 되면 끝난다. 
			// 공이 갈 자리를 구해보자.
			if (arr[i] % 2 == 0) { // 현재 있는 자리의 받은 횟수가 짝수다! => 반시계 방향으로 돈다.
				if (i - L < 0) { // L번째 반시계 방향이 0 미만으로 넘어가면?
					i = i - L + N; // 받은 자리가 몇 번째인지 구한다.
				} else { // 0밑으로 안 넘어갔을 땐 그냥 뺀다.
					i = i - L;
				}
				arr[i]++; // 그자리 횟수 추가!
				
			} else if (arr[i] % 2 != 0) { // 받은 횟수가 홀수다! => 시계방향으로 돈다.
				if (i + L >= N) { // L번째 시계방향 자리가 N 이상으로 넘어가면?(인덱스N이면 이미 자리초과)
					i = i + L - N;
				} else { // 배열을 안 벗어났으면 그냥 더한다.
					i = i + L;
				}
				arr[i]++; // 그자리 횟수 추가!
			}
			// 어디든 공을 한 번 던졌으니, 추가해준다.
			count += 1; 
		}	
		// arr[i]이(던진 횟수) M이 되어 반복문을 빠져 나왔다.
		// 이 때 count를 출력한다.
		System.out.println(count);
	}

}