import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int L = sc.nextInt(); // 롤케이크 길이
		int[] cake = new int[L+1]; // 각 조각을 배열로. 인덱스와 일치시켜주기 위해 +1
		int N = sc.nextInt(); // 방청객 몇 명?

		// 가장 greedy한 방청객은 누구였을까?
		int greedy = 0; // 해당 방청객 idx
		int maxDesire = 0; // 그가 원한 조각 크기

		for (int i = 1; i <= N; i++) { // 방청객 i가 고른~
			int p = sc.nextInt(); // 첫 조각
			int k = sc.nextInt(); // 마지막 조각
			int pieces = k - p + 1; // 조각의 크기

			for (int c = p; c <= k; c++) { // 케익에 번호 매기기~
				if (cake[c] == 0)
					cake[c] = i; // 0(앞에 고른사람 없)이면 사람i 넣어준다.
				else
					continue;
			}

			if (maxDesire < pieces) {
				maxDesire = pieces;
				greedy = i; // 얘가 가장 욕심이 많아요~~
			}
		}	// 조각조각에 방청객 번호 매기기 끝
		
		
		// 누가 제일 많이 받았을까
		int[] counting = new int[N+1];	// 사람 수만한 배열을 만들고 이들이 몇 조각씩 갖게 됐는지 세어줄 것
		
		for (int i = 1; i <= L; i++) {	// 조각조각 살펴본다
			counting[cake[i]]++;
		}
		
		int winner = 0;	// 실제로 많이 받은 사람
		int max = 0;	//보다는 많이 받았겠지
		for (int i = 1 ; i <= N ; i++) {
			if(counting[i]>max) {
				max = counting[i];
				winner = i;
			}
			
		}
		
		System.out.println(greedy);
		System.out.println(winner);
		
		

	}
}
