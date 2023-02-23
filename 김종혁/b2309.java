package baekjoon;

import java.util.Scanner;

public class b2309 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] dwarf = new int[9];
		int total = 0;
		
		for(int i = 0; i < 9; i++) {
			dwarf[i] = sc.nextInt();
			total += dwarf[i];
		}
		
		x : for(int j = 0; j < 9; j++) {
			for(int k = 1+j; k < 9; k++) {
				if(dwarf[j] + dwarf[k] == total - 100) {
					dwarf[j] = 0;
					dwarf[k] = 0;
					break x;
				}
			}
		}
		
		for(int a = 0; a < 9; a++) {
			for(int b = 0; b < 9-1-a; b++) {
				if(dwarf[b] > dwarf[b+1]) {
					int temp = dwarf[b+1];
					dwarf[b+1] = dwarf[b];
					dwarf[b] = temp;
				}
			}
		}
		
		for(int k = 2; k < 9; k++) {
			System.out.println(dwarf[k]);
		}
	}
}
