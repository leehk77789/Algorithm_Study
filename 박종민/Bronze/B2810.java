import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 스캐너
		Scanner sc = new Scanner(System.in);
		// 입력값 받기
		int people = sc.nextInt();
		int SCount = 0;
		int LCount = 0;
		// 입력 내용을 String으로 받고 char로 입력
		String line = sc.next();

		char[] cup = new char[people];
		// for문으로 입력
		for (int idx = 0; idx < people; idx++) {
			cup[idx] = line.charAt(idx);
		}
		// S, L에 따라 카운트 올려줌
		for (int idx = 0; idx < people; idx++) {
			if (cup[idx] == 'S') {
				SCount += 1;
			} else if (cup[idx] == 'L') {
				LCount += 1;
			}
		}
		// L이4개가 넘으면 그 때부터 사람을 줄여야 하므로
		if (LCount >= 4) { // 계산
			System.out.println(people - (LCount - 2) / 2);
		} else {
			System.out.println(people);
		}

		sc.close();
	}
}