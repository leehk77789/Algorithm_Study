package test01;

public class Test1_순열 {
	public static void main(String[] args) {
		int a = 1;
		int b = 4;
		//1, 2, 3, 4 4개의 숫자 중에서 3개를 뽑아 나열하는 순열
		
		
		for(int i = a; i <= b; i++) {
			for(int j = a; j <= b; j++) {
				//j에는 i랑 다른 숫자만 올 수 있다.
				if(j != i) {
					//if문 안에서 다음 for문이 돌아야한다.
					for(int k = a; k <= b; k++) {
						//k는 i와 j랑 달라야한다.
						if(k != i && k != j) {
							System.out.printf("%d %d %d\n", i, j, k);
						}
					}
					
				}
			}
		}
		//연속되지 않은 서로다른 n개의 숫자중에서 3개를 뽑는 방법은??
	}
}
