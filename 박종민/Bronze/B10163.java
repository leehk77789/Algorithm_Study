import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// 스캐너
		Scanner sc = new Scanner(System.in);
		// 종이 개수 받기
		int num = sc.nextInt();
		// 종이 배열 만들기
		int[][] paper = new int[num][4];
		// 종이 입력
		for(int i=0; i<num; i++) {
			for(int j=0; j<4; j++) {
				paper[i][j] = sc.nextInt();
			}
		}
		//도화지 만들기
		int[][] map = new int[1001][1001];
		// 도화지에 종이 입력
		for(int i=0; i<num; i++) {	
			for(int j=paper[i][0]; j<paper[i][0]+paper[i][2]; j++) {
				for(int k=paper[i][1]; k<paper[i][1]+paper[i][3]; k++) {
					map[j][k] = i+1;
				}
			}
		}
		// 각 종이 합 계산
		for(int k=1; k<=num; k++) {
			int sum = 0;
			for(int i=0; i<1001; i++) {
				for(int j=0; j<1001; j++) {
					if(map[i][j]==k){
						sum++;
					}	
				}
			}
			// 출력
			System.out.println(sum);
		}
		
	}

}