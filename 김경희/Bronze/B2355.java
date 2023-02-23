package bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2355 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(); // String

		StringTokenizer st = new StringTokenizer(s);

		long a = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());

		if (b < a) {
			long tmp = a;
			a = b;
			b = tmp;
		}
		
		long sigma = (a + b) * ((b - a) + 1) / 2;
		
	

		System.out.println(sigma);
	}
}
