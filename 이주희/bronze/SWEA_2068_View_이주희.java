package SWEA_0213;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_2068_View_이주희 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			//테스트 케이스에 넣을 10개의 수의 배열을 만들어주자 
			int[] arr = new int[10];
		
			int tmp;
			//테스트 케이스의 개수를 정해주고
			int T = sc.nextInt();
			
			//입력 받은 테스트 케이스 만큼 입력받는다.
			for (int k = 0; k < T; k++) {
				for (int i = 0; i < 10; i++) {
					arr[i] = sc.nextInt();
				}
//				Arrays.sort(arr);
//				
//				System.out.println(arr[arr.length-1]);
				
				//만약 다음 인덱스 숫자가 더 작으면 자리를 바꿔서 오름차순으로 정렬을 해주고
				for (int i = 0; i < arr.length - 1; i++) {
					for (int j = 0; j < arr.length - 1; j++) {

						if (arr[j] > arr[j + 1]) {
							tmp = arr[j];
							arr[j] = arr[j + 1];
							arr[j + 1] = tmp;
						}
					}
				
				//가장 큰 숫자인 마지막 인덱스의 값을 출력해준다.
				}System.out.println("#"+(k+1)+" "+arr[arr.length-1]);
				
			}
		}
	}

