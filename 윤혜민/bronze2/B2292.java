package baekjoon;

import java.util.*;

public class B2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Bee = sc.nextInt();
		int cnt = 1;
		
		// 결국 구해야 하는 것은 주어진 수가 벌집의 몇번째 껍질이냐는 것.
		// 벌집 껍질에 대한 수열을 계산하였다.
		// 1 7 19 37 ,,, 이 각 껍질의 마지막 숫자이며
		// 이는 껍질을 n이라고 할 때 3*n(n-1)+1이다.
		for(int i = 0; i < Bee; i++) {
			// 따라서 for문을 이용해 주어진 수 까지 반복하며
			// 주어진 수가 위 껍질의 마지막 숫자에 해당하게 되면 
			// 껍질을 하나씩 더해준다.
			if(3*cnt*(cnt-1)+1 == i) {
				cnt++;
			}
		}
		System.out.println(cnt);		
	}
}
