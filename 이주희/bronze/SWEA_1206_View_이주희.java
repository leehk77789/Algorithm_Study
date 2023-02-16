package SWEA_0213;

import java.util.Scanner;

public class SWEA_1206_View_이주희 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		for (int k = 1; k < 11; k++) {
		
			long sum = 0;

			//건물의 개수 N을 입력받는다.
			int N = sc.nextInt();
			long arr[] = new long[N];
			
			//건물의 개수 N에 대한 높이를 입력받아 배열에 넣어준다.
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
		
			// j 자신을 기준으로 양 옆 2개씩 비교해 더 큰 숫자가 없다면 
			//그 중 가장 큰 수에서 자기 값을 빼준다.
			//이 값을 다 더해 sum에 넣어줌
				for (int j = 2; j < N-2; j++) {
					if (arr[j] - arr[j - 1] > 0 && arr[j] - arr[j - 2] > 0 && arr[j] - arr[j + 1] > 0
							&& arr[j] - arr[j + 2] > 0) {
						sum += (arr[j] - Math.max(Math.max(arr[j - 1], arr[j - 2]), Math.max(arr[j + 1], arr[j + 2])));

					}
				}
				System.out.println("#" + (k) + " " + sum);
			}
			
		}
	}

