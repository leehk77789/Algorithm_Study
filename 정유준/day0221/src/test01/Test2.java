package test01;

public class Test2 {

	public static void main(String[] args) {
		System.out.println(fc(5));
	}

	static int fc(int idx) {
		// 기저 파트 : 언제 끝날지?
		if (idx == 1) {
			return 1;
		}
		// 유도 파트
		return idx * fc(idx - 1);
	}
}
