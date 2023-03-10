package test02;

public class Test1_Babygin {

	public static void main(String[] args) {
		// divide and conquer
		// 분할정복
		// 서로 다른 n개 중에서 r개 뽑는 순열
		int[] arr = {6, 5, 3, 5, 5};

		// 서로 다른 n개 중에서 3개를 뽑는 순열

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (j != i) {
					for (int k = 0; k < arr.length; k++) {
						if (k != i && k != j) {
							//여기에서 모든 경우의 수가 만들어진다.
//							if(runCheck(arr[i], arr[j], arr[k])) {
							//System.out.printf("%d, %d, %d => %s \n", arr[i], arr[j], arr[k], runCheck(arr[i], arr[j], arr[k]) );
							System.out.printf("%d, %d, %d => %s \n", arr[i], arr[j], arr[k], tripletCheck(arr[i], arr[j], arr[k]) );
//							}
						}
					}
				}
			}
		}
	}
	//run을 체크하는 메서드
	//임의의 숫자 3개가 주어질 때, 연속 여부를 판단
	static boolean runCheck(int a, int b, int c) {
		// b == a+1 , c == a+2
		return b == a+1 && c == a+2;
	}
	
	//triplet을 체크하는 메서드
	//임의의 숫자 3개가 주어질 때, 일치 여부를 판단
	static boolean tripletCheck(int a, int b, int c) {
		return a == b && a == c;
	}
}
