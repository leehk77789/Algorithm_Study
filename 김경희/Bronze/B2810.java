import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 좌석 수 입력받기
		int seats = sc.nextInt();
		// 좌석 수 크기의 char배열을 생성
		char[] seatSL = sc.next().toCharArray();
		
		int cupHolders = 0; // 컵홀더 개수 초기화
		// 배열을 인덱스 차례로 돌며 (좌석수 크기만할 때까지)
		for(int i = 0 ; i < seatSL.length ;) {
			// 컵홀더의 개수를 셀텐데, 좌석 왼쪽에 있는 컵홀더라고 가정.
			if(seatSL[i] =='S') {
				cupHolders++;	// S라면 count+1
				i++;
			}else if(seatSL[i]=='L') {
				cupHolders++;
				i += 2 ;	// L이라면 count+1 , 인덱스는 +2(LL, 가운데 없다)
			}
		}
		//	마지막 좌석 우측(끝) 컵홀더는 세어지지 않으므로 하나 더해준다.
		cupHolders++;
		
		// SSS와 같이 S만 있는 경우, 사람(좌석) 수보다 컵홀더 수가 많을 수 있으므로
		// 좌석 수와 컵홀더 중에 작은 것을 출력하자	
		
		int finalCups = Math.min(seats, cupHolders);
		System.out.println(finalCups);
		
		
	}
}
