package day0305;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_13301_타일장식물_정유준 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int amount = sc.nextInt();

		ArrayList<Long> length = new ArrayList<>();

		length.add((long) 0);
		length.add((long) 1);

		for (int i = 2; i < amount + 2; i++) {
			length.add(length.get(i - 1) + length.get(i - 2));
		}

		long sum = length.get(length.size() - 1) + length.get(length.size() - 2);

		System.out.println(sum * 2);
	}
}
