import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		// 배열 만들기
		int[] arr = new int[10];
		// for문 통하여 입력
		for (int idx=0; idx<10;idx++) {
			arr[idx]=sc.nextInt();
		}
		// 계산하기 위한 변수들
		int totalMush=0;
		int realMush=0;
		// 계산
		for(int idx=0; idx<10; idx++) {
			totalMush +=arr[idx]; // 계속 더해주고
			if(totalMush>=100){ //100에 가까우면 
				if(Math.abs(100-totalMush)<=Math.abs(100-(totalMush-arr[idx]))) {
					realMush=totalMush;// 그 때 더한거랑 그전에 더한거랑 비교해사
				} else {
					realMush = totalMush-arr[idx];
				}
				break; // 끝내기
			} else if (totalMush<100) {
				if(idx==9) {
					realMush=totalMush;
				}
			}
		}
		System.out.print(realMush);
		sc.close();
	}
}