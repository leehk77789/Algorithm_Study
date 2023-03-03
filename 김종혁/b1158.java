package baekjoon;

import java.util.LinkedList;
import java.util.Scanner;

public class b1158 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 요세푸스를 돌릴 사람 수 입력
		int num = sc.nextInt();

		// LinkedList 선언
		LinkedList<Integer> list = new LinkedList<>();

		// LinkedList에 각자 번호 입력
		for (int i = 1; i <= num; i++) {
			list.add(i);
		}

		int idx = sc.nextInt();

		int dda = idx - 1;
		// 한 바퀴 돌고 나서 시작점
		int start = idx - 1;
		// remove될 때마다 변하는 위치를 위한 보정값
		int i = 1;
		// 한 명이 남을 때까지 반복문
		System.out.print("<");
		while (list.size() != 1) {
			// 인덱스 제거
			System.out.print(list.get(dda) + "," + " ");
			list.remove(dda);
			// i칸씩 옮기는 동시에 앞서 제거된 값을 보정하기 위해 -i
			dda = start + idx * i - i;
			// i는 1씩 증가
			i++;
			// dda가 리스트의 사이즈를 넘어갈 시 한 바퀴를 돌았다는 뜻이기에
			if (dda >= list.size()) {
				while (dda >= list.size()) {
					// 시작점은 남은 칸만큼 변경
					start = dda - list.size();
					dda = start;
					// 보정값 초기화
					i = 1;
				}
			}
		}
		System.out.print(list.peek());
		System.out.println(">");
	}

}
