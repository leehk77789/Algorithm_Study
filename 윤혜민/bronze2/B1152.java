package baekjoon;

import java.util.*;

public class B1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<String> words = new ArrayList<>();
		
		while (sc.hasNext()) {
			words.add(sc.next());

		}
		System.out.println(words.size());
	}
}