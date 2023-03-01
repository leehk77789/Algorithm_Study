import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		// 사람수 입력받기
		int num = sc.nextInt();
		// 배열 만들기
		int[] arr = new int[num];
		// 사람수 만큼 배열 입력받기
		for (int idx=0; idx<num; idx++) {
			arr[idx]=sc.nextInt();
		}
		// 정렬하기, 그래야 적게 시간이 합산 되므로
		Arrays.sort(arr);
		// 값을 구하기 위한 변수
		int total=0;
		int p=0;
		// 합산 하기
		for (int idx=0; idx<num; idx++) {
			p+=arr[idx];
			total += p;
		}
		// 출력
		System.out.println(total);
		sc.close();
	}
}