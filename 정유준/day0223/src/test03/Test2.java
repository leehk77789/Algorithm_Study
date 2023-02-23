package test03;

import java.util.PriorityQueue;

public class Test2 {

	public static void main(String[] args) {
		PriorityQueue<Test3> pq = new PriorityQueue<>();

		pq.offer(new Test3("김민식", 22));
		pq.offer(new Test3("유태영", 55));
		pq.offer(new Test3("차지은", 17));
		pq.offer(new Test3("신산하", 23));
		pq.offer(new Test3("김두현", 7));

		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
	}
}
