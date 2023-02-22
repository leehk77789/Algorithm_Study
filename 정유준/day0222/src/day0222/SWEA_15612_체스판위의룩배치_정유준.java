package day0222;

import java.util.HashSet;
import java.util.Scanner;

public class SWEA_15612_체스판위의룩배치_정유준 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		for (int idx = 1; idx <= testCase; idx++) {
			char[][] chessPan = new char[8][8];
			HashSet<Integer> chessCol = new HashSet<>();
			HashSet<Integer> chessRow = new HashSet<>();
			int chessIdx = 0;
			// 입력
			for (int i = 0; i < 8; i++) {
				String str = sc.next();
				for (int j = 0; j < 8; j++) {
					chessPan[i][j] = str.charAt(j);
				}
			}

			// O를 발견한다면 해당 좌표를 col, row의 1차원 배열에 넣는다.
			outer: for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					if (chessPan[i][j] == 'O') {
						if (chessCol.contains(i) || chessRow.contains(j)) {
							break outer;
						}
						chessCol.add(i);
						chessRow.add(j);
					}
				}
			}

			if (chessCol.size() == 8 && chessRow.size() == 8) {
				System.out.println("#" + idx + " " + "yes");
			} else {
				System.out.println("#" + idx + " " + "no");
			}
		}
	}
}
