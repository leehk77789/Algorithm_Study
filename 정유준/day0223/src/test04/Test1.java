package test04;

import java.util.Comparator;
import java.util.PriorityQueue;

import test03.Test3;

public class Test1 {

	public static void main(String[] args) {
		PriorityQueue<Test3> pq = new PriorityQueue<>(new Comparator<Test3>() {

			@Override
			public int compare(Test3 o1, Test3 o2) {
				return o1.age - o2.age;
			}

		});
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
