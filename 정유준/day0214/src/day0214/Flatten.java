package day0214;

import java.util.Scanner;

public class Flatten {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int idx = 1; idx < 11; idx++) {
			int dump = sc.nextInt();
			
			int[] dumpheight = new int[100];
			
			for(int row = 0; row < 100; row++) {
				dumpheight[row] = sc.nextInt();
			}
			
			while(dump != 0) {
				int maxIdx = 0;
				int minIdx = 0;
				int max = 0;
				int min = 101;
				for(int row = 0; row < 100; row++) {
					if(dumpheight[row] > max) {
						max = dumpheight[row];
						maxIdx = row;
					}
					if(dumpheight[row] < min) {
						min = dumpheight[row];
						minIdx = row;
					}
				}
				dumpheight[maxIdx]--;
				dumpheight[minIdx]++;
				dump--;
			}
			
			int max = 0;
			int min = 101;
			for(int row = 0; row < 100; row++) {
				if(dumpheight[row] > max) {
					max = dumpheight[row];
				}
				if(dumpheight[row] < min) {
					min = dumpheight[row];
				}
			}
			System.out.println("#" + idx + " " + (max-min));
		}
		sc.close();
	}
}
