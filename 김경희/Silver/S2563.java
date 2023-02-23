import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int papers = sc.nextInt();
		
		int[][] blankPaper = new int[100][100];
		
		for(int t = 0 ;  t < papers ; t++) {		// 각 종이들
			
			int smallerX = sc.nextInt();	// 입력받은 첫 수는 x축으로 치면 왼쪽, 작은 부분
			int smallerY = sc.nextInt();	// 입력받은 첫 수는 y축으로 치면 윗쪽, 작은 부분
			for(int i = smallerX; i<smallerX+10 ; i++ ) {	// 길이가 10이니깡
				for(int j = smallerY; j<smallerY+10 ; j++ ) {
					
					blankPaper[i][j] = 1;
				}
			}
		}
		
		
		
		
		int coloredPapersOn = 0;
		for(int i = 0 ; i <100 ; i++) {
			for(int j = 0 ; j<100 ; j++) {
				if(blankPaper[i][j]==1) {
					coloredPapersOn += 1 ;
				}
			}
		}
		
		
		System.out.println(coloredPapersOn);
		
	}

}
