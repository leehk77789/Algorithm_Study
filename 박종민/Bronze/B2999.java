import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
 	// 스캐너 받기
        Scanner sc = new Scanner(System.in);
	// 배열 생성 및 입력
        char[] arr = sc.next().toCharArray();
	// 길이 구하는 변수 및 계산을 위한 변수
        int len = arr.length;
        int R=0;
        int C=0;;
	// for문으로 계산
        for (int idx = 1; idx < len; idx++) {
		// 만약 길이가 조건에 맞는다면  입력
            if (len % idx == 0 && idx <= len / idx) {
                R = idx;
                C = len / idx;
            }
        }
 		// 여기도
        if (R == 0 && C == 0) {
            R = 1;
            C = 1;
        }
 	//새로운 배열로 단어 입력해주기
        int index = 0;
        char[][] map = new char[R][C];
        for (int i = 0; i < C; i++) {
            for (int j = 0; j < R; j++) {
                map[j][i] = arr[index++];
            }
        }
        
 	// 새로운 배열 출력
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(map[i][j]);
            }
        }
 
    }
 
}