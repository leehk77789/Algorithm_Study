import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		char[] croatian = sc.next().toCharArray();	// 주어진 단어를 char[]로 받는다.
		
		int count = 0;	// 몇 개의 알파벳인지 세어줄 변수
		// 뒤에서부터 검사한다.  j,-,=가 있는 경우를 발견할 경우에만 인덱스를 달리 줄여준다.
		int i = croatian.length-1 ;// 뒤에서부터 볼거니까 마지막 인덱스로 초기화해준다.
		while(i>= 0) {	//
			if (croatian[i]=='-') {	// 뒤에서 -을 발견할 경우
				count++;
				i -=2 ;
			}else if(croatian[i]=='=') {	// 뒤에서 =를 발견할 경우
				count++;
				if(i>=2 && croatian[i-1]=='z' && croatian[i-2]=='d') {	// dz=가 있어 이 때를 조심해야한다. indexoutofboundexception도 조심.
					i-=3;
				}else {
					i-=2;
				}
			}else if(croatian[i]=='j') {	// 뒤에서 j를 만날 경우
				count++;
				if(i>=1 && (croatian[i-1]=='l' || croatian[i-1]=='n')){	//인덱스 조심. 
					i-=2;
				}else {
					i--;
				}
			}else {
				count++;
				i--;
			}
		}
		System.out.println(count);
	}
}
