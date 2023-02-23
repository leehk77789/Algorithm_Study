package baekjoon;

import java.util.Scanner;

public class S2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String croatia = sc.next();
		char[] alpha = croatia.toCharArray();
		int cnt = 0;
		for (int idx = 0; idx < alpha.length; idx++) {
			if (idx + 2 < alpha.length && alpha[idx] == 'd' && alpha[idx + 1] == 'z' && alpha[idx + 2] == '=') { 
				// dz= 뺴내기, 일단 배열범위 확인하기
				
				cnt++;
				idx += 2;
				
				
			} else if (idx + 1 < alpha.length) { 
				// dz= 가 아니다? 이제 lj nj 확인하기
				if ((alpha[idx] == 'l' && alpha[idx + 1] == 'j')
						|| (alpha[idx] == 'n' && alpha[idx + 1] == 'j')) {
					cnt++;
					idx++;
					continue;
				}

				if (alpha[idx] == '=' || alpha[idx] == '-') {
					continue;
				} else
					cnt++;
			} else if (alpha[idx] != '=' && alpha[idx] != '-') { 
				// dz=도 아니고 lj nj다 이니면 걍 =랑 - 만확인하기
				cnt++;
			}
		
		}

		System.out.println(cnt);
	}
}
