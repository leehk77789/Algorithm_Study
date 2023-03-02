import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 스캐너 사용	
	  Scanner sc = new Scanner(System.in);
		// 사람수 받기
	  int n=sc.nextInt();
		// 번째 받기
        int k=sc.nextInt();
		// 큐 생성
        Queue<Integer> Queu = new LinkedList<>();
		// 스트링빌더 생성
        StringBuilder sb = new StringBuilder();
		// 처음에 큐에 다가 숫자 넣기
        for(int i=1; i<=n; i++){
		 Queu.offer(i);
	}
	// 스트링빌더에 <cnrk
        sb.append('<');
		// 큐에 숫자가 남지 않을때 까지 실행
        while(Queu.size()!=1){
		// k번째 까지 빼고 넣고
            for(int i=1; i<k; i++) {
			Queu.offer(Queu.poll());
		}
		// k번째 수 넣기
            sb.append(Queu.poll()).append(", ");
        }
		// >마지막 추가
        sb.append(Queu.poll()).append('>');
		// 출력
        System.out.println(sb);
		
		sc.close();
	}
}