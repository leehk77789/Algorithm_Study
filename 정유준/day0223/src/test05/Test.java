package test05;

import java.util.LinkedList;
import java.util.Queue;

public class Test {
	static class Person {
		int num;
		int cnt;

		Person(int num, int cnt) {
			this.num = num;
			this.cnt = cnt;
		}
	}

	public static void main(String[] args) {
		int N = 20; // 마이쮸 개수
		int pNum = 1; // 사람 번호

		Queue<Person> q = new LinkedList<Person>();
		// 제일 처음에 1번 사람을 넣고 시작
		// 1번 사람을 제일 처음에 나올 때 마이쮸 한개를 가져감
		q.offer(new Person(pNum, 1));

		while (N > 0) { // 마이쮸가 남아있는 동안
			Person p = q.poll(); // 큐에 첫번째로 있는 사람을 꺼내온다.
			N -= p.cnt; // 큐에서 나왔을 때 마이쮸를 몇개 줄 것인가
			// 1. N > 0
			// 2. N == 0 마이쮸 소진
			// 3. N < 0 마이쮸 소진
			// => 소진시킨 사람이 마이쮸를 가져간 사람
			// 소진될 때의 p.num을 알면 된다.
			if (N <= 0) {
				return p.num;
			} else {// 아직 소진되지 않은 상황
				p.cnt++;
				// 마이쮸를 받은 사람을 다시 q에 넣고
				q.offer(p);
				// 새로운 사람을 추가한다.
				q.offer(new Person(++pNum, 1));
			}
		}
	}
}
