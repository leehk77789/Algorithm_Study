package test02;

import java.util.PriorityQueue;

public class Test1 {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		pq.offer(100);
		pq.offer(2);
		pq.offer(31);

		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
	}
}
