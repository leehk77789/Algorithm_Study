package test02;

public class Test1 {

	public static void main(String[] args) {
		char[] arr = { '\u0000', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };
		// A = 1 B = 2 C = 3 D = 4 E = 5 F = 6 G = 7 H = 8

		int parent = 1;
		int left = parent * 2;
		int right = parent * 2 + 1;
		System.out.printf("idx: %d, node: %c\n", left, arr[left]);
		System.out.printf("idx: %d, node: %c\n", right, arr[right]);

		int leftChild = 8;
		int parent2 = leftChild / 2;
		System.out.printf("idx: %d, node: %c\n", leftChild, arr[parent2]);

	}
}
