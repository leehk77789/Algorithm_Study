import java.util.Scanner;

public class B2588 {
    public static void main(String[] args) {
        //472 385
		//2360, 3376, 1416, 181720
		// %나머지, /몫
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a * (b % 10);	//b를 10으로 나눈 나머지는 일의 자리만 남는다.
		int d = a * (b % 100 / 10); //b를 100으로 나누면 나머지는 십의자리와 일의자리가 남는다. 이상태에서 10으로 나누면 몫이 10의자리 수 가 된다. 
		int e = a * (b / 100);	//b를 100으로 나누면 몫은 100의자리 수가 된다. 
		int f = a * b;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
    }
}
