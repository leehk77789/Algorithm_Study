package test01;

public class Test3 {

	public static void main(String[] args) {

		System.out.println(fibo(10));
	}

	// fibo(n) : 피보나치 수열에서 n번째 수
	static int fibo(int n) {
		// 기저조건
		if (n <= 1) {
			return n;
		} else {
			return fibo(n - 1) + fibo(n - 2);
		}
	}
}
