import java.util.Scanner;

public class B2194 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int I = sc.nextInt();
		
		//I가 올림을 한 숫자이기 때문에 최소값을 구하기 위해서는 -1을해준다.
		//곱한 이후의 원래의 값(I를 올림을 하기 전의 값으로 곱한 값)이
		//소수점을 포함하고 있을 수 있기 떄문에 올림을 위해서 +1을 해준다.
		System.out.println(A*(I-1)+1);
		
		sc.close();
	}
}