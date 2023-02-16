import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int qttOfSwitch = sc.nextInt(); // 스위치 개수 입력받기

		int[] arr = new int[qttOfSwitch]; // 스위치의 상태를 표현할 배열 만들기

		for (int i = 0; i < qttOfSwitch; i++) {
			arr[i] = sc.nextInt(); // 배열에 스위치의 상태를 넣어주었다.
		}

		int students = sc.nextInt(); // 학생수를 입력받는다.

		for (int i = 0; i < students; i++) { // 학생 수만큼 시도해보자
			int gender = sc.nextInt(); // 학생 성별
			int givenNum = sc.nextInt(); // 그 학생이 받은 숫자

			if (gender == 1) { // 남학생이라면??
				for (int j = 0; j < qttOfSwitch; j++) { // 스위치를 돌 것이다.
					if ((j + 1) % givenNum == 0) { // 스위치#는 인덱스+1. 이것이 주어진 숫자의 배수라면?
						if (arr[j] == 0) { // 0이었던 건 1로
							arr[j] = 1;
						} else if (arr[j] == 1) { // 1이었던 건 0으로
							arr[j] = 0;
						}
					}
				}
			} else if (gender == 2) { // 여학생이라면?? 귀찮지만 해보자
				for (int j = 0; j < qttOfSwitch; j++) { // 스위치를 돌며 주어진 숫자와 같은 # 찾기
					if (j + 1 == givenNum) { // 주어진 숫자를 찾았다!
						// 우선 가운데는 무조건 바꾸어보자.
						if (arr[j] == 0) { // 0이었던 건 1로
							arr[j] = 1;
						} else if (arr[j] == 1) { // 1이었던 건 0으로
							arr[j] = 0;
						}
						for (int k = 1; k <= j && k < qttOfSwitch - j; k++) { // 주어진 스위치 넘버의 양 옆을 순차적으로 탐색할 것이다.
							// 양옆 탐색
							if (arr[j - k] == arr[j + k]) { // 양 옆이 같나?
								// 양 옆은 같았으니 한 번에 바꾸어주자.
								if (arr[j - k] == 0) {
									arr[j - k] = 1; // 1로 바꾸기
									arr[j + k] = 1;
								} else if (arr[j - k] == 1) { // 0으로 바꾸기.
									arr[j - k] = 0;
									arr[j + k] = 0;
								}

							} else if (arr[j - k] != arr[j + k]) { // 양옆의 대칭이 깨지는 순간
								break;
							}
						}
					}
				}
			}
		}
		for(int a = 0; a<arr.length ;  a++) {
			if ((a+1)%20 == 0) {
				System.out.printf("%d\n",arr[a]);
			} else {
				System.out.printf("%d ",arr[a]);
			}
			
		}
		sc.close();
	}
}
