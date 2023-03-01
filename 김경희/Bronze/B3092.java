import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
		int[] remainder = new int[42]; // 나머지는 0부터 41까지
		int[] operand = new int[10];	// 들어올 숫자는 10개
		for (int i = 0 ; i <10 ; i++) {
			operand[i] = sc.nextInt();
			remainder[operand[i]%42]++;
		}
		int count = 0;
		for(int i = 0 ; i < 42 ; i++) {
			if(remainder[i]!=0) count++;
		}
		
		System.out.println(count);
		
		
	}

}