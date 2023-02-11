package backJoon;

import java.util.Scanner;

public class B2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int target = sc.nextInt();

		int stackNum = 1;
		int layer = 0;
		boolean goStop = true;
		while (goStop) {

			if (target <= (layer * 6)  + stackNum) {
				goStop = false;
			} else {
				stackNum = ((layer * 6) + stackNum);
				layer++;
			}
		}
		System.out.println(layer+1);
	}
}