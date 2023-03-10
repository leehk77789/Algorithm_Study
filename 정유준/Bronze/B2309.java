import java.util.Arrays;
import java.util.Scanner;

public class B2309 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//키 입력받을 배열 생성
		int[] he = new int[9];
		//키 입력
		for(int i = 0; i < he.length; i++) {
			he[i] = sc.nextInt();
		}
		
		//전체 총합을 구한뒤
		int sumhe = 0;
		for(int i = 0; i < he.length; i++) {
			sumhe += he[i];
		}
		
		//he에서 2개를 뺐을 때 100이 되는 원소들을 10000으로 바꾸고
		//for문 전체 break
		outer:for(int i = 0; i < he.length; i++) {
			for(int j = i+1; j < he.length; j++) {
				if(sumhe - he[i] - he[j] == 100) {
					he[i] = 101;
					he[j] = 101;
					break outer;
				}
			}
		}
		
		Arrays.sort(he);
		//짭쟁이들을 10000으로 바꿨으므로 length-2를 하면 해당 2개를 제외하고 나옴
		for(int i = 0; i < he.length-2; i++) {
			System.out.println(he[i]);
		}
		
		sc.close();
	}
}
