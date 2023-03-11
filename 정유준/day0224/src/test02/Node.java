package test02;

public class Node {
	public int data; // 데이터
	public Node next; // 다음 노드의 주소값

	public Node(int data) { // 하나의 데이터를 가진 노드를 생성
		this.data = data; // 데이터
		this.next = null; // 다음 노드의 주소
	}
}
