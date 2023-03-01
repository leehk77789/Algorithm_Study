import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 케이크 크기 받기
		int cake = sc.nextInt();
		// 케이크를 가져갔는지 확인하는 배열
		int[] exist = new int[cake];
		// 사람수 받기
		int numPeo = sc.nextInt();
		// for문으로 배열입력
		int[][] info = new int[numPeo][3];// 마지막 col인덱스에 몇 개 가져갔는지 확인
		for (int row = 0; row < numPeo; row++) {
			for (int col = 0; col < 2; col++) {
				info[row][col] = sc.nextInt();
			}
		}
		// 많이 가져갈 사람 찾기
		int largeCake = 0; // 가장 큰 예상 케익을 찾기 위한 변수
		int largeIndex = 0; // 가장 큰 예상 케익을 원하는 사람을 찾을 인덱스 변수
		int realCake = 0; //가장 큰 케익을 찾기 위한 변수
		int realIndex = 0; // 가장 큰 예상 케익을 가져간 사람을 찾는 인덱스 변수
		// 케이크 가져가기, 한 번에 다 찾아 버리자
		for (int row = 0; row < numPeo; row++) {// for문으로 row기준으로 돌리기
			if (largeCake < info[row][1] - info[row][0]) { // 먼저 예상케익이 largeCake보다 크면
				largeCake = info[row][1] - info[row][0]; // 바꿔주기
				largeIndex = row + 1; // 그 사람의 인덱스도 저장, +1 해주기, 인덱스랑 사람 시작 순서가 다르니
			}
			for (int col = info[row][0]-1; col <= info[row][1]-1; col++) { // 이제 진짜 케익 가져가기, 케익의 위치는 1부터 시작하지만 확인하는 배열은 0부터 이므로 -1씩 해줘서 범위 조심해야해
				if (exist[col] == 0) { // 케익 확인 배열에 확인해 보니 0(없으면)이면
					info[row][2]++;// 케익을 가져간 것을 확인할 배열을 올려주고
					exist[col] = 1; // 케익 가져갔는지 확인하는 배열을 0에서 1로 바꿔줌
				}
			}
			if (realCake < info[row][2]) {// col 2번째 인덱스에 가져간 케익의 수가 저장되어 있으니 이것이 지금까지의 가장 많이 가져간 케익보다 크
				realCake = info[row][2]; // 바꿔줍니다
				realIndex = row + 1; // 그 사람의 인덱스도 저장하고요
			}
		}
		// 출력 
		System.out.println(largeIndex);
		System.out.println(realIndex);

		sc.close();// 유준이의 좋은 습관을 배우자!
	}
}