package SWEA_0213;
import java.util.Arrays;
import java.util.Scanner;

public class SWEA_1984_View_이주희 {
	

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			//테스트 케이스에 넣을 10개의 수의 배열을 만들어주자 
			int[] arr = new int[10];
		
			int tmp;
			
			//테스트 케이스의 개수를 정해주고
			int T = sc.nextInt();
			
			//입력 받은 테스트 케이스 만큼 입력받는다.
			for (int k = 0; k < T; k++) {
				
				double sum=0;
				int num=0;
				
				for (int i = 0; i < 10; i++) {
					arr[i] = sc.nextInt();
				}

				
				//만약 다음 인덱스 숫자가 더 작으면 자리를 바꿔서 오름차순으로 정렬을 해주고
				for (int i = 0; i < arr.length - 1; i++) {
					for (int j = 0; j < arr.length - 1; j++) {

						if (arr[j] > arr[j + 1]) {
							tmp = arr[j];
							arr[j] = arr[j + 1];
							arr[j + 1] = tmp;
						}
					}
				

				} 
		
				
				//최대 최소 숫자를 뺀 나머지를 더해준다.
				for(int i=1; i<arr.length-1; i++) {
					sum+=arr[i];
				}
				
		
				
				System.out.println("#"+(k+1)+" "+Math.round(sum/8));
				
			}
		}
	}
