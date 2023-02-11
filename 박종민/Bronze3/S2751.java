package backJoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Silver2751 { // O(nlogn), O(n)써야함
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int num = sc.nextInt();

		ArrayList<Integer> numArr = new ArrayList<>();

		for (int i = 0; i < num; i++) {
			numArr.add(sc.nextInt());
		}

		Collections.sort(numArr);

//		for (int i : numArr) { // 느려서 StringBuilder써야됨
//			System.out.println(i);
//		}
		for(int value : numArr) {
			sb.append(value).append('\n');
		}
		System.out.println(sb);
	}
}
