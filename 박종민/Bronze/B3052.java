import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 나머지가 몇 개 인지 확인할 배열
		int[] arr = new int[42];
		// for문에 받은 수를 42로 나눈 인덱스를 증가
		int get;
		for (int row=0; row<10;row++) {
			get=sc.nextInt();
			arr[get%42]++;
		}
		// arr을 순회하면 0 초과의 인덱스를 카운트해서 	
		int cnt=0;
		for(int row=0; row<42;row++) {
			if(arr[row]>0) {
				cnt++;
			}
		}
		//출력
		System.out.println(cnt);
		sc.close();// 유준이의 좋은 습관을 배우자!
	}
}