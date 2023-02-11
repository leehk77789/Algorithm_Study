import java.util.Scanner;
import java.util.StringTokenizer;

public class B1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        String S = sc.nextLine();
 
		//StringTokenizer 을 사용하여 분리 기준을 공백으로 지정해주면 공백을 기준으로 나뉘어 토큰에 저장
		StringTokenizer st = new StringTokenizer(S," ");
		
		// countTokens() 는 토큰의 개수를 반환한다
		System.out.println(st.countTokens());	

		sc.close();
    }
}
