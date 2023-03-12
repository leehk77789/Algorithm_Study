import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	private static int n;
	private static Queue<Character> VPS;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(bf.readLine());

		for (int tr = 1; tr <= n; tr++) {

			boolean flag = true;

			VPS = new LinkedList<Character>();

			String read = bf.readLine();
			for (int idx = 0; idx < read.length(); idx++) {
				char get = read.charAt(idx);
				if (get == ')') {
					if (VPS.isEmpty()) {
						flag = false;
						break;
					} else if (VPS.poll() != '(') {
						flag = false;
						break;
					}

				} else {
					VPS.offer(get);
				}
			}
			if (!VPS.isEmpty()) {
				flag = false;
			}

			if (flag) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}

}