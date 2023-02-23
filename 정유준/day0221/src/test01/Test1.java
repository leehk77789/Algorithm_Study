package test01;

public class Test1 {
	public static void main(String[] args) {
		// 반복문 <==> 재귀
		// for(int i = 0; i < 5; i++ {
		// System.out.println(i);
		// }

		// 재귀함수로 만들려면?
		// 일반화 => n에 대한 문제 : 전체 문제(f(n))
		// 부문 문제 : f(n-1), f(n-2), ... f(1), f(0)

		// n : 숫자, 크기, 인덱스, 순서, ... 다양한 의미를 갖는다.

		// 재귀함수는 2가지 부분으로 나뉜다.
		// 1. base case : 기저 조건(멈추는 곳)
		// -5를 만났을 때 멈춘다.
		// 2. recursive case : 유도 조건(자기 자신을 부르는 곳)
		rf(0, 5);
	}

	// recursive for
	// i번째 인덱스 출력하고 다음으로 넘어간다.
	static void rf(int idx, int end) {
		// 기저 파트
		if (idx == end) {
			return;
		}
		// 유도 파트
		// 자기 단계에서 처리할 일을 처리하고
		// 나머지 일은 다음 부분 문제에게 위임한다.
		System.out.println(idx);
		rf(idx + 1, end);
	}
}
