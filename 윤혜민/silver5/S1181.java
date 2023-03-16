package baekjoon;

import java.util.*;

public class S1181 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		Set<String> words = new TreeSet<>();

		for (int i = 0; i < N; i++) {
			words.add(sc.next());
		}

		String[] wordList = new String[words.size()];

		Iterator<String> iter = words.iterator();
		int idx = 0;
		while (iter.hasNext()) {
			wordList[idx] = iter.next();
			idx++;
		}

		Arrays.sort(wordList, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		});

		for (int i = 0; i < words.size(); i++) {
			System.out.println(wordList[i]);
		}
	}
}
