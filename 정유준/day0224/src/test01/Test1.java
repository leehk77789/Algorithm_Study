package test01;

import java.util.LinkedList;

public class Test1 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();

		list.add(1); // add : 가장 뒤에 추가
		list.addLast(2); // addLast : 가장 뒤에 추가
		list.addFirst(3); // addFirst : 가장 앞에 추가
		list.add(2, 4); // 특정 인덱스에 추가
		list.remove(2); // 가장 앞에있는 원소 제거
//		list.removeFirst(); // 가장 앞에있는 원소 제거
//		list.removeLast(); // 가장 뒤에있는 원소 제거

		list.offer(6); // 가장 뒤에 추가
		list.push(7); // 가장 앞에 추가
		list.pop(); // 가장 앞에 있는 원소가 추가된다
		list.add(8);
		list.add(9);
		list.poll(); // 가장 앞에 있는 것이 튀어나옴

		System.out.println(list.size());
		System.out.println(list.isEmpty());
		System.out.println(list);
	}
}
