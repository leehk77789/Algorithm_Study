import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// R과 C부터 구해보자
		// 주어진 N의 약수 (r,c) 중 r<=c인 가장 큰 r
			
		char[] email = sc.next().toCharArray();	// 암호화된 이멜 배열로 받고
		int N = email.length;	// 이메일 글자 길이
		
		int r = 1;
		int c = 1;
		for(int i = 1 ; i <=N ; i++) {
			if(N%i == 0) {	// r 이 N의 약수일때
				int j = N/i;
				if(i<=j) {
					r = i;
					c = j;
				}else if(i>j) {	// r>c되는 순간 assign 안하고 break.
					break;
				}
			}
		}// r,c 구하기 끝. 마지막 rc니까 r이 가장 큰 값이다.
		
		char[][] decodedEmail = new char[r][c];	// 주어진 행렬에 넣어버릴거예요
		// 어떻게? 세로로 다시 넣어줄 거예요
		int idx = 0;	// 원래 받아왔던 이멜 인덱스 하나하나 넣어주기
		for (int j = 0; j < c; j++) {
			for(int i = 0 ; i < r ; i++ ) {
				decodedEmail[i][j] = email[idx++];
			}
		}
		
		
		// 가로로 읽으면 원래 이메일이 되어요
		for(int i = 0 ; i < r ; i++ ) {
			for(int j = 0 ; j < c ; j++) {
				System.out.print(decodedEmail[i][j]);
			}
		}
		
		
	}
}